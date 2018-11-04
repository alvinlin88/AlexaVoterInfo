package voterinformation.handlers.judge;

import java.util.*;

import com.amazon.ask.model.interfaces.display.*;
import voterinformation.util.votingInfo;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class JudgeIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("JudgeIntent").or(intentName("AMAZON.YesIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        Map<String, String> judgeMap = votingInfo.getInfo();
        Map<String, String> imageMap = votingInfo.getImages();

        String judge = judgeMap.get("Judge");
        String speechText = judge;
        String optionalText = "The 13th Circuit oversees Hillsborough County";
        String imgLink = imageMap.get("Judge");

        Image image = getImage(imgLink);
        Template display = getBodyTemplate3("Versed Voter", speechText, optionalText, image);

        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("Versed Voter", speechText)
                    .addRenderTemplateDirective(display)
                    .withReprompt(speechText)
                    .build();
        } else {
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard("Versed Voter", speechText)
                    .withReprompt(speechText)
                    .build();
        }
    }

    private Template getBodyTemplate3(String title, String speechText, String optionalText, Image image) {
        return BodyTemplate3.builder()
                .withImage(image)
                .withTitle(title)
                .withTextContent(getTextContent(speechText, optionalText))
                .build();
    }

    private TextContent getTextContent(String speechText, String optionalText) {
        return TextContent.builder()
                .withPrimaryText(makeRichText(speechText))
                .withSecondaryText(makeRichText(optionalText))
                .build();
    }

    private RichText makeRichText(String text) {
        return RichText.builder()
                .withText(text)
                .build();
    }

    private Image getImage(String imageUrl) {
        List<ImageInstance> instances = getImageInstance(imageUrl);
        return Image.builder()
                .withSources(instances)
                .build();
    }

    private List<ImageInstance> getImageInstance(String imageUrl) {
        List<ImageInstance> instances = new ArrayList<>();
        ImageInstance instance = ImageInstance.builder()
                .withUrl(imageUrl)
                .build();
        instances.add(instance);
        return instances;
    }
}