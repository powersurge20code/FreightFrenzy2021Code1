package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name="Mecanum Drive")
public class driveMecanum extends LinearOpMode {

    hardWareMap robot = new hardWareMap();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        methods drive = new methods(robot, this);
        telemetry.addData("Robot", "Initialized");
        telemetry.update();

        waitForStart();

        robot.runtime.reset();

        while (opModeIsActive()) {
            drive.Mecanum();

            telemetry.addData("Wheel Power",
                    "front left (%.2f), front right (%.2f), " +

                            "back left (%.2f), back right (%.2f)",
                    robot.fLeft.getPower(), robot.fRight.getPower(),

                    robot.bLeft.getPower(), robot.bRight.getPower());

            telemetry.update();
        }
    }
}