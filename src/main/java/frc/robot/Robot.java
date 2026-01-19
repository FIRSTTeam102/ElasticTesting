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
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.Topic;

import edu.wpi.first.wpilibj.*;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.util.sendable.SendableBuilderImpl;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;



public class Robot extends TimedRobot {
    private NetworkTableEntry shooterSpeedEntry;

    @Override
    public void robotInit() {
        // Get the "SmartDashboard" table
        NetworkTable table = NetworkTableInstance.getDefault().getTable("SmartDashboard");

        // Create an entry for shooter speed
        shooterSpeedEntry = table.getEntry("Shooter Speed");

        // Set a default value
        shooterSpeedEntry.setDouble(0);
    }

    @Override
    public void teleopPeriodic() {
        // Read the value from the dashboard
        double shooterSpeed = shooterSpeedEntry.getDouble(0);

        
        System.out.println("Shooter Speed: " + shooterSpeed);
    }
}