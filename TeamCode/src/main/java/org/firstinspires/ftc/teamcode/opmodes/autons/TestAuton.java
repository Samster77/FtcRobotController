package org.firstinspires.ftc.teamcode.opmodes.autons;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.OdometrySubsystem;
import com.arcrobotics.ftclib.command.PurePursuitCommand;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.purepursuit.Waypoint;
import com.arcrobotics.ftclib.purepursuit.waypoints.EndWaypoint;
import com.arcrobotics.ftclib.purepursuit.waypoints.GeneralWaypoint;
import com.arcrobotics.ftclib.purepursuit.waypoints.InterruptWaypoint;
import com.arcrobotics.ftclib.purepursuit.waypoints.StartWaypoint;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;

@Autonomous(name="auton", preselectTeleOp="TeleOp")
public class TestAuton extends CommandOpMode {
    private ElapsedTime runtime = new ElapsedTime();

    private Drivetrain drive;
    private OdometrySubsystem odometry;

    Waypoint p1 = new StartWaypoint(0, 0);
    Waypoint p2 = new GeneralWaypoint();
    Waypoint p3 = new EndWaypoint();

    PurePursuitCommand command = new PurePursuitCommand(drive, odometry, p1, p2, p3);

    @Override
    public void initialize() {

        drive = new Drivetrain(hardwareMap, new GamepadEx(gamepad1));
        odometry = new OdometrySubsystem(drive.getOdometry());

        register(drive, odometry);

        schedule(command);

        telemetry.addData("Status", "Initialized");
    }
}
