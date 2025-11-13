public class TimeCalc {
    public static void main(String[] args) {
        int currentHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int currentMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAddBefore = Integer.parseInt(args[1]);
        int hoursToAdd = minutesToAddBefore/60;
        int minutesToAddAfter = minutesToAddBefore%60;
        int minutes = currentMinutes + minutesToAddAfter;
        if (minutes >= 60) {
            hoursToAdd = hoursToAdd + 1;
            minutes = minutes - 60;
        }
        int hours = (currentHours + hoursToAdd)%24;
        if (hours < 10 && minutes < 10) {
            System.out.println("0" + hours + ":" + "0" + minutes);
        } else if (hours < 10 && minutes >= 10) {
            System.out.println("0" + hours + ":" + minutes);
        } else if (hours >= 10 && minutes < 10) {
            System.out.println(hours + ":" + "0" + minutes);
        } else {
            System.out.println(hours + ":" + minutes);
        }
    }
}