/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author jcannon
 */
public class AdvanceFrisbee extends CommandBase{
    public AdvanceFrisbee(){
        requires(CommandBase.pneumatics);
    }

    protected void initialize() {
        
    }

    protected void execute() {
        CommandBase.pneumatics.advanceFrisbee();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
