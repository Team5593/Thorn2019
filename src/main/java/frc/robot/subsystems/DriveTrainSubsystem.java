package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.HumanDrive;

public class DriveTrainSubsystem extends Subsystem {

  private PWMTalonSRX leftMotor = new PWMTalonSRX(0);
  private PWMTalonSRX rightMotor = new PWMTalonSRX(1);
  public DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new HumanDrive());
  }
}
