import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous (name = "AutoRCrater")
public class AutoRedCrater extends LinearOpMode { //Facing the Crater WORK IN PROGRESS

    public DcMotor topRight;
    public DcMotor backRight;
    public DcMotor topLeft;
    public DcMotor backLeft;

    public DcMotor teamMarker;


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

        teamMarker = hardwareMap.dcMotor.get ("teamMarker");


        waitForStart();//straight

        topRight.setPower(.5);  //straight for .9 seconds
        backRight.setPower(.5);
        topLeft.setPower(-.5);
        backLeft.setPower(-.5);
        sleep(900);

        topRight.setPower(.5);  //point turn
        backRight.setPower(0);
        topLeft.setPower(-.5);
        backLeft.setPower(0);
        sleep(900);

        teamMarker.setPower(-.5); //deposit team marker
        sleep(500);

        teamMarker.setPower(.5); //retract team marker
        sleep(500);






    }
}
