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
                //.withSkillId("amzn1.ask.skill.8cfa7801-c46f-4bdd-9d90-dbb4316f9413")
                .build();
    }

    public VoterInformationStreamHandler() {
        super(getSkill());
    }

}
