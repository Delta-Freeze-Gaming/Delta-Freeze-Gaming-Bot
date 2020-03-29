package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Content extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"ContentAnnouncement")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Content Team Announcement:");
            success.setDescription("Content team! Content has been shot/is going to be shot! Please work to edit, trim, and/or manage the content! :D");
            success.setFooter("Director: Joshua Manansala  Manager: Kelly Choi");
            event.getChannel().sendMessage(success.build()).queue();


        } else if (args[0].equalsIgnoreCase(Sentinel.prefix +"ContentUpdate")) {
            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Content Team Update:");
            success.setDescription("Content team! Please try to ensure that all of the content is almost finished soon! :D");
            success.setFooter("Director: Joshua Manansala  Manager: Kelly Choi");
            event.getChannel().sendMessage(success.build()).queue();


        }

    }
}
