package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;

public class DriveCommand extends RunCommand {
    public DriveCommand(Drivetrain driveSubsystem) {
        super(driveSubsystem::drive, driveSubsystem);
    }
}
