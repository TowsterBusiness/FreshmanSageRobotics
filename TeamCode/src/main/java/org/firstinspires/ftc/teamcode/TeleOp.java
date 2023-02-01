package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Toggle;

@TeleOp(name="teleop")
public class TeleOP extends LinearOpMode {

    Robot rob;

    @Override
    public void runOpMode() throws InterruptedException {

        rob = new Robot(hardwareMap);
        rob.setWheelZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        

        while (opModeIsActive()) {
            Vector2D joystickVector = new Vector2D(gamepad1.left_stick_x, -gamepad1.left_stick_y);
            double rx = gamepad1.right_stick_x;

            rob.move(joystickVector, rx, true);

            telemetry.update();
        }
    }


}
