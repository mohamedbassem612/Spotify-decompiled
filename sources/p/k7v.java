package p;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k7v {
    public int a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public k7v(isd1 isd1Var, int i, long j) {
        this.a = i;
        this.b = TimeUnit.MINUTES.toNanos(j);
        this.c = isd1Var.d();
        this.d = new ydu((byte) 1, this, l1d.n(z4n1.b, " ConnectionPool connection closer", new StringBuilder()));
        this.e = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        hhg1.f(l1d.l(j, "keepAliveDuration <= 0: "));
        throw null;
    }

    public int a(kf01 kf01Var, long j) {
        TimeZone timeZone = z4n1.a;
        ArrayList arrayList = kf01Var.q;
        int i = 0;
        while (i < arrayList.size()) {
            hf01 hf01Var = (Reference) arrayList.get(i);
            if (hf01Var.get() != null) {
                i++;
            } else {
                String str = "A connection to " + kf01Var.c.a.h + " was leaked. Did you forget to close a response body?";
                nct0 nct0Var = nct0.a;
                nct0.a.j(hf01Var.a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    kf01Var.r = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public k7v() {
        this.b = 0L;
        this.a = 0;
        this.e = new vid();
    }
}
