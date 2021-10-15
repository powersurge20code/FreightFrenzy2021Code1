
package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;



public class methods extends hardWareMap {

    private LinearOpMode opModeObj;

    public hardWareMap robot;

    public methods(hardWareMap hardwaremap, LinearOpMode opMode) {

        robot = hardwaremap;

        opModeObj = opMode;

    }
 /*----------------------------------------Ready for use, do not change-----------------------------------------------------------------------*/
    public void Holonomic() {

        double rightActual;

        if ((Math.atan2(opModeObj.gamepad1.right_stick_x,
                opModeObj.gamepad1.right_stick_y) < Math.PI) &&
                (Math.atan2(opModeObj.gamepad1.right_stick_x,
                        opModeObj.gamepad1.right_stick_y) > 1.57)) {

            rightActual = -(1 - (1 - (Math.hypot(opModeObj.gamepad1.right_stick_x,
                    opModeObj.gamepad1.right_stick_y))));

        } else {

            rightActual = (1 - (1 - (Math.hypot(opModeObj.gamepad1.right_stick_x,
                    opModeObj.gamepad1.right_stick_y))));

        }

        double joyStick = Math.hypot(opModeObj.gamepad1.left_stick_x,
                opModeObj.gamepad1.left_stick_y);

        if ((Math.atan2(opModeObj.gamepad1.left_stick_x,
                opModeObj.gamepad1.left_stick_y) < 1.57) &&
                (Math.atan2(opModeObj.gamepad1.left_stick_x,
                        opModeObj.gamepad1.left_stick_y) > -1.57)) {

            joyStick = -(Math.hypot(opModeObj.gamepad1.left_stick_x,
                    opModeObj.gamepad1.left_stick_y));

        } else {

            joyStick = 0;

        }
        robot.bLeft.setPower(joyStick);

        robot.bRight.setPower(joyStick);

        if (Math.hypot(opModeObj.gamepad1.right_stick_x,
                opModeObj.gamepad1.right_stick_y) == 0) {

            robot.fRight.setPower(joyStick);

            robot.fLeft.setPower(joyStick);

        } else {

            robot.fLeft.setPower(-rightActual);

            robot.fRight.setPower(rightActual);

        }

        if (opModeObj.gamepad1.x) {

            robot.bLeft.setPower(1);

            robot.fLeft.setPower(-1);

        }

        if (opModeObj.gamepad1.b) {

            //   if (Math.atan2(opModeObj.gamepad1.left_stick_x,
            //   opModeObj.gamepad1.left_stick_y) >
        }
    }

    public void Mecanum() {


        double r = Math.hypot(opModeObj.gamepad1.left_stick_x,
                opModeObj.gamepad1.left_stick_y);

        double robotAngle = Math.atan2(-opModeObj.gamepad1.left_stick_y,
                opModeObj.gamepad1.left_stick_x) - Math.PI / 4;

        double rightX = opModeObj.gamepad1.right_stick_x;

        double v1 = r * Math.cos(robotAngle) - rightX;

        double v2 = r * Math.sin(robotAngle) + rightX;

        double v3 = r * Math.sin(robotAngle) - rightX;

        double v4 = r * Math.cos(robotAngle) + rightX;

        if (opModeObj.gamepad1.x) {

            v1 *= 2;

            v2 *= 2;

            v3 *= 2;

            v4 *= 2;

        }

        robot.fLeft.setPower(v1 * 1);

        robot.fRight.setPower(v2 * 1);

        robot.bLeft.setPower(v3 * 1);

        robot.bRight.setPower(v4 * 1);


    }

    /* Extra Option for Mecanum Drive */
    public void TimeDrive(double time, double lx, double ly, double rx) {

        double r = Math.hypot(lx, ly);

        double robotAngle = Math.atan2(-ly, lx) - Math.PI / 4;

        double rightX = rx;

        double v1 = r * Math.cos(robotAngle) - rightX;

        double v2 = r * Math.sin(robotAngle) + rightX;

        double v3 = r * Math.sin(robotAngle) - rightX;

        double v4 = r * Math.cos(robotAngle) + rightX;


        if (opModeObj.gamepad1.x) {

            v1 *= 2;

            v2 *= 2;

            v3 *= 2;

            v4 *= 2;

        }

        robot.fLeft.setPower(v1 * 1);

        robot.fRight.setPower(v2 * 1);

        robot.bLeft.setPower(v3 * 1);

        robot.bRight.setPower(v4 * 1);

        opModeObj.sleep((long) time * 1000);

        robot.fRight.setPower(0);
        robot.fLeft.setPower(0);
        robot.bLeft.setPower(0);
        robot.bRight.setPower(0);
    }/*-----------------------------------------------------Still in Development--------------------------------------------------------------------*/
    public void smartIntake(double power) {
      if(opModeObj.gamepad1.x) {
          robot.intake.setPower(power/2);
      } else if (robot.opmode){

        }

        }
    }
