package org.firstinspires.ftc.teamcode;

public class Constants {

    public static final String IMU_NAME = "imu";

    public static final String FL_DRIVE_NAME = "frontleft";
    public static final String FR_DRIVE_NAME = "frontright";
    public static final String BL_DRIVE_NAME = "backleft";
    public static final String BR_DRIVE_NAME = "backright";

    public static final String LEFT_ENCODER_NAME = "frontleft";
    public static final String RIGHT_ENCODER_NAME = "backright";
    public static final String CENTER_ENCODER_NAME = "backleft";

    public static final double DEADWHEEL_DIAMETER_IN = 35 / 25.4;
    public static final double DISTANCE_PER_PULSE = Math.PI * DEADWHEEL_DIAMETER_IN / 8192;
    public static final double TRACKWIDTH_IN = 8.4;
    public static final double CENTER_WHEEL_OFFSET_IN = 2.2;
}
