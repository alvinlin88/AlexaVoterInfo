package voterinformation.handlers.apidemo;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.google.api.services.civicinfo.*;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class VotingLocationIntentHandler implements RequestHandler {
    public static final String ADDRESS_KEY = "ADDRESS";
    public static final String ADDRESS_SLOT = "address";

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("VotingLocationIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText;
        String address = (String) input.getAttributesManager().getSessionAttributes().get(ADDRESS_KEY);

        if (address != null && !address.isEmpty()) {
            speechText = String.format("Your address is %s. This is supposed to give you the location for you to vote, but the A P I call has not been implemented yet.", address);
        } else {
            // Since the user's favorite color is not set render an error message.
            speechText =
                    "Error, address is invalid";
        }

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("VotingLocation", speechText)
                .build();
    }
}
