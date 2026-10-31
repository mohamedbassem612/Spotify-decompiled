package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lz5 implements h0r0 {
    public final qyj a;
    public final nz5 b;
    public final pt c;
    public final cbr0 d;

    public lz5(qyj qyjVar, los losVar, nz5 nz5Var, pt ptVar) {
        this.a = qyjVar;
        this.b = nz5Var;
        this.c = ptVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH5 = yon1.H5();
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{new bn70(p6r0VarH5, new lik1(l1d.m("spotify:atv-pin-entry:", nz5Var.a)), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 2781), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-427100753, new kz5(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-448581858);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            this.c.h(new ez5(this.b.a, new rz5()), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kz5(this, i);
        }
    }
}
