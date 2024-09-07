package org.firstinspires.ftc.teamcode.opmodes;


import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ConfigurableValues;
import org.firstinspires.ftc.teamcode.Constants;

@TeleOp
public class Test123 extends OpMode {

    MotorEx frontLeft, frontRight, backLeft, backRight;
    GamepadEx gamepad;

    @Override
    public void init() {
        frontLeft = new MotorEx(hardwareMap, Constants.FL_DRIVE_NAME);
        frontRight = new MotorEx(hardwareMap, Constants.FR_DRIVE_NAME);
        backLeft = new MotorEx(hardwareMap, Constants.BL_DRIVE_NAME);
        backRight = new MotorEx(hardwareMap, Constants.BR_DRIVE_NAME);

        gamepad = new GamepadEx(gamepad1);
    }

    @Override
    public void loop() {
        frontLeft.set(ConfigurableValues.frontLeftPower);
        frontRight.set(ConfigurableValues.frontRightPower);
        frontLeft.set(ConfigurableValues.backLeftPower);
        frontLeft.set(ConfigurableValues.backRightPower);
        telemetry.addData("LeftX: ", gamepad.getLeftX());
        telemetry.addData("LeftY: ", gamepad.getLeftY());
        telemetry.addData("RightX: ", gamepad.getRightX());
        telemetry.addData("RightY: ", gamepad.getRightY());
        telemetry.update();
    }
}
