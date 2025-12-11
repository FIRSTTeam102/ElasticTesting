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
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends TimedRobot {
    private SendableChooser<String> autoProgram;
    private static final String Option1 = "Option1";
    private static final String DoNothing = "Do Nothing";
    private static final String Dancey = "Dance";

    public Robot() {
      autoProgram= new SendableChooser<>();
      autoProgram.setDefaultOption("Option 1", Option1);
      autoProgram.addOption("Do Nothing", DoNothing);
      autoProgram.addOption("Dance", Dancey);
      SmartDashboard.putData("Auto Program", autoProgram);
    }
    





    @Override
    public void teleopPeriodic() {
      System.out.println("Testing:" + autoProgram);
    }

  }