package voterinformation;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import voterinformation.handlers.*;
import voterinformation.handlers.amendment.*;
import voterinformation.handlers.apidemo.MyAddressIsIntent;
import voterinformation.handlers.apidemo.VotingLocationIntentHandler;
import voterinformation.handlers.candidate.*;
import voterinformation.handlers.judge.*;

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
                        new RunningMateIntentHandler(),

                        new JudgeFusonAgeIntentHandler(),
                        new JudgeIntentHandler(),
                        new JudgeMoodyAgeIntentHandler(),
                        new JudgeFusonIntentHandler(),
                        new JudgeMoodySpecialIntentHandler(),
                        new JudgeMoodyIntentHandler(),

                        new MyAddressIsIntent(),
                        new VotingLocationIntentHandler(),

                        new AmendmentIntentHandler(),
                        new AmendmentMeaningIntentHandler(),
                        new AmendmentOpposeIntentHandler(),
                        new AmendmentOppositionReasonIntentHandler(),
                        new AmendmentSupportIntentHandler(),
                        new AmendmentSupportReasonIntentHandler())
                        .build();

    }

    public VoterInformationStreamHandler() {
        super(getSkill());
    }

}
