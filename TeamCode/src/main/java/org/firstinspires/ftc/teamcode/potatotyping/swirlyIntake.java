package org.firstinspires.ftc.teamcode.potatotyping;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;
@TeleOp
public class swirlyIntake extends OpMode{
    private CRServo intakeLeftServo;
    private CRServo intakeRightServo;

    @Override
    public void init() {
        intakeLeftServo = hardwareMap.get(CRServo.class, "intakeLeftServo");
        intakeRightServo = hardwareMap.get(CRServo.class, "intakeRightServo");
    }

    @Override
    public void loop() {
        double intakePower = gamepad1.right_trigger*2;

        if (intakePower>1) {
            intakePower = 1;
        }

        intakeLeftServo.setPower(-intakePower);
        intakeRightServo.setPower(intakePower);
    }
}