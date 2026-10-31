package org.firstinspires.ftc.teamcode.nordicStorm.subsystems;

import static org.firstinspires.ftc.teamcode.nordicStorm.NordicConstants.intakeMotorName;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake extends SubsystemBase {

    private final DcMotorEx intake ;


    public Intake (HardwareMap hardware_map){
        intake = hardware_map.get(DcMotorEx.class,intakeMotorName);
    }
    public void in(){
        intake.setPower(1);
    }
    public void out(){
        intake.setPower(-1);
    }
    public void stop(){
        intake.setPower(0);
    }

}
