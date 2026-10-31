package p;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tlh0 implements wlh0, ezh0 {
    public final /* synthetic */ qa61 a;
    public final /* synthetic */ m8u0 b;

    public /* synthetic */ tlh0(qa61 qa61Var, m8u0 m8u0Var) {
        this.a = qa61Var;
        this.b = m8u0Var;
    }

    public void a(rlh0 rlh0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        tkh0 tkh0Var = rlh0Var.a;
        if (rlh0Var.p()) {
            m8u0 m8u0Var = rlh0Var.w;
            m8u0 m8u0Var2 = this.b;
            boolean zEquals = Objects.equals(m8u0Var, m8u0Var2);
            qa61 qa61Var = rlh0Var.v;
            qa61 qa61Var2 = this.a;
            boolean zEquals2 = Objects.equals(qa61Var, qa61Var2);
            if (zEquals && zEquals2) {
                return;
            }
            rlh0Var.v = qa61Var2;
            if (zEquals) {
                z = false;
            } else {
                rlh0Var.w = m8u0Var2;
                m8u0 m8u0Var3 = rlh0Var.y;
                m8u0 m8u0VarC = rlh0Var.c(m8u0Var2, rlh0Var.x);
                rlh0Var.y = m8u0VarC;
                z = !m8u0VarC.equals(m8u0Var3);
            }
            if (!zEquals2 || z) {
                bg11 bg11Var = rlh0Var.t;
                bg11 bg11Var2 = rlh0Var.u;
                bg11 bg11VarE = rlh0.E(rlh0Var.s, rlh0Var.r, qa61Var2, rlh0Var.y, rlh0Var.H);
                rlh0Var.t = bg11VarE;
                rlh0Var.u = rlh0.D(bg11VarE, rlh0Var.r, rlh0Var.H, qa61Var2, rlh0Var.y, rlh0Var.o());
                bg11 bg11Var3 = rlh0Var.t;
                bg11Var3.getClass();
                z2 = !z1p1.j(bg11Var3, bg11Var);
                bg11 bg11Var4 = rlh0Var.u;
                bg11Var4.getClass();
                z3 = !z1p1.j(bg11Var4, bg11Var2);
            } else {
                z2 = false;
                z3 = false;
            }
            if (z) {
                rlh0Var.i.h(13, new dlh0(rlh0Var, (byte) 15));
            }
            if (!zEquals2) {
                tkh0Var.getClass();
                dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                tkh0Var.d.f();
            }
            if (z3) {
                tkh0Var.getClass();
                dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                tkh0Var.d.getClass();
            }
            if (z2) {
                tkh0Var.getClass();
                dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                tkh0Var.d.a();
            }
        }
    }

    public void h(hxh0 hxh0Var, int i) {
        hxh0Var.o(i, this.a, this.b);
    }
}
