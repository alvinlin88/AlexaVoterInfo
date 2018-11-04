package voterinformation.handlers.apidemo;

import static voterinformation.handlers.apidemo.VotingLocationIntentHandler.ADDRESS_KEY;
import static voterinformation.handlers.apidemo.VotingLocationIntentHandler.ADDRESS_SLOT;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Request;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;
import com.amazon.ask.response.ResponseBuilder;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class MyAddressIsIntent implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("MyAddressIsIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();
        Map<String, Slot> slots = intent.getSlots();

        // Get the color slot from the list of slots.
        Slot addressSlot = slots.get(ADDRESS_SLOT);

        String speechText, repromptText;
        boolean isAskResponse = false;

        // Check for favorite color and create output to user.
        if (addressSlot != null) {
            // Store the user's favorite color in the Session and create response.
            String address = addressSlot.getValue();
            input.getAttributesManager().setSessionAttributes(Collections.singletonMap(ADDRESS_KEY, address));

            speechText =
                    String.format("Your address has been saved. You can ask me your "
                            + "voting location by saying, tell me my voting location.", address);
            repromptText =
                    "You can ask me your voting location by saying, tell me my voting location.";

        } else {
            // Render an error since we don't know what the users favorite color is.
            speechText = "Invalid Address, please try again";
            repromptText =
                    "Invalid Address. You can tell me your address "
                            + "by saying, my address is street number, street, city, state, zip code";
            isAskResponse = true;
        }

        ResponseBuilder responseBuilder = input.getResponseBuilder();

        responseBuilder.withSimpleCard("AddressSession", speechText)
                .withSpeech(speechText)
                .withShouldEndSession(false);

        if (isAskResponse) {
            responseBuilder.withShouldEndSession(false)
                    .withReprompt(repromptText);
        }

        return responseBuilder.build();
    }

}
