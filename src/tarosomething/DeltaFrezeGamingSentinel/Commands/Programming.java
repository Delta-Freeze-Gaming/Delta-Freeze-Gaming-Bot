package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Programming extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"Programming")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Programming Team Announcement:");
            success.setDescription("Programming team! More commands and alterations with the Delta Freeze Gaming Sentinel are needed! Head onto the GitHub to see any needed tasks! :D");
            success.setFooter("Director: Afraz Hameed");
            event.getChannel().sendMessage(success.build()).queue();


        }

    }
}
