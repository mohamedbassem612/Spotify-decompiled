package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uks0 extends qwl1 {
    public uks0(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        vwl1 vwl1Var = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            qs10.a().getClass();
        }
        vwl1Var.d(millis < 900000 ? 900000L : millis, millis < 900000 ? 900000L : millis);
    }

    @Override // p.qwl1
    public final rwl1 c() {
        if (this.a && this.c.j.d) {
            hhg1.n("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        vwl1 vwl1Var = this.c;
        if (!vwl1Var.q) {
            return new vks0(this.b, vwl1Var, this.d);
        }
        hhg1.n("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // p.qwl1
    public final qwl1 d() {
        return this;
    }
}
