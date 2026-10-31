package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mwq implements lwq, f961 {
    public static final long f;
    public static final /* synthetic */ int g = 0;
    public final kly0 a;
    public final llm b;
    public final Object c = new Object();
    public rzq d;
    public boolean e;

    static {
        ytw0 ytw0Var = jfv.b;
        f = fdg1.k0(30, ngv.e);
    }

    public mwq(q8n q8nVar, kly0 kly0Var) {
        this.a = kly0Var;
        this.b = smo1.e(flo1.l(guo1.B(), q8nVar).y(new z8n("DataActionLauncher")));
    }

    public final rzq b() {
        rzq rzqVar;
        synchronized (this.c) {
            if (this.e) {
                rzqVar = null;
            } else {
                rzq rzqVarF = this.d;
                if (rzqVarF == null) {
                    j3r j3rVar = rzq.y;
                    rzqVarF = l2p1.f(((r2r) this.a.get()).a("android-kodiak-datasourcebuilderimpl", a9o.e));
                    this.d = rzqVarF;
                }
                rzqVar = rzqVarF;
            }
        }
        return rzqVar;
    }

    public final void shutdown() {
        rzq rzqVar;
        smo1.p(this.b, (CancellationException) null);
        synchronized (this.c) {
            this.e = true;
            rzqVar = this.d;
            this.d = null;
        }
        if (rzqVar != null) {
            rzqVar.l();
        }
    }

    public final Object getApi() {
        return this;
    }
}
