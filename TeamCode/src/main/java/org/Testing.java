import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp (name = "Testing")
public class Testing extends OpMode{
    public DcMotor topRight;
    public DcMotor backRight;
    public DcMotor topLeft;
    public DcMotor backLeft;

    public DcMotor teamMarker; //port 0 Expansion Hub 2

    @Override
    public void init() {
        topRight = hardwareMap.dcMotor.get ("topRight");
        backRight = hardwareMap.dcMotor.get ("backRight");
        topLeft = hardwareMap.dcMotor.get ("topLeft");
        backLeft = hardwareMap.dcMotor.get ("backLeft");

        teamMarker = hardwareMap.dcMotor.get ("teamMarker");
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            teamMarker.setPower(-.5);
        }
        else {
            teamMarker.setPower(0);
        }

       // telemetry.addData("Servo Value: ", teamMarker.getPosition() );
        }

    }

