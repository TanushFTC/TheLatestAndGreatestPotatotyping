package org.firstinspires.ftc.teamcode.potatotyping;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;
@TeleOp
public class workingLauncher extends OpMode{
    private CRServo launcherLeftServo;
    private CRServo launcherRightServo;

    @Override
    public void init() {
        launcherLeftServo = hardwareMap.get(CRServo.class, "launcherLeftServo");
        launcherRightServo = hardwareMap.get(CRServo.class, "launcherRightServo");
    }

    @Override
    public void loop() {
        double launcherPower = gamepad1.left_trigger*2;

        launcherLeftServo.setPower(-launcherPower);
        launcherRightServo.setPower(launcherPower);
    }
}