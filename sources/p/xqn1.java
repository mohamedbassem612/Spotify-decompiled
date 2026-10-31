package p;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xqn1 {
    public final a6o1 a;
    public boolean b;
    public long c;
    public long d;

    public xqn1(a6o1 a6o1Var) {
        if (a6o1Var != null) {
            this.a = a6o1Var;
        } else {
            bhn0.i("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            eg.m("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.v();
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jV = this.b ? (this.a.v() - this.d) + this.c : this.c;
        long j = jV / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jV / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jV / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jV / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jV / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jV / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jV / timeUnit2.convert(1L, timeUnit)));
        switch (sqn1.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                hhg1.c();
                return null;
        }
        return f4i1.f(str2, " ", str);
    }
}
