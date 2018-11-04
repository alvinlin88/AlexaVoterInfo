package voterinformation.handlers.judge;

import java.util.*;

import com.amazon.ask.model.interfaces.display.*;
import voterinformation.util.votingInfo;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class JudgeMoodyIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("JudgeMoodyIntent").or(intentName("AMAZON.YesIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        Map<String, String> judgeMap = votingInfo.getInfo2();
        String judge = judgeMap.get("Judge");
        String speechText = judge;

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Versed Voter", speechText)
                .withReprompt(speechText)
                .build();

    }
}