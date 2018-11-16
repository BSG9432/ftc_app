package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@Disabled
@TeleOp (name = "Teleop")

public class Teleop extends OpMode {

    public DcMotor topRight;
    public DcMotor backRight;
    public DcMotor topLeft;
    public DcMotor backLeft;

    @Override
    public void init() {
    topRight = hardwareMap.dcMotor.get("topRight");
    backRight = hardwareMap.dcMotor.get("backRight");
    topLeft = hardwareMap.dcMotor.get("topLeft");
    backLeft = hardwareMap.dcMotor.get("backLeft") ;
    }

    @Override
    public void loop() {

        if(Math.abs(gamepad1.right_stick_y)>.1) {
            topRight.setPower(-gamepad1.right_stick_y);
            backRight.setPower(-gamepad1.right_stick_y);
        }
        else {
            topRight.setPower(0);
            backRight.setPower(0);
        }

        if (Math.abs(gamepad1.left_stick_y)>.1){
            topLeft.setPower(gamepad1.left_stick_y);
            backLeft.setPower(gamepad1.left_stick_y);
        }
        else {
            topLeft.setPower(0);
            backLeft.setPower(0);
        }
    }
}
