package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.HatchPanelSubsystem;
import frc.robot.commands.ReleaseHatchPanel;
import frc.robot.commands.PitchHatch;

public class Robot extends TimedRobot {
  public static DriveTrainSubsystem driveTrainSubsystem = new DriveTrainSubsystem();
  public static HatchPanelSubsystem hatchPanelSubsystem = new HatchPanelSubsystem();
  public static OperatorInterface operatorInterface;

  @Override
  public void robotInit() {
    operatorInterface = new OperatorInterface();
    operatorInterface.aButton.whenPressed(new ReleaseHatchPanel(0.5));
    operatorInterface.startButton.whileHeld(new PitchHatch(true));
    operatorInterface.selectButton.whileHeld(new PitchHatch(false));
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
