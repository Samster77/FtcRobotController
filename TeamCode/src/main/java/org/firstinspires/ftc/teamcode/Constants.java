package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.geometry.Translation2d;

public class Constants {

    public static final String IMU_NAME = "imu";

    public static final String FL_DRIVE_NAME = "flDrive";
    public static final String FR_DRIVE_NAME = "frDrive";
    public static final String BL_DRIVE_NAME = "blDrive";
    public static final String BR_DRIVE_NAME = "brDrive";

    public static final double WHEEL_RADIUS_METERS = 2 * 0.0254;
    public static final double WHEEL_CIRCUMFERENCE_METERS = 2 * Math.PI * WHEEL_RADIUS_METERS;
    public static final double WHEELBASE_METERS = 14 * 0.0254;
    public static final double TRACK_WIDTH_METERS = 14 * 0.0254;
    public static final double DRIVE_RATIO = 15;

    public static final Translation2d FL_TRANSLATION = new Translation2d(WHEELBASE_METERS/2, TRACK_WIDTH_METERS /2);
    public static final Translation2d FR_TRANSLATION = new Translation2d(WHEELBASE_METERS/2, -TRACK_WIDTH_METERS /2);
    public static final Translation2d BL_TRANSLATION = new Translation2d(-WHEELBASE_METERS/2, TRACK_WIDTH_METERS /2);
    public static final Translation2d BR_TRANSLATION = new Translation2d(-WHEELBASE_METERS/2, -TRACK_WIDTH_METERS /2);




}
