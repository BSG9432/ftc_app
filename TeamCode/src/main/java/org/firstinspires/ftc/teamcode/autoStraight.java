package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Disabled
@Autonomous (name = "autoStraight")

public class autoStraight extends LinearOpMode {

    public DcMotor topRight;
    public DcMotor topLeft;
    public DcMotor backRight;
    public DcMotor backLeft;

    @Override
    public void runOpMode() throws InterruptedException {

        topRight = hardwareMap.dcMotor.get("topRight");
        topLeft = hardwareMap.dcMotor.get("topLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");

        waitForStart();

        topRight.setPower(.5);
        backRight.setPower(.5);
        topLeft.setPower(-.5);
        backLeft.setPower(-.5);
        sleep(2700);

    }
}
