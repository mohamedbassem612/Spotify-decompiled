package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vwn0 implements cyf0 {
    public final yxn0 a;
    public final yun0 b;
    public final hds c;
    public final akr d;
    public final qwn0 e;
    public final twn0 f;
    public final fvn0 g;

    public vwn0(yxn0 yxn0Var, yun0 yun0Var, hds hdsVar, akr akrVar, qwn0 qwn0Var, twn0 twn0Var, fvn0 fvn0Var) {
        this.a = yxn0Var;
        this.b = yun0Var;
        this.c = hdsVar;
        this.d = akrVar;
        this.e = qwn0Var;
        this.f = twn0Var;
        this.g = fvn0Var;
    }

    public final void e(Bundle bundle) {
        xg30 xg30VarA;
        xg30 xg30VarA2;
        Bundle bundle2 = bundle.getBundle("navigation_state");
        if (bundle2 != null) {
            yun0 yun0Var = this.b;
            yun0Var.a();
            xxn0 xxn0VarD = this.a.d(bundle2);
            vun0 vun0Var = xxn0VarD.a;
            yun0Var.b(vun0Var);
            kdn0 kdn0Var = this.e.b;
            xun0 xun0VarH = yun0Var.h();
            kdn0Var.m((xun0VarH == null || (xg30VarA2 = xun0VarH.a()) == null) ? null : xg30VarA2.a);
            yun0Var.o(xxn0VarD.b);
            yun0Var.i().addAll(xxn0VarD.c);
            yun0Var.l().addAll(xxn0VarD.d);
            yun0Var.k();
            this.c.a();
            if (((vun0Var == null || (xg30VarA = vun0Var.a()) == null) ? null : xg30VarA.d) instanceof b6w0) {
                vun0 vun0Var2 = vun0Var instanceof vun0 ? vun0Var : null;
                if (vun0Var2 != null) {
                    this.d.h(vun0Var2.a, vun0Var2.b.c, new n0g0(0, this.f, twn0.class, "onBottomSheetDismissed", "onBottomSheetDismissed$src_main_java_com_spotify_ubi_model_model()V", 0, (byte) 24), new n0g0(0, this.f, twn0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 25));
                }
            }
            xun0 xun0VarH2 = yun0Var.h();
            vun0 vun0Var3 = xun0VarH2 instanceof vun0 ? (vun0) xun0VarH2 : null;
            if (vun0Var3 != null) {
                this.g.a(vun0Var3.a, vun0Var3.b.d instanceof d6w0 ? 5 : 1, false);
            }
        }
    }

    public final void f(Bundle bundle) {
        bundle.putBundle("navigation_state", this.a.f(this.b.c()));
    }
}
