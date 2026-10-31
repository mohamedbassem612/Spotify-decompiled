package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yb6 implements h0r0 {
    public final hvj a;
    public final ic6 b;
    public final rzo c;
    public final gw70 d;
    public final km3 e;
    public final lzn0 f;
    public final cbr0 g;

    public yb6(hvj hvjVar, ic6 ic6Var, rzo rzoVar, gw70 gw70Var, km3 km3Var, lzn0 lzn0Var, los losVar) {
        this.a = hvjVar;
        this.b = ic6Var;
        this.c = rzoVar;
        this.d = gw70Var;
        this.e = km3Var;
        this.f = lzn0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarP = yon1.P();
        Parcelable.Creator creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{new bn70(p6r0VarP, oap1.i("spotify:internal:artist-attribution"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.b), apo.j(880612339, new ub3(this, (byte) 8), true));
    }
}
