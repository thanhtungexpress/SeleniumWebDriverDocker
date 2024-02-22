package seldocker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author CHIRAG
 *
 */
public class CommonMethods {

	public static void runTerminalCommand(String command, String logText)
	{
		try {
            String path = System.getProperty("user.dir");
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"" + path + "\" && " + command);
			
			//ProcessBuilder builder = new ProcessBuilder("sh", "-c", "cd \"" + path + "\" && " + command);

            builder.redirectErrorStream(true);
            Process p = builder.start();
            System.out.println("builder successful");
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line != null) {
					if (line.contains(logText)) {
						System.out.println(line);
						break;
					}
				}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
}
