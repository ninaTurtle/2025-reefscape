// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.IntakeCmd;
import frc.robot.commands.IntakeCmd.IntakeType;
import frc.robot.commands.ShootCmd;
import frc.robot.commands.ShootCmd.ShootType;
import frc.robot.subsystems.AlgaeIntake;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.CoralClaw;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.swerve.CTREConfigs;
import frc.robot.subsystems.swerve.Swerve;

public class RobotContainer {

  // controller declarations
  public static final CommandXboxController m_driverController = new CommandXboxController(0);
  public static final CommandXboxController m_coDriverController = new CommandXboxController(1);

  // subsystem declarations
  public static final Swerve m_swerve = new Swerve();
  public static final CTREConfigs ctreConfigs = new CTREConfigs();
  public static final CoralClaw m_coralClaw = new CoralClaw();
  public static final AlgaeIntake m_algaeIntake = new AlgaeIntake();
  public static final Climber m_climber = new Climber();
  public static final Elevator m_elevator = new Elevator();

  // command declarations
  public static final IntakeCmd CORAL_INTAKE_AUTO = new IntakeCmd(IntakeType.CoralAuto);
  public static final IntakeCmd ALGAE_INTAKE_AUTO = new IntakeCmd(IntakeType.AlgaeAuto);
  public static final IntakeCmd ALGAE_INTAKE_GROUND = new IntakeCmd(IntakeType.AlgaeGround);
  public static final IntakeCmd CORAL_INTAKE_FEEDER = new IntakeCmd(IntakeType.CoralFeeder);
  public static final ShootCmd CORAL_SHOOT_L1 = new ShootCmd(ShootType.CoralL1);
  public static final ShootCmd CORAL_SHOOT_L2 = new ShootCmd(ShootType.CoralL2);
  public static final ShootCmd CORAL_SHOOT_L3 = new ShootCmd(ShootType.CoralL3);
  public static final ShootCmd CORAL_SHOOT_L4 = new ShootCmd(ShootType.CoralL4);
  public static final ShootCmd CORAL_SHOOT_AUTO = new ShootCmd(ShootType.CoralAuto);
  public static final ShootCmd ALGAE_SHOOT_DITCH = new ShootCmd(ShootType.AlgaeDitch);
  public static final ShootCmd ALGAE_SHOOT_NET = new ShootCmd(ShootType.AlgaeNet);
  public static final ShootCmd ALGAE_SHOOT_PROCESSOR = new ShootCmd(ShootType.AlgaeProcessor);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    /**
     * this is an example of how to assign button :
     * m_driverController.a().onTrue(ALGAE_INTAKE_AUTO); (so clean i know)
     */
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
