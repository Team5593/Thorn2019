package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;


public class DropRamp extends TimedCommand {
  public DropRamp(double timeout) {
    super(timeout);
    requires(Robot.rampSubsystem);
  }

  @Override
  protected void initialize() {
    Robot.rampSubsystem.rampSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  @Override
  protected void execute() {
  }

  @Override
  protected void interrupted() {
    end();
  }
}
