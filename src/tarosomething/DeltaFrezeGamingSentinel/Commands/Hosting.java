package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Hosting extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"HostingAnnouncement")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Hosting Team Announcement:");
            success.setDescription("Hosting team! Activities has come up with details of upcoming content, please work to familiarize yourselves with the schedule and planning to be ready! :D");
            success.setFooter("Director: Melanie Kannalikham");
            event.getChannel().sendMessage(success.build()).queue();


        } else if (args[0].equalsIgnoreCase(Sentinel.prefix +"HostingUpdate")) {
            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Hosting Team Update:");
            success.setDescription("Hosting team! Please try to ensure that you are aware of all details and ready for shooting! :D");
            success.setFooter("Director: Melanie Kannalikham");
            event.getChannel().sendMessage(success.build()).queue();
        }

    }
}

