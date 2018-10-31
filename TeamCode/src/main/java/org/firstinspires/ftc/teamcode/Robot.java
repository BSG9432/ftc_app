package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.LightSensor;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot {
    //declare motors
    public DcMotor topRight;
    public DcMotor topLeft;
    public DcMotor backRight;
    public DcMotor backLeft;
    //declare servos
    public Servo teamMarkerDump;
    //declare sensors
    public ColorSensor sensorRGB;
    //declare HardwareMap variable
    private HardwareMap hMap;

    public Robot (){ //constructor

    }

    public void init(HardwareMap map) {
        //create hardware map var
        hMap = map;

        //declare motors to hardwareMap
        topRight = hMap.dcMotor.get("topRight");
        topLeft = hMap.dcMotor.get("topLeft");
        backLeft = hMap.dcMotor.get("backLeft");
        backRight = hMap.dcMotor.get("backRight");

        //declare servos to hardwareMap
        teamMarkerDump = hMap.servo.get("teamMarkerDump");

        //declare sensors to hardwareMap
        sensorRGB = hMap.colorSensor.get("sensorRGB");


        topRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        topLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        topLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        //Just safe, REV sets ZeroPowerBehavior to FLOAT automatically
        topRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //left must be flipped (left must be a negative value while right is a positive value when trying to move forward)
        topLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        //to be safe, set right side to FORWARD
        topRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    //Function to go forward when called
    public void goForward(double power){
        topLeft.setPower(power);
        topRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
    }
    //Function to go back (reverse),
    public void goBack(double power){
        topLeft.setPower(-power);
        topRight.setPower(-power);
        backLeft.setPower(-power);
        backRight.setPower(-power);
    }

    public void stop(){
        topLeft.setPower(0);
        topRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    public void turnRight(){

    }

    public void turnLeft(){

    }

}
