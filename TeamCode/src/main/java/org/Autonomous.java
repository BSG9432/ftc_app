import com.disnodeteam.dogecv.CameraViewDisplay;
import com.disnodeteam.dogecv.detectors.roverrukus.GoldAlignDetector;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
//OOOOF IGNORE THIS ONE
@com.qualcomm.robotcore.eventloop.opmode.Autonomous (name = "AutonomousStraight") //OOF IGNORE THIS ONE
public class Autonomous extends LinearOpMode{
    public DcMotor topRight;
    public DcMotor backRight;
    public DcMotor topLeft;
    public DcMotor backLeft;

    public Servo teamMarker;


    @Override
    public void runOpMode() throws InterruptedException {

        topRight = hardwareMap.dcMotor.get ("topRight");
        backRight = hardwareMap.dcMotor.get ("backRight");
        topLeft = hardwareMap.dcMotor.get ("topLeft");
        backLeft = hardwareMap.dcMotor.get ("backLeft");

        topRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        teamMarker = hardwareMap.servo.get ("teamMarker");

        waitForStart();

        topRight.setPower(.5);
        backRight.setPower(.5);
        topLeft.setPower(-.5);
        backLeft.setPower(-.5);
        sleep(3000);


        teamMarker.setPosition(.6);//(h
        sleep(3000);
        teamMarker.setPosition(.3);
        sleep(3000);




    }
}
