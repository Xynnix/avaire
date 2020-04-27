/*
 * Copyright (c) 2018.
 *
 * This file is part of AvaIre.
 *
 * AvaIre is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AvaIre is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AvaIre.  If not, see <https://www.gnu.org/licenses/>.
 *
 *
 */

package com.avairebot.commands.fun;

import com.avairebot.AvaIre;
import com.avairebot.commands.CommandMessage;
import com.avairebot.contracts.commands.Command;
import net.dv8tion.jda.core.Permission;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BonkCommand extends Command {

    public BonkCommand(AvaIre avaire) {
        super(avaire);
    }

    @Override
    public String getName() {
        return "Bonk Command";
    }

    @Override
    public String getDescription() {
        return "I will send a message to say `no horny`";
    }

    @Override
    public List<String> getUsageInstructions() {
        return Collections.singletonList("`:command`");
    }

    @Override
    public List<String> getExampleUsage() {
        return Collections.singletonList("`:command`");
    }

    @Override
    public List<String> getTriggers() {
        return Arrays.asList("horny", "bonk");
    }

@Override
protected Message execute(CommandManager.ParsedCommandInvocation parsedCommandInvocation, UserPermissions userPermissions) {
    //Returns a Message with Embed included
    return new MessageBuilder().setEmbed(new EmbedBuilder()
            .setDescription("No Horny!\n<:1bonk:704194481536368693><:2bonk:704194494119280652>")
            .setColor(Colors.COLOR_PRIMARY)
            .build()).build();
}
}
