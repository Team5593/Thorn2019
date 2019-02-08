package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OperatorInterface {
  public XboxController gamepad = new XboxController(0);
  public Button aButton = new JoystickButton(gamepad, 1);
  public Button bButton = new JoystickButton(gamepad, 2);
  public Button xButton = new JoystickButton(gamepad, 3);
  public Button yButton = new JoystickButton(gamepad, 4);
  public Button LBButton = new JoystickButton(gamepad, 5);
  public Button RBButton = new JoystickButton(gamepad, 6);
}
