package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mwu0 implements h0r0 {
    public final hvj a;
    public final yeu0 b;
    public final owu0 c;
    public final cx0 d;
    public final cbr0 e;

    public mwu0(hvj hvjVar, yeu0 yeu0Var, owu0 owu0Var, cx0 cx0Var) {
        this.a = hvjVar;
        this.b = yeu0Var;
        this.c = owu0Var;
        this.d = cx0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH5 = yon1.H5();
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{new bn70(p6r0VarH5, new lik1(owu0Var.a), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new o6e0(new l8t0(this, (lnm) null, (byte) 2), f46.I(new p6e0[0])), new j2i(-1099739897, new dvt0(this, (byte) 4), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }
}
