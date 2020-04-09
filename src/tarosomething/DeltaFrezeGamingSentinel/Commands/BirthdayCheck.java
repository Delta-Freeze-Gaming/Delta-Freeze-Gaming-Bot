package tarosomething.DeltaFrezeGamingSentinel.Commands;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tarosomething.DeltaFrezeGamingSentinel.Sentinel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BirthdayCheck extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd");
        System.out.println(formatter.format(localDate));
//        String[] birthdays = new String[]{"Apr 08", "Apr 05", "Aug 29", "Jun 21", "May 05", "July 30", "Sep 06", "Oct 15", "May 16"};
//        String[] members = new String[]{"Afraz Hameed", "Jaylene Nguyen", "Danika Pham", "Sam Tran", "CJ Nguyen", "Troy Osborn", "Kelly Choi", "Melanie Kannalikham", "Joshua Manansala"};
// End of Array Alteration for Birthdays

        ArrayList<String> members = new ArrayList<String>();
        members.add("Afraz Hameed");
        members.add("Jaylene Nguyen");
        members.add("Danika Pham");
        members.add("Sam Tran");
        members.add("CJ Nguyen");
        members.add("Troy Osborn");
        members.add("Kelly Choi");
        members.add("Melanie Kannalikham");
        members.add("Joshua Manansala");

        ArrayList<String> birthdays = new ArrayList<String>();
        birthdays.add("Apr 08");
        birthdays.add("Apr 05");
        birthdays.add("Aug 29");
        birthdays.add("Jun 21");
        birthdays.add("May 05");
        birthdays.add("Jul 30");
        birthdays.add("Sep 06");
        birthdays.add("Oct 15");
        birthdays.add("May 16");
//End of alteration of ArrayList
// When adding new new birthdays and members: Add: arraylist.add(value) and arraylist.remove(int index)

        int key = 0;
        int days = 0;
        System.out.print(formatter.format(localDate));
        if (args[0].equalsIgnoreCase(Sentinel.prefix + "BirthdayCheck")) {
            for (String birthday : birthdays) {
                System.out.println(birthday);
                if (formatter.format(localDate).equals(birthday)) {
                    String recipient = members.get(key);
                    System.out.println("The if statement has been triggered! It's " + recipient + "'s birthday!");
                    EmbedBuilder celebration = new EmbedBuilder();
                    celebration.setColor(0x22ff2a);
                    celebration.setTitle(recipient + "'s BIRTHDAY!");
                    celebration.setDescription(recipient + ", thank you SO much for everything you do to help build our community, we hope that today celebrates an additonal fantastic year in your fantastic life!");
                    celebration.setFooter("To: " + recipient + " Love, the Delta Freeze Gaming Crew :)");
                    event.getChannel().sendMessage(celebration.build()).queue();
                    days++;
                }
                System.out.println("The if statement has been skipped");
                key++;
            }
            if (days == 0) {
                EmbedBuilder celebration = new EmbedBuilder();
                celebration.setColor(0x22ff2a);
                celebration.setTitle("Nobody's birthday");
                event.getChannel().sendMessage(celebration.build()).queue();
            }
        }
    }
}
