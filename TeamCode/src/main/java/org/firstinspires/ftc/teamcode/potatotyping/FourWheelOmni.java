package org.firstinspires.ftc.teamcode.potatotyping;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class FourWheelOmni extends OpMode{

    DcMotor left;
    DcMotor right;
    double leftPower;
    double rightPower;

    public void init() {
        left = hardwareMap.get(DcMotor.class, "leftMotor");
        right = hardwareMap.get(DcMotor.class, "rightMotor");
    }

    public void loop() {

        leftPower = gamepad1.left_stick_y;
        rightPower = -gamepad1.right_stick_y;

        left.setPower(leftPower);
        right.setPower(rightPower);
    }
}
