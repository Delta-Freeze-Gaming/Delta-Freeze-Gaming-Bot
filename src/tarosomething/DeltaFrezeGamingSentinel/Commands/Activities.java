package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Activities extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"ActivitiesAnnouncement")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Activities Announcement:");
            success.setDescription("Activities Team! We are ready to start planning! Please have all details of plans, scheduling, dates, etc that's needed ready by Business and Hosting's day of action! :D");
            success.setFooter("Director: Sam Tran");
            event.getChannel().sendMessage(success.build()).queue();


        } else if (args[0].equalsIgnoreCase(Sentinel.prefix +"ActivitiesUpdate")) {
            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Activities Update:");
            success.setDescription("Activities Team! Please try to ensure that all of the activity details are finished soon! :D");
            success.setFooter("Director: Sam Tran");
            event.getChannel().sendMessage(success.build()).queue();
        }

    }
}
