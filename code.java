// copy paste the code

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "motor1")
public class Tutorial extends LinearOpMode
{
    DcMotor motor;

    @Override
    public void runOpMode() throws InterruptedException {
        motor = hardwareMap.get(DcMotor.class, "motor1");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setTargetPosition(2000);
        telemetry.addLine(String.valueOf(motor.getCurrentPosition()));
        telemetry.addLine(String.valueOf(motor.getTargetPosition()));
        telemetry.update();
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Thread.sleep(1000);
        telemetry.addLine(String.valueOf(motor.getMode()));
        telemetry.update();
        motor.setPower(1);
        waitForStart();
    }
}
