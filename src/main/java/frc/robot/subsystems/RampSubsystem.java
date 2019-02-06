package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RampSubsystem extends Subsystem {

  public DoubleSolenoid rampSolenoid = new DoubleSolenoid(2, 3);

  @Override
  public void initDefaultCommand() {
  }
}
