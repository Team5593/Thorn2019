package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OperatorInterface {
  public XboxController gamepad = new XboxController(0);
  public JoystickButton aButton = new JoystickButton(gamepad, 1);
  public JoystickButton bButton = new JoystickButton(gamepad, 2);
  public JoystickButton xButton = new JoystickButton(gamepad, 3);
  public JoystickButton yButton = new JoystickButton(gamepad, 4);
  public JoystickButton lbButton = new JoystickButton(gamepad, 5);
  public JoystickButton rbButton = new JoystickButton(gamepad, 6);
}
