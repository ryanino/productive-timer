import java.lang.System;

public class Timer {

    private static long startTime, end, endTime, endTimeMillis, endTimeS, endTimeM, endTimeH;

    public Timer() {

        endTimeS = 0;
        endTimeM = 0;
        endTimeH = 0;
    }

    public void start() {

        startTime = System.currentTimeMillis();
    }

    public void stop() {

        end = System.currentTimeMillis() - startTime;
        endTime = end / 1000;
        endTimeMillis = end % 60;
        endTimeS = endTime % 60;
        endTimeM = (endTime / 60) % 60;
        endTimeH = (endTime / 3600) % 60;
        startTime = 0;
        end = 0;
    }

    public long getMillis() {

        return endTimeMillis;
    }

    public long getSeconds() {

        return endTimeS;
    }

    public long getMinutes() {

        return endTimeM;
    }

    public long getHours() {

        return endTimeH;
    }
}
