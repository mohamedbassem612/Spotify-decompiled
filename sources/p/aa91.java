package p;

import android.app.Activity;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aa91 implements h0r0 {
    public static final lik1 i;
    public final Activity a;
    public final qyj b;
    public final los c;
    public final kt91 d;
    public final ca91 e;
    public final a1r0 f;
    public final x991 g;
    public final cbr0 h;

    static {
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        i = oap1.i("spotify:internal:sleep-timer");
    }

    public aa91(Activity activity, qyj qyjVar, los losVar, kt91 kt91Var, ca91 ca91Var, a1r0 a1r0Var, x991 x991Var) {
        this.a = activity;
        this.b = qyjVar;
        this.c = losVar;
        this.d = kt91Var;
        this.e = ca91Var;
        this.f = a1r0Var;
        this.g = x991Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{new bn70(yon1.Z0(), i, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(-484562737, new z991(this), true));
    }

    public final void c(b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-338548515);
        int i3 = (x340Var.i(this) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            ca91 ca91Var = this.e;
            String strC = ca91Var.c();
            d991 d991VarA = ca91Var.a();
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new d781(this, (byte) 24);
                x340Var.s0(objT);
            }
            otw.c(this.g, new v991(strC, d991VarA, (iu30) objT), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z991(this, i2);
        }
    }
}
