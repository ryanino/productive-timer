public class Timer {

    private long startTime, end, endTime, endTimeS, endTimeM, endTimeH;

    public Timer() {

        startTime = 0;
        endTimeS = 0;
        endTimeM = 0;
        endTimeH = 0;
    }

    public void start() {

        startTime = System.currentTimeMillis();
    }

    public void stop() {

        end = System.currentTimeMillis() - startTime;
        System.out.println(end);
        endTime = end / 1000;
        endTimeS = endTime % 60;
        endTimeM = (endTime / 60) % 60;
        endTimeH = (endTime / 3600) % 60;
    }

    public void clear() {

        startTime = 0;
        endTime = 0;
        end = 0;
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
