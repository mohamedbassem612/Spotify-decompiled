package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dxz0 {
    public final xe01 a;

    public dxz0(q8n q8nVar, zwz0 zwz0Var) {
        this.a = d5p1.t(zwz0Var.d(), smo1.e(ha71.A(guo1.B(), q8nVar).y(new z8n("ReachabilityMonitorConnectionApis")).y(new v62((byte) 18))), ey71.a, new twz0(null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static gbl a(uwz0 uwz0Var) throws NoWhenBranchMatchedException {
        if (uwz0Var instanceof swz0) {
            return gbl.f;
        }
        if (uwz0Var instanceof twz0) {
            Set set = ((twz0) uwz0Var).a;
            return (set == null || set.contains(a7o0.b)) ? gbl.t : gbl.X;
        }
        eg.o();
        return null;
    }

    public final gbl b() {
        return a((uwz0) this.a.a.getValue());
    }

    public final Observable c() {
        return yoi1.i(new iib(this.a, this, (byte) 13), o6x.a);
    }

    public final boolean d() {
        return this.a.a.getValue() instanceof twz0;
    }

    public final Observable e() {
        return yoi1.i(new nev0(this.a, (byte) 2), o6x.a);
    }

    public final boolean f() {
        uwz0 uwz0Var = (uwz0) this.a.a.getValue();
        if (!(uwz0Var instanceof swz0)) {
            return false;
        }
        fho0 fho0Var = ((swz0) uwz0Var).a;
        return (fho0Var instanceof eho0) && ((eho0) fho0Var).b;
    }
}
