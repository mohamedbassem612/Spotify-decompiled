package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vum0 implements h0r0 {
    public final kly0 a;
    public final xum0 b;
    public final qyj c;
    public final ynb0 d;
    public final cbr0 e;

    public vum0(los losVar, bsp bspVar, xum0 xum0Var, qyj qyjVar, ynb0 ynb0Var) {
        this.a = bspVar;
        this.b = xum0Var;
        this.c = qyjVar;
        this.d = ynb0Var;
        losVar.c(new xkm0(this, (byte) 3));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarL4 = yon1.L4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarL4, oap1.i(xum0Var.getViewUri()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 2, (mxb) null, losVar, false, false, true, (nsm0) null, 3797), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.c.a(apo.j(452494707, new fhk0(this, (byte) 6), true));
    }
}
