package p;

import android.app.Activity;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qri0 implements h0r0 {
    public final hvj a;
    public final nri0 b;
    public final lzn0 c;
    public final ryf d;
    public final Activity e;
    public final los f;
    public final kqi0 g;
    public final cbr0 h;

    public qri0(hvj hvjVar, nri0 nri0Var, lzn0 lzn0Var, ryf ryfVar, tri0 tri0Var, Activity activity, los losVar, kqi0 kqi0Var) {
        this.a = hvjVar;
        this.b = nri0Var;
        this.c = lzn0Var;
        this.d = ryfVar;
        this.e = activity;
        this.f = losVar;
        this.g = kqi0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PODCAST_SHOW_MEMBERSHIPUPSELL", "podcast/show/membershipupsell", 1500, "podcast");
        Parcelable.Creator creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(f4i1.e(tri0Var.a, ":membershipupsell")), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return this.a.a(f4p1.g(this.b), new j2i(1506608565, new otf0(this, (byte) 20), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }
}
