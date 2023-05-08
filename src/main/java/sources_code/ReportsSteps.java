package sources_code;

import java.io.Console;

public class ReportsSteps {
	
private static boolean isreport;

private ReportsSteps() {
	
	Console console = System.console();
	if (console != null) {
	    console.writer().print("");
	}
}

public static boolean isIsreport() {
	return isreport;
}

public static void setIsreport(boolean isreport) {
	ReportsSteps.isreport = isreport;
}

	

}
