package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot {
    public DcMotor backLeftDrive;
    public DcMotor backRightDrive;
    public DcMotor frontLeftDrive;
    public DcMotor frontRightDrive;

    public Servo verticalClawServo;
    public Servo horizontalClawServo;
    public Servo rotatingServo;

    public DcMotor verticalSlide;
    public DcMotor horizontalSlide;

    public Robot(HardwareMap hardwareMap) {

        // Wheel Initializations
        backLeftDrive = hardwareMap.get(DcMotor.class, "backleftDrive");
        backRightDrive = hardwareMap.get(DcMotor.class, "backrightDrive");
        frontLeftDrive = hardwareMap.get(DcMotor.class, "frontleftDrive");
        frontRightDrive = hardwareMap.get(DcMotor.class, "frontrightDrive");
        verticalSlide = hardwareMap.get(DcMotor.class, "vSlide");
        horizontalSlide = hardwareMap.get(DcMotor.class, "hSlide");

        backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        backRightDrive.setDirection(DcMotor.Direction.FORWARD);
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);

//        verticalSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        horizontalSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        backLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        verticalSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        horizontalSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        backLeftDrive.setTargetPosition(0);
        backRightDrive.setTargetPosition(0);
        frontRightDrive.setTargetPosition(0);
        frontLeftDrive.setTargetPosition(0);
        verticalSlide.setTargetPosition(0);
        horizontalSlide.setTargetPosition(0);

        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        verticalSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        horizontalSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        double powerVar = 0.3;
        //This turns on the chassis motors
        frontLeftDrive.setPower(powerVar);
        frontRightDrive.setPower(powerVar);
        backLeftDrive.setPower(powerVar);
        backRightDrive.setPower(powerVar);
        verticalSlide.setPower(powerVar);
        horizontalSlide.setPower(powerVar);
    }

    public void setWheelZeroPowerBehavior(DcMotor.ZeroPowerBehavior input) {
        frontLeftDrive.setZeroPowerBehavior(input);
        frontRightDrive.setZeroPowerBehavior(input);
        backLeftDrive.setZeroPowerBehavior(input);
        backRightDrive.setZeroPowerBehavior(input);
    }

    public void forward(Integer input){
        backLeftDrive.setTargetPosition(backLeftDrive.getCurrentPosition()+input);
        backRightDrive.setTargetPosition(backRightDrive.getCurrentPosition()+input);
        frontLeftDrive.setTargetPosition(frontLeftDrive.getCurrentPosition()+input);
        frontRightDrive.setTargetPosition(frontRightDrive.getCurrentPosition()+input);
    }
    public void backward(Integer input){
        backLeftDrive.setTargetPosition(backLeftDrive.getCurrentPosition()-input);
        backRightDrive.setTargetPosition(backRightDrive.getCurrentPosition()-input);
        frontLeftDrive.setTargetPosition(frontLeftDrive.getCurrentPosition()-input);
        frontRightDrive.setTargetPosition(frontRightDrive.getCurrentPosition()-input);
    }
    public void right(Integer input){
        backLeftDrive.setTargetPosition(backLeftDrive.getCurrentPosition()-input);
        backRightDrive.setTargetPosition(backRightDrive.getCurrentPosition()+input);
        frontLeftDrive.setTargetPosition(frontLeftDrive.getCurrentPosition()+input);
        frontRightDrive.setTargetPosition(frontRightDrive.getCurrentPosition()-input);
    }
    public void left(Integer input){
        backLeftDrive.setTargetPosition(backLeftDrive.getCurrentPosition()+input);
        backRightDrive.setTargetPosition(backRightDrive.getCurrentPosition()-input);
        frontLeftDrive.setTargetPosition(frontLeftDrive.getCurrentPosition()-input);
        frontRightDrive.setTargetPosition(frontRightDrive.getCurrentPosition()+input);
    }
    public void rightTurn(Integer input){
        backLeftDrive.setTargetPosition(backLeftDrive.getCurrentPosition()+input);
        backRightDrive.setTargetPosition(backRightDrive.getCurrentPosition()-input);
        frontLeftDrive.setTargetPosition(frontLeftDrive.getCurrentPosition()+input);
        frontRightDrive.setTargetPosition(frontRightDrive.getCurrentPosition()-input);
    }
    public void leftTurn(Integer input){
        backLeftDrive.setTargetPosition(backLeftDrive.getCurrentPosition()-input);
        backRightDrive.setTargetPosition(backRightDrive.getCurrentPosition()+input);
        frontLeftDrive.setTargetPosition(frontLeftDrive.getCurrentPosition()-input);
        frontRightDrive.setTargetPosition(frontRightDrive.getCurrentPosition()+input);
    }
    public void setHorizontalSlide(Integer input) {
        horizontalSlide.setTargetPosition(horizontalSlide.getCurrentPosition()+input);
    }
    public void setVerticalSlide(Integer input) {
        verticalSlide.setTargetPosition(verticalSlide.getCurrentPosition()+input);
    }
}
