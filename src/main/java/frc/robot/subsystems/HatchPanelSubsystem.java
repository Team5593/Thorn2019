package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchPanelSubsystem extends Subsystem {

  public DoubleSolenoid releaseSolenoid = new DoubleSolenoid(0, 1);
  public PWMTalonSRX leftPitch = new PWMTalonSRX(2);
  public PWMTalonSRX rightPitch = new PWMTalonSRX(3);

  @Override
  public void initDefaultCommand() {
  }
}
