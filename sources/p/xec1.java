package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xec1 implements o590 {
    public final hec1 a;
    public final t2j0 b;
    public final lvw0 c;
    public final Scheduler d;
    public final be e;
    public final ynb0 f;
    public final yqg g;
    public final bas h;

    public xec1(hec1 hec1Var, t2j0 t2j0Var, lvw0 lvw0Var, Scheduler scheduler, be beVar, ynb0 ynb0Var, yqg yqgVar, bas basVar) {
        this.a = hec1Var;
        this.b = t2j0Var;
        this.c = lvw0Var;
        this.d = scheduler;
        this.e = beVar;
        this.f = ynb0Var;
        this.g = yqgVar;
        this.h = basVar;
    }

    @Override // p.o590
    public final spq0 I(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str, lls0 lls0Var) {
        if (!m0u0Var.g()) {
            return j5.a;
        }
        return new i5w0(new wec1(m0u0Var, str, this.a, this.b, this.c, np00Var, this.d, this.h, this.e, ((xl4) this.f.get()).a(), oot0Var.c, lls0Var, this.g));
    }
}
