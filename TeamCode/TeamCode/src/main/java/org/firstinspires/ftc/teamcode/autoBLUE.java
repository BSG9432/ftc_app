package org.firstinspires.ftc.teamcode;

import com.disnodeteam.dogecv.CameraViewDisplay;
import com.disnodeteam.dogecv.detectors.roverrukus.GoldAlignDetector;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous (name = "autoBLUE")
public class autoBLUE extends LinearOpMode {
    public DcMotor topRight;
    public DcMotor topLeft;
    public DcMotor backRight;
    public DcMotor backLeft;
    public Servo teamMarker;

    //private GoldAlignDetector detector;

    @Override
    public void runOpMode() throws InterruptedException {
        topRight = hardwareMap.dcMotor.get("topRight");
        topLeft = hardwareMap.dcMotor.get("topLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        topRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        teamMarker = hardwareMap.servo.get("teamMarker");

       /* detector = new GoldAlignDetector();
        detector.init(hardwareMap.appContext,CameraViewDisplay.getInstance());

        detector.useDefaults();
        detector.enable();

        detector.getAligned(); */

        waitForStart();

        topRight.setPower(.25);
        backRight.setPower(.25);
        topLeft.setPower(-.25);
        backLeft.setPower(-.25);
        sleep(2000);

        topRight.setPower(-.5);
        backRight.setPower(-.5);
        topLeft.setPower(-.5);
        backLeft.setPower(-.5);
        sleep(1000);

        topRight.setPower(.5);
        backRight.setPower(.5);
        topLeft.setPower(-.5);
        backLeft.setPower(-.5);
        sleep(2700);

        /* teamMarker.setPosition(.6);
        sleep(3000);
        teamMarker.setPosition(.3);
        sleep(3000); */

        topRight.setPower(0);
        topLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }
}

