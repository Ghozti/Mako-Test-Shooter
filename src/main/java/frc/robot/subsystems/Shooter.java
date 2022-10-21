// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  CANSparkMax leftNeo = new CANSparkMax(12,MotorType.kBrushless);
  CANSparkMax rightNeo= new CANSparkMax(11,MotorType.kBrushless);
  Joystick joystick = new Joystick(0);

  public Shooter() {

  }

  public void actShooter(){
    if(joystick.getTrigger()){
      leftNeo.set(.50);
      rightNeo.set(-.50);
    }
    else{
      leftNeo.set(0);
      rightNeo.set(0);
    }
  }
  
  public void eject(){
    leftNeo.set(0);
    rightNeo.set(0);
  }

  public void lightEject(){
    leftNeo.set(.3);
    rightNeo.set(.3);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    actShooter();
  }
}
