package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d4p0 extends r3g1 {
    public final fsp X;
    public final p1f0 Y;
    public final dv4 Z;

    public d4p0(fsp fspVar, p1f0 p1f0Var, dv4 dv4Var) {
        this.X = fspVar;
        this.Y = p1f0Var;
        this.Z = dv4Var;
        x(true);
    }

    public final int g(int i) {
        return (((r3g1) this).e && l4o1.X(D(i))) ? 1 : 0;
    }

    public final void n(int i, w611 w611Var) {
        ((e711) w611Var).E(i, D(i));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        if (i == 0) {
            return this.X.a(viewGroup);
        }
        if (i != 1) {
            hhg1.n(f4i1.c(i, "Unsupported view type: "));
            return null;
        }
        boolean zA = this.Z.a();
        p1f0 p1f0Var = this.Y;
        p1f0Var.getClass();
        return new tij1(((yjj1) p1f0Var.b).a(), (c3s) p1f0Var.c, (w2k1) p1f0Var.e, (gw70) p1f0Var.d, (Scheduler) p1f0Var.f, (qlb) p1f0Var.g, zA, (iac0) p1f0Var.a, (sn4) p1f0Var.h, viewGroup);
    }
}
