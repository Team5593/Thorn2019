package frc.robot.commands;

//import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class PitchHatch extends Command {
  public PitchHatch(boolean isForwards, double speed) {
    this.isForwards = isForwards;
    this.speed = speed;
    requires(Robot.hatchPanelSubsystem);
  }

  private boolean isForwards;
  private double speed;

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    if(isForwards)
    {
      Robot.hatchPanelSubsystem.pitchMotors.set(speed);
    }
    else
    {
      Robot.hatchPanelSubsystem.pitchMotors.set(-speed);
    }
  }
  
  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.hatchPanelSubsystem.pitchMotors.set(0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}
