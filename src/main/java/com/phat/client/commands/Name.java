/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phat.client.commands;

import CLI.CLI;

/**
 *
 * @author Gabriel.Maxfield
 */
public class Name implements ICommand{
    
    @Override
    public String getName() {
        return "Name";
    }

    @Override
    public String response(String[] args) {
       // CLI.setUserName(args[1]);
       //Set to name location thingy^^^
        return "";
    }

    @Override
    public String[] getKeys() {
        return new String[]{"n","name"};
    }
    
}
