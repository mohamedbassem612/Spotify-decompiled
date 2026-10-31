package p;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t90 {
    public final gap a;
    public final d0r b;
    public final hap c;
    public final iap d;
    public final jap e;
    public final kap f;
    public final bzo g;
    public final w6e0 h;
    public final d771 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final m90 m;

    public t90(gap gapVar, d0r d0rVar, hap hapVar, iap iapVar, jap japVar, kap kapVar, bzo bzoVar, w6e0 w6e0Var, d771 d771Var, boolean z, boolean z2, boolean z3) {
        this.a = gapVar;
        this.b = d0rVar;
        this.c = hapVar;
        this.d = iapVar;
        this.e = japVar;
        this.f = kapVar;
        this.g = bzoVar;
        this.h = w6e0Var;
        this.i = d771Var;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z ? new m90(this, (byte) 17) : null;
    }

    public static wzq a(t90 t90Var) {
        kap kapVar = t90Var.f;
        d0r d0rVar = t90Var.b;
        nap napVar = (nap) kapVar.a.c;
        return new wzq(new efm(d0rVar, (Integer) null, napVar.m, napVar.l), ft.Q0);
    }

    public static qtw e(y1c1 y1c1Var, laa laaVar, laa laaVar2) {
        zob1 zob1VarU = ((w2c1) y1c1Var).U(jko.class);
        return f6o1.A(new umf0(q1o1.u(laaVar, (qim0) null, (FrameLayout.LayoutParams) null, 7), laaVar2 != null ? q1o1.u(laaVar2, (qim0) null, (FrameLayout.LayoutParams) null, 7) : null, new p90(zob1VarU, (byte) 0), !((jko) zob1VarU.getValue()).a), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
    }

    public static ey f(t90 t90Var, String str, vu30 vu30Var, vu30 vu30Var2) {
        if (vu30Var == null && vu30Var2 == null) {
            return null;
        }
        return new ey(t90Var, vu30Var, vu30Var2, str, false);
    }

    public final laa b(y1c1 y1c1Var) {
        ft ftVar = ft.S0;
        boolean z = this.l;
        gap gapVar = this.a;
        d0r d0rVar = this.b;
        if (!z) {
            return new wzq(gapVar.a(d0rVar), ftVar);
        }
        zob1 zob1VarU = ((w2c1) y1c1Var).U(onc1.class);
        nap napVar = (nap) this.c.a.c;
        xzq xzqVar = new xzq(new qlb(d0rVar, napVar.h, napVar.i), ft.T0);
        fqg0 fqg0VarU = q1o1.u(new wzq(gapVar.a(d0rVar), ftVar), (qim0) null, (FrameLayout.LayoutParams) null, 7);
        gk gkVar = new gk(zob1VarU, this, (byte) 1);
        onc1 onc1Var = (onc1) zob1VarU.getValue();
        return f6o1.A(new umf0(xzqVar, fqg0VarU, gkVar, (onc1Var instanceof nnc1) && ((nnc1) onc1Var).a == 3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
    }

    public final wzq c(y1c1 y1c1Var) {
        return new wzq(new qfv(this.b, y1c1Var, ((nap) this.d.a.c).e), ft.U0);
    }

    public final jpg0 d() {
        return new jpg0(this.i.a(), ft.V0);
    }
}
