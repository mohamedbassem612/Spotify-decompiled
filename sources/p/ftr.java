package p;

import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ftr {
    public final yqg a;

    public ftr(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final int a(long j) {
        Calendar calendarD = this.a.d();
        Calendar calendar = (Calendar) calendarD.clone();
        calendar.setTimeInMillis(j * 1000);
        if (calendar.get(0) == calendarD.get(0) && calendar.get(1) == calendarD.get(1) && calendar.get(6) == calendarD.get(6)) {
            return 1;
        }
        if (calendarD.get(1) == calendar.get(1) && calendar.get(6) - calendarD.get(6) == 1) {
            return 3;
        }
        if (calendarD.get(1) == calendar.get(1) && calendarD.get(6) - calendar.get(6) == 1) {
            return 2;
        }
        int i = calendarD.get(6) - calendar.get(6);
        if (calendarD.get(1) != calendar.get(1) || i <= 0 || i > 7) {
            return calendarD.get(1) == calendar.get(1) ? 5 : 6;
        }
        return 4;
    }
}
