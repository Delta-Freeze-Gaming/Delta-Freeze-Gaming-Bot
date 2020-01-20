package tarosomething.DeltaFrezeGamingSentinel;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import tarosomething.DeltaFrezeGamingSentinel.Commands.Clear;

import javax.security.auth.login.LoginException;

public class Sentinel {
    public static JDA jda;
    public static String prefix = "D";

    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder(AccountType.BOT).setToken("NjYyMDEyNzc5NTI3NjY3NzMy.Xh6ibA.7L_kFExtsVxvM06BPRl6aKyrpFA").build();
        //Never push the actual full code!
        jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
        jda.getPresence().setActivity(Activity.playing("Bot Pit Crew"));

jda.addEventListener(new Clear());

    }
}
