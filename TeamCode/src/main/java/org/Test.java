import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Autonomous")
public class Test extends LinearOpMode {

public DcMotor leftMotor;
public DcMotor rightMotor;
public Servo leftServo;
public Servo rightServo;

    @Override
    public void runOpMode() throws InterruptedException {
    rightMotor = hardwareMap.dcMotor.get("rightMotor");
    leftMotor = hardwareMap.dcMotor.get ("leftMotor");
    leftServo = hardwareMap.servo.get ("leftServo");
    rightServo = hardwareMap.servo.get ("rightServo");
    waitForStart();
    rightMotor.setPower(.5); //moving forward for 4 seconds
    leftMotor.setPower(-.5);
    sleep(4000);

    rightMotor.setPower(-1);//Backward full power
    leftMotor.setPower(1);
    sleep(10000);

    //turn right 2 sec forward 3 seconds left 2 seconds

    rightMotor.setPower(.5);//turn right 2 sec
    leftMotor.setPower(0);
    sleep(2000);

    rightMotor.setPower(.5);//forward 3 sec
    leftMotor.setPower(-.5);
    sleep(3000);

    rightMotor.setPower(0);//left 2 sec
    leftMotor.setPower(-.5);
    sleep(2000);

    //


    }

}
