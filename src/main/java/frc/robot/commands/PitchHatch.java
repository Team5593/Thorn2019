package frc.robot.commands;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class PitchHatch extends Command {
  public PitchHatch(boolean isForwards) {
    this.isForwards = isForwards;
    requires(Robot.hatchPanelSubsystem);
  }

  private boolean isForwards;

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    if(isForwards)
    {
      Robot.hatchPanelSubsystem.leftPitch.set(0.5);
      Robot.hatchPanelSubsystem.rightPitch.set(0.5);
    }
    else
    {
      Robot.hatchPanelSubsystem.leftPitch.set(-0.5);
      Robot.hatchPanelSubsystem.rightPitch.set(-0.5);
    }
  }
  
  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.hatchPanelSubsystem.leftPitch.set(0);
    Robot.hatchPanelSubsystem.rightPitch.set(0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
