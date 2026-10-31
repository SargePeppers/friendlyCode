package org.firstinspires.ftc.teamcode.nordicStorm.subsystems;

import static org.firstinspires.ftc.teamcode.nordicStorm.NordicConstants.NectureShooterMotorName;
import static org.firstinspires.ftc.teamcode.nordicStorm.NordicConstants.PollonShooterMotorName;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Shooter {
    private final DcMotorEx shooterP;
    private final DcMotorEx shooterN;

    public Shooter(HardwareMap hardwaremap){
        shooterP = hardwaremap.get(DcMotorEx.class,PollonShooterMotorName);
        shooterN = hardwaremap.get(DcMotorEx.class,NectureShooterMotorName);
    }

    public void shoot_power(double power){
        shooterP.setPower(power);
        shooterN.setPower(power);
    }
    public void shoot_stop(){
        shooterP.setPower(0);
        shooterN.setPower(0);
    }
}
