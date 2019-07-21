package frc.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.HatchPanelSubsystem;
import frc.robot.subsystems.RampSubsystem;
import frc.robot.commands.ReleaseHatchPanel;
import frc.robot.commands.ResetRamp;
import frc.robot.commands.PitchHatch;
import frc.robot.commands.DropRamp;

public class Robot extends TimedRobot {
  public static DriveTrainSubsystem driveTrainSubsystem = new DriveTrainSubsystem();
  public static HatchPanelSubsystem hatchPanelSubsystem = new HatchPanelSubsystem();
  public static RampSubsystem rampSubsystem = new RampSubsystem();
  public static OperatorInterface operatorInterface = new OperatorInterface();

  @Override
  public void robotInit() {
    CameraServer.getInstance().startAutomaticCapture();
    operatorInterface.aButton.whenPressed(new ReleaseHatchPanel(0.5));
    operatorInterface.lbButton.whileHeld(new PitchHatch(true, 0.5));
    operatorInterface.rbButton.whileHeld(new PitchHatch(false, 0.5));
    operatorInterface.xButton.whileHeld(new DropRamp(0.5));
    operatorInterface.yButton.whileHeld(new ResetRamp(0.5));

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
