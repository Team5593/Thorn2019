package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class HumanDrive extends Command {
  public HumanDrive() {
    requires(Robot.driveTrainSubsystem);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    double BASE_SPEED = 0.6;
    double forwards = -Robot.operatorInterface.gamepad.getRawAxis(1);
    double heading = Robot.operatorInterface.gamepad.getRawAxis(4);
    double throttle = BASE_SPEED;
    throttle += Robot.operatorInterface.gamepad.getRawAxis(3) * (1-BASE_SPEED);
    Robot.driveTrainSubsystem.drive.arcadeDrive(forwards * throttle, heading * throttle);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.driveTrainSubsystem.drive.stopMotor();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
