package voterinformation;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import voterinformation.handlers.*;
import voterinformation.handlers.candidate.*;

public class VoterInformationStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new VoterInformationIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallBackIntentHandler(),

                        new CandidateIntentHandler(),
                        new EnvironmentIntentHandler(),
                        new OpponentIntentHandler(),
                        new GunControlIntentHandler(),
                        new RunningMateIntentHandler())
               .build();
    }

    public VoterInformationStreamHandler() {
        super(getSkill());
    }

}
