// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
  
    public NetworkTable table;

    public String gamePieceMode = "rock";

    @Override
    public void robotInit() {
        SmartDashboard.putString("gamePieceMode", gamePieceMode);
    }

    @Override
    public void robotPeriodic() {
        // Read the value from dashboard (default to current mode if not set)
        String modeFromDashboard = SmartDashboard.getString("gamePieceMode", gamePieceMode);

        // If the mode has changed, update and react
        if (!modeFromDashboard.equals(gamePieceMode)) {
            gamePieceMode = modeFromDashboard;
            System.out.println("Game piece mode changed to: " + gamePieceMode);

           
        }
    }

}

/**
 * let currentMode = "cone"; // default

function toggleMode() {
    currentMode = (currentMode === "cone") ? "cube" : "cone";
    NetworkTables.putValue("/SmartDashboard/gamePieceMode", currentMode);
    updateModeDisplay();
}

function updateModeDisplay() {
    document.getElementById("modeDisplay").innerText = `Mode: ${currentMode}`;
}

// Listen for changes from robot
NetworkTables.addKeyListener("/SmartDashboard/gamePieceMode", (key, value) => {
    currentMode = value;
    updateModeDisplay();
});

// Attach to button
document.getElementById("toggleButton").addEventListener("click", toggleMode);

 */