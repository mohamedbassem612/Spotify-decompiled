package p;

import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vlh0 implements wlh0, ezh0, e2i0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ vlh0(Bundle bundle, byte b) {
        this.a = b;
        this.b = bundle;
    }

    public void a(rlh0 rlh0Var) {
        if (rlh0Var.p()) {
            bg11 bg11Var = rlh0Var.t;
            bg11 bg11Var2 = rlh0Var.u;
            Bundle bundle = this.b;
            rlh0Var.H = bundle;
            bg11 bg11VarE = rlh0.E(rlh0Var.s, rlh0Var.r, rlh0Var.v, rlh0Var.y, bundle);
            rlh0Var.t = bg11VarE;
            rlh0Var.u = rlh0.D(bg11VarE, rlh0Var.r, rlh0Var.H, rlh0Var.v, rlh0Var.y, rlh0Var.o());
            bg11 bg11Var3 = rlh0Var.t;
            bg11Var3.getClass();
            boolean zJ = z1p1.j(bg11Var3, bg11Var);
            bg11 bg11Var4 = rlh0Var.u;
            bg11Var4.getClass();
            z1p1.j(bg11Var4, bg11Var2);
            tkh0 tkh0Var = rlh0Var.a;
            tkh0Var.getClass();
            dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
            skh0 skh0Var = tkh0Var.d;
            skh0Var.getClass();
            if (zJ) {
                return;
            }
            skh0Var.a();
        }
    }

    public void h(hxh0 hxh0Var, int i) {
        hxh0Var.k(i, this.b);
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        byte b = this.a;
        Bundle bundle = this.b;
        switch (b) {
            case 2:
                try {
                    return fzh0Var.r(ixh0Var, b380.t(yoh0.b(ixh0Var.c, bundle)));
                } catch (RuntimeException e) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e);
                    return new c280(e);
                }
            case 3:
                try {
                    return fzh0Var.r(ixh0Var, b380.t(yoh0.b(ixh0Var.c, bundle)));
                } catch (RuntimeException e2) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e2);
                    return new c280(e2);
                }
            case 4:
                try {
                    return fzh0Var.r(ixh0Var, b380.t(yoh0.b(ixh0Var.c, bundle)));
                } catch (RuntimeException e3) {
                    oon1.I("Ignoring malformed Bundle for MediaItem", e3);
                    return new c280(e3);
                }
            default:
                try {
                    tqh0 tqh0VarB = tqh0.b(ixh0Var.c, bundle);
                    fzh0Var.C();
                    fzh0Var.t.i0(tqh0VarB);
                    return fc11.J(new ch61(0));
                } catch (RuntimeException e4) {
                    oon1.I("Ignoring malformed Bundle for MediaMetadata", e4);
                    return new c280(e4);
                }
        }
    }
}
