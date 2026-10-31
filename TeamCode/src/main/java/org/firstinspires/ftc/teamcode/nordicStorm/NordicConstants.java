package org.firstinspires.ftc.teamcode.nordicStorm;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;

public class NordicConstants {
    // All names for the non-drivetrain hardware.

    public static final String intakeMotorName = "intake";
    public static final String PollonShooterMotorName = "ShooterP";
    public static final String NectureShooterMotorName = "ShooterN";
    private static final PoseFactory p = PoseFactory.degrees();
    //public static final Pose redGoalPose = new Pose(137, 140, 0);
    public static final Pose redGoalPose = p.of(24, 24, 0);
    public static final Pose blueGoalPose = new Pose(7, 140, 0);

    public enum AllianceColor {
        RED,
        BLUE
    }
}
