// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.networktables.DoubleTopic;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.Topic;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.util.sendable.SendableBuilderImpl;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;


public class Robot extends TimedRobot {
    private SendableChooser<Float> autoProgram;
    private static final float Option1 = 67;
    private static final float Option2 = 41;
    private static final float Option3 = 21;
    private SendableBuilder inputData;


    public Robot() {
      autoProgram= new SendableChooser<>();
      autoProgram.setDefaultOption("Option 1", Option1);
      autoProgram.addOption("Option2", Option2);
      autoProgram.addOption("Option3", Option3);
      SmartDashboard.putData("Auto Program", autoProgram);
    }
    
    public class InputData implements Sendable {
      private double targetValue =0.0; 


      @Override
      public void initSendable(SendableBuilder builder){
        builder.setSmartDashboardType("InputData");
        builder.addDoubleProperty("Target Setpoint",
        () -> targetValue, //getter
        (val) -> targetValue = val //setter 
        );
        
        //SmartDashboard.putData("User Inputs",inputData);
      }
      }
    





    @Override
    public void teleopPeriodic() {
      System.out.println("Testing:" + autoProgram.getSelected());
    }

     
    
  }