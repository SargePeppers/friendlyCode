package org.firstinspires.ftc.teamcode.opmode.teleop;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.follower.Follower;
import com.pedropathing.math.Pose;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.pedropathing.drivetrain.DrivePowers;
import com.pedropathing.follower.ManualDrive;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.nordicStorm.NordicConstants;
import org.firstinspires.ftc.teamcode.nordicStorm.subsystems.Un_Named;
import org.firstinspires.ftc.teamcode.pedro.Constants;

@TeleOp(name = "Example TeleOp")
public class PedroTeleop extends OpMode {

    private Follower follower;
    private Un_Named grabber;
    private final PoseFactory p = PoseFactory.degrees();
//    private
    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
        grabber = new Un_Named(hardwareMap, NordicConstants.AllianceColor.RED);
        follower.setPose(p.of(9,27.5,0));
    }

    @Override
    public void loop() {
        DrivePowers powers = ManualDrive.fieldCentric(
                -gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                gamepad1.right_stick_x,
                follower.pose().heading()
        );
//        follower.manual(
//                -gamepad1.left_stick_y,
//                gamepad1.left_stick_x,
//                gamepad1.right_stick_x
//        );

        if (gamepad1.left_trigger > .5) {
            grabber.in();
        } else if (gamepad1.left_bumper){
            grabber.out();
        } else if (gamepad1.right_trigger >.5){
            grabber.shoot(gamepad1.right_trigger);
            grabber.in();
        }else {
            grabber.stop();
        }
        if (gamepad1.right_trigger<.5){
            grabber.stop_shooter();
        }

        Pose robotPose = follower.pose();
        telemetry.addData("position x",robotPose.x());
        telemetry.addData("position y",robotPose.y());
        telemetry.addData("position heading",robotPose.heading());

            follower.manual(powers);
            follower.update();
        }

    }
