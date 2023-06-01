package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="camera")
public class TeleOP extends LinearOpMode {

    Robot rob;

    @Override
    public void runOpMode() throws InterruptedException {

        rob = new Robot(hardwareMap);

        waitForStart();
        rob.setWheelZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        while (opModeIsActive()) {

//            int block = 1000;
//            rob.forward((int) (block * 0.5));
//            telemetry.update();


        }
    }


}
