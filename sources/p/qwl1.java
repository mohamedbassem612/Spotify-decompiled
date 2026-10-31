package p;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class qwl1 {
    public boolean a;
    public UUID b = UUID.randomUUID();
    public vwl1 c;
    public final Set d;

    public qwl1(Class cls) {
        this.c = new vwl1(this.b.toString(), (wvl1) null, cls.getName(), (String) null, (ewq) null, (ewq) null, 0L, 0L, 0L, (gjl) null, 0, (h0a) null, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.d = dm61.w0(new String[]{cls.getName()});
    }

    public final qwl1 a(String str) {
        this.d.add(str);
        return d();
    }

    public final rwl1 b() {
        rwl1 rwl1VarC = c();
        gjl gjlVar = this.c.j;
        boolean z = !gjlVar.i.isEmpty() || gjlVar.e || gjlVar.c || gjlVar.d;
        vwl1 vwl1Var = this.c;
        if (vwl1Var.q) {
            if (z) {
                hhg1.n("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (vwl1Var.g > 0) {
                hhg1.n("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = vwl1Var.x;
        if (str == null) {
            vwl1Var.x = ulc.h(vwl1Var.c);
        } else if (str.length() > 127) {
            this.c.x = ihc1.c1(127, str);
        }
        g(UUID.randomUUID());
        return rwl1VarC;
    }

    public rwl1 c() {
        if (!this.a || !this.c.j.d) {
            return new diq0(this.b, this.c, this.d);
        }
        hhg1.n("Cannot set backoff criteria on an idle mode job");
        return null;
    }

    public final qwl1 e(long j, TimeUnit timeUnit) {
        this.a = true;
        vwl1 vwl1Var = this.c;
        vwl1Var.l = h0a.a;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            qs10.a().getClass();
        }
        if (millis < 10000) {
            qs10.a().getClass();
        }
        vwl1Var.m = yoi1.r(millis, 10000L, 18000000L);
        return d();
    }

    public final qwl1 f(gjl gjlVar) {
        this.c.j = gjlVar;
        return d();
    }

    public final qwl1 g(UUID uuid) {
        this.b = uuid;
        String string = uuid.toString();
        vwl1 vwl1Var = this.c;
        this.c = new vwl1(string, vwl1Var.b, vwl1Var.c, vwl1Var.d, new ewq(vwl1Var.e), new ewq(vwl1Var.f), vwl1Var.g, vwl1Var.h, vwl1Var.i, new gjl(vwl1Var.j), vwl1Var.k, vwl1Var.l, vwl1Var.m, vwl1Var.n, vwl1Var.o, vwl1Var.f128p, vwl1Var.q, vwl1Var.r, vwl1Var.s, vwl1Var.u, vwl1Var.v, vwl1Var.w, vwl1Var.x, vwl1Var.y, 524288);
        return d();
    }

    public final qwl1 h(long j, TimeUnit timeUnit) {
        this.c.g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
            return d();
        }
        hhg1.n("The given initial delay is too large and will cause an overflow!");
        return null;
    }

    public final qwl1 i(ewq ewqVar) {
        this.c.e = ewqVar;
        return d();
    }

    public qwl1 d() {
        return this;
    }
}
