package voterinformation.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;



public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "You have opened Versed Voter. I can give you information on upcoming elections.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Versed Voter", speechText)
                .withReprompt(speechText)
                .build();
    }
}
