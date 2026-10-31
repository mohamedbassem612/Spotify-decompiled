package p;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wp0 implements h0r0 {
    public final Activity a;
    public final qyj b;
    public final los c;
    public final kt91 d;
    public final zp0 e;
    public final a1r0 f;
    public final bq0 g;
    public final jp0 h;
    public final cbr0 i;

    public wp0(Activity activity, qyj qyjVar, los losVar, kt91 kt91Var, zp0 zp0Var, a1r0 a1r0Var, bq0 bq0Var, jp0 jp0Var) {
        this.a = activity;
        this.b = qyjVar;
        this.c = losVar;
        this.d = kt91Var;
        this.e = zp0Var;
        this.f = a1r0Var;
        this.g = bq0Var;
        this.h = jp0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.i = new cbr0(new dbr0[]{new bn70(yon1.C(), nik1.h2, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.i;
    }

    public final p2r0 b() {
        return this.b.a(apo.j(1566674760, new vp0(this, (byte) 2), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1205642651);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new o2(this, (byte) 9);
                x340Var.s0(objT);
            }
            otw.c(this.h, new lo0(this.e, (xu30) objT), null, null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vp0(this, i);
        }
    }
}
