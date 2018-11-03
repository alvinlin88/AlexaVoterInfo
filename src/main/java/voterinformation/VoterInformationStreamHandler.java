package voterinformation;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import voterinformation.handlers.*;

public class VoterInformationStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new VoterInformationIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallBackIntentHandler())
                .withSkillId("amzn1.ask.skill.7372b1ab-853a-40b4-8478-0decb93ff4e2")
                .build();
    }

    public VoterInformationStreamHandler() {
        super(getSkill());
    }

}
