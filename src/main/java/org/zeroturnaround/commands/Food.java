package org.zeroturnaround.commands;

import org.zeroturnaround.skypebot.plugins.NameCommand;

public class Food extends NameCommand {

  public String getHelp() {
    return "gives food";
  }

  @Override
  protected String reactInternal(String conversationName, String author, String message) {
    return "http://paevapraed.com";
  }

}
