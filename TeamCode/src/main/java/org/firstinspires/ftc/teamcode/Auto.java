package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="yes")
public class Auto extends LinearOpMode {



    @Override
    public void runOpMode() throws InterruptedException {



        waitForStart();
        Robot rob = new Robot(hardwareMap);

        rob.setWheelZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        rob.forward(moveBlock(1));
        sleep(2000);
        rob.leftTurn(10000);

        while (opModeIsActive()) {
             telemetry.update();
        }


    }
    private int moveBlock(float coefficiant) {
        int block = 1000;
        return (int) (block * coefficiant);
    }

}
