package org;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.AutoTransitioner;

@Autonomous (name = "AutoCraterStraight")
public class AutoCraterStraight extends LinearOpMode {
    public DcMotor topRight;
    public DcMotor backRight;
    public DcMotor topLeft;
    public DcMotor backLeft;

    public DcMotor teamMarker;
    @Override
    public void runOpMode() throws InterruptedException {
        topRight = hardwareMap.dcMotor.get("topRight");
        backRight = hardwareMap.dcMotor.get("backRight");
        topLeft = hardwareMap.dcMotor.get("topLeft");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        topRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        teamMarker = hardwareMap.dcMotor.get("teamMarker");

        AutoTransitioner.transitionOnStop(this, "Teleop");
        waitForStart();
        topRight.setPower(.5);
        backRight.setPower(.5);
        topLeft.setPower(-.5);
        backLeft.setPower(-.5);
        sleep(5000);

    }
}
