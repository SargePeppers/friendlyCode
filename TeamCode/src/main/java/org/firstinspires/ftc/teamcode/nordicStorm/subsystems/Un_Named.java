package org.firstinspires.ftc.teamcode.nordicStorm.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.nordicStorm.NordicConstants;

public class Un_Named {
    private final Intake intake  ;
    private final Shooter shooter;
    public Un_Named(HardwareMap hardwaremap, NordicConstants.AllianceColor color){
        intake=new Intake(hardwaremap);
        shooter=new Shooter(hardwaremap);
    }
    public void in(){
        intake.in();
    }
    public void out(){
        intake.out();
    }
    public void stop(){
        intake.stop();
    }
    public void shoot(double power){
        shooter.shoot_power(power);
    }
    public void stop_shooter(){
        shooter.shoot_stop();
    }
}
