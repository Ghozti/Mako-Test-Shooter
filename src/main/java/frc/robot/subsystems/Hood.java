// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hood extends SubsystemBase {
  /** Creates a new Hood. */
  public Hood() {
    //We still have no fixed design for this, however we will use one neo motor, Specifically the NEO 550. It is a brushless motor that will use a sparkMAX
    // i will take care of PID stuff, you define the class
  }

  //****************IGNORE THE METHODS BELOW EXCEPT PERIODIC(), THEY ARE FOR THE FUTURE****************

  public void setFenderShot(){

  }

  public void setTaxiLineShot(){

  }

  public void setLaunchPadShot(){

  }

  public void setHome(){

  }

  public void manualAdjust(){
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
