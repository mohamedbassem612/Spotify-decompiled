package p;

import android.icu.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fiv0 {
    public final yqg a;
    public final idd1 b = new idd1(tnt0.U0);
    public final idd1 c = new idd1(new eiv0(this, (byte) 0));
    public final idd1 d = new idd1(new eiv0(this, (byte) 1));
    public final idd1 e = new idd1(new eiv0(this, (byte) 2));

    public fiv0(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final String a(long j) {
        yqg yqgVar = this.a;
        long jB = yqgVar.b();
        Calendar calendarD = yqgVar.d();
        calendarD.setTimeInMillis(j);
        Calendar calendarD2 = yqgVar.d();
        calendarD2.setTimeInMillis(jB);
        if (calendarD.get(1) == calendarD2.get(1)) {
            String str = ((DateFormat) this.d.getValue()).format(Long.valueOf(j));
            str.getClass();
            return str;
        }
        String str2 = ((DateFormat) this.e.getValue()).format(Long.valueOf(j));
        str2.getClass();
        return str2;
    }
}
