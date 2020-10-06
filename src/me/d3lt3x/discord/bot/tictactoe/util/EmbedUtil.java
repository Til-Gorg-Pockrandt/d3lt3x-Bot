package me.d3lt3x.discord.bot.tictactoe.util;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class EmbedUtil {


    public static MessageEmbed messageEmbed(String title, int color, String field[], String value[], boolean inline){

        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(title);
        embedBuilder.setColor(color);

        for (int i=0; i<field.length; i++) {
            embedBuilder.addField(field[i], value[i], inline);
        }

        return embedBuilder.build();
    }


    public static MessageEmbed messageEmbed(String title, int color, String field, String value, boolean inline){

        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(title);
        embedBuilder.setColor(color);

        embedBuilder.addField(field, value, inline);

        return embedBuilder.build();
    }

}