import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "TeleOpAttempt")
public class TeleOpAttempt extends OpMode{
    DcMotor left;
    DcMotor right;

    @Override
    public void init() {
        left = hardwareMap.dcMotor.get ("left");
        right = hardwareMap.dcMotor.get ("right");
    }

    @Override
    public void loop() {


    }
}
