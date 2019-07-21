package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;


public class GrabHatchPanel extends TimedCommand {
  public GrabHatchPanel(double timeout) {
    super(timeout);
    requires(Robot.hatchPanelSubsystem);
  }

  @Override
  protected void initialize() {
    Robot.hatchPanelSubsystem.releaseSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  protected void execute() {
  }


  @Override
  protected void interrupted() {
    end();
  }
}
