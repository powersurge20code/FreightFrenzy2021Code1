
    package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

    class  hardWareMap {

        HardwareMap hwMap = null;

        ElapsedTime runtime = new ElapsedTime();



        public DcMotor fLeft = null;

        public DcMotor fRight = null;

        public DcMotor bLeft = null;

        public DcMotor bRight = null;

        public DcMotor  intake = null;

        //  public DcMotor sh00ter_left = null;

        //  public DcMotor sh00ter_right = null;

        // public Servo knockDown = null;


        /* Constructor */

        public hardWareMap(){

        }



        public void init(HardwareMap ahwMap) {

            hwMap = ahwMap;

            //   knockDown = hwMap.get(Servo.class, "knockDown");

            fLeft = hwMap.get(DcMotor.class, "front_left");

            fRight = hwMap.get(DcMotor.class, "front_right");

            bLeft = hwMap.get(DcMotor.class, "back_left");

            bRight = hwMap.get(DcMotor.class, "back_right");

            // intakeSystem = hwMap.get(DcMotor.class, "intakeSystem");

            //  sh00ter_left = hwMap.get(DcMotor.class, "sh00ter_left");

            //  sh00ter_right = hwMap.get(DcMotor.class, "sh00ter_right");

            //   intakeSystem.setDirection(DcMotor.Direction.REVERSE);

            bRight.setDirection(DcMotor.Direction.FORWARD);

            bLeft.setDirection(DcMotor.Direction.REVERSE);

            fRight.setDirection(DcMotor.Direction.FORWARD);

            fLeft.setDirection(DcMotor.Direction.REVERSE);

            //  sh00ter_right.setDirection(DcMotor.Direction.REVERSE);

            //  sh00ter_left.setDirection(DcMotor.Direction.REVERSE);

            //  sh00ter_left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

            // sh00ter_right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


            fLeft.setPower(0);

            fRight.setPower(0);

            bLeft.setPower(0);

            bRight.setPower(0);

            //   sh00ter_right.setPower(0);

            //  sh00ter_left.setPower(0);

            //  intakeSystem.setPower(0);



        }
    }
