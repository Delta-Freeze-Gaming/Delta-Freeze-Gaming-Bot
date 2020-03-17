package tarosomething.DeltaFrezeGamingSentinel.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

public class Media extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Sentinel.prefix +"MediaAnnouncement")) {

            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Media Team Update:");
            success.setDescription("Media team! Upcoming content has been announced with full details- please contact a Leadership member for any additional details, and please advertise before publishing day! :D");
            success.setFooter("Director: Danika Pham");
            event.getChannel().sendMessage(success.build()).queue();


        } else if (args[0].equalsIgnoreCase(Sentinel.prefix +"MediaUpdate")) {
            EmbedBuilder success = new EmbedBuilder();
            success.setColor(0x22ff2a);
            success.setTitle("Media Team Update:");
            success.setDescription("Media team! The day of action has almost here! Please finalize all advertising on personal pages, the team page, and other social medias for upcoming content! :D");
            success.setFooter("Director: Danika Pham");
            event.getChannel().sendMessage(success.build()).queue();

        }

    }
}
