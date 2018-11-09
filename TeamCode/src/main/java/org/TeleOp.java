import com.disnodeteam.dogecv.CameraViewDisplay;
import com.disnodeteam.dogecv.detectors.roverrukus.GoldAlignDetector;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp (name = "Teleop")//THIS IS THE RIGHT TELE OP
public class TeleOp extends OpMode {
  public DcMotor topLeft;
  public DcMotor backLeft;
  public DcMotor topRight;
  public DcMotor backRight;

  public DcMotor teamMarker;

  //private GoldAlignDetector detector;

    @Override
    public void init() {
        topLeft = hardwareMap.dcMotor.get ("topLeft");
        backLeft = hardwareMap.dcMotor.get ("backLeft");
        topRight = hardwareMap.dcMotor.get ("topRight");
        backRight = hardwareMap.dcMotor.get ("backRight");
        topRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        topLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        teamMarker = hardwareMap.dcMotor.get ("teamMarker");
        //detector = new GoldAlignDetector();
        //detector.init(hardwareMap.appContext, CameraViewDisplay.getInstance());

        //detector.useDefaults();
        //detector.enable();

        //detector.getAligned();
    }

    @Override
    public void loop() {
        if (Math.abs(gamepad1.right_stick_y) > .1) {
            topRight.setPower(-gamepad1.right_stick_y);
            backRight.setPower(-gamepad1.right_stick_y);
        } else {
            topRight.setPower(0);
            backRight.setPower(0);
        }


        if (Math.abs(gamepad1.left_stick_y) > .1) {
            topLeft.setPower(gamepad1.left_stick_y);
            backLeft.setPower(gamepad1.left_stick_y);
        } else {
            topLeft.setPower(0);
            backLeft.setPower(0);
        }




        }
    }
