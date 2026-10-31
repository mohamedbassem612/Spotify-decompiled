package p;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class slh0 implements wlh0, ezh0 {
    public final /* synthetic */ m8u0 a;

    public /* synthetic */ slh0(m8u0 m8u0Var) {
        this.a = m8u0Var;
    }

    public void a(rlh0 rlh0Var) {
        boolean z;
        boolean z2;
        tkh0 tkh0Var = rlh0Var.a;
        if (rlh0Var.p()) {
            m8u0 m8u0Var = rlh0Var.x;
            m8u0 m8u0Var2 = this.a;
            if (Objects.equals(m8u0Var, m8u0Var2)) {
                return;
            }
            rlh0Var.x = m8u0Var2;
            m8u0 m8u0Var3 = rlh0Var.y;
            m8u0 m8u0VarC = rlh0Var.c(rlh0Var.w, m8u0Var2);
            rlh0Var.y = m8u0VarC;
            if (m8u0VarC.equals(m8u0Var3)) {
                z = false;
                z2 = false;
            } else {
                bg11 bg11Var = rlh0Var.t;
                bg11 bg11Var2 = rlh0Var.u;
                bg11 bg11VarE = rlh0.E(rlh0Var.s, rlh0Var.r, rlh0Var.v, rlh0Var.y, rlh0Var.H);
                rlh0Var.t = bg11VarE;
                rlh0Var.u = rlh0.D(bg11VarE, rlh0Var.r, rlh0Var.H, rlh0Var.v, rlh0Var.y, rlh0Var.o());
                bg11 bg11Var3 = rlh0Var.t;
                bg11Var3.getClass();
                z = !z1p1.j(bg11Var3, bg11Var);
                bg11 bg11Var4 = rlh0Var.u;
                bg11Var4.getClass();
                z2 = !z1p1.j(bg11Var4, bg11Var2);
                rlh0Var.i.h(13, new dlh0(rlh0Var, (byte) 16));
            }
            if (z2) {
                tkh0Var.getClass();
                dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                tkh0Var.d.getClass();
            }
            if (z) {
                tkh0Var.getClass();
                dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                tkh0Var.d.a();
            }
        }
    }

    public void h(hxh0 hxh0Var, int i) {
        hxh0Var.l(i, this.a);
    }
}
