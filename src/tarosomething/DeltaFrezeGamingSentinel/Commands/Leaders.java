package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Leaders extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"LeadersAnnouncement")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Leadership Team Announcement:");
            success.setDescription("Leadership team! Content has been run through by Activities and Business, please look over all details and verify before we finalize for advertising! :D");
            success.setFooter("Director: Afraz Hameed");
            event.getChannel().sendMessage(success.build()).queue();


        } else if (args[0].equalsIgnoreCase(Sentinel.prefix +"LeadersUpdate")) {
            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Leadership Team Update:");
            success.setDescription("Leadership team! Please try to ensure all details are finalized and ready so Media can start advertising! :D");
            success.setFooter("Director: Afraz Hameed");
            event.getChannel().sendMessage(success.build()).queue();
        }
    }
}
