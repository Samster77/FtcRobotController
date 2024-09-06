package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.Subsystem;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.geometry.Vector2d;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.arcrobotics.ftclib.kinematics.HolonomicOdometry;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants;

import java.util.function.DoubleSupplier;

public class Drivetrain extends MecanumDrive implements Subsystem {
    MecanumDrive mecanum;
    HolonomicOdometry odometry;

    DoubleSupplier forwardCommand;
    DoubleSupplier strafeCommand;
    DoubleSupplier spinCommand;

    public Drivetrain(HardwareMap hwMap, GamepadEx controller) {
        super(
                new MotorEx(hwMap, Constants.FL_DRIVE_NAME),
                new MotorEx(hwMap, Constants.FR_DRIVE_NAME),
                new MotorEx(hwMap, Constants.BL_DRIVE_NAME),
                new MotorEx(hwMap, Constants.BR_DRIVE_NAME)
        );

        MotorEx leftEncoder = new MotorEx(hwMap, Constants.LEFT_ENCODER_NAME);
        MotorEx rightEncoder = new MotorEx(hwMap, Constants.RIGHT_ENCODER_NAME);
        MotorEx centerEncoder = new MotorEx(hwMap, Constants.CENTER_ENCODER_NAME);

        leftEncoder.setDistancePerPulse(Constants.DISTANCE_PER_PULSE);
        rightEncoder.setDistancePerPulse(Constants.DISTANCE_PER_PULSE);
        centerEncoder.setDistancePerPulse(Constants.DISTANCE_PER_PULSE);

        odometry = new HolonomicOdometry(
                leftEncoder::getDistance,
                rightEncoder::getDistance,
                centerEncoder::getDistance,
                Constants.TRACKWIDTH_IN,
                Constants.CENTER_WHEEL_OFFSET_IN
        );

        forwardCommand = controller::getLeftY;
        strafeCommand = controller::getLeftX;
        spinCommand = controller::getRightX;
    }

    public void drive() {
        driveRobotCentric(forwardCommand.getAsDouble(), strafeCommand.getAsDouble(), spinCommand.getAsDouble());
    }

    public HolonomicOdometry getOdometry() {
        return odometry;
    }
}
