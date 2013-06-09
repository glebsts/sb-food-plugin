package org.zeroturnaround.skypebot;

import java.util.Arrays;
import java.util.Collection;

import org.zeroturnaround.commands.Food;
import org.zeroturnaround.skypebot.plugins.BotPlugin;
import org.zeroturnaround.skypebot.plugins.Command;
import org.zeroturnaround.skypebot.plugins.SkypeBotPlugin;


@SkypeBotPlugin
public class FoodPlugin implements BotPlugin {

  @Override
  public Collection<Command> getCommands() {
    return Arrays.asList(new Command[] {
        new Food()
    });
  }

}
