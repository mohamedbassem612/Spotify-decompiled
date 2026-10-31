package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pqi0 implements h0r0 {
    public final hvj a;
    public final nqi0 b;
    public final lzn0 c;
    public final kqi0 d;
    public final asi0 e;
    public final dxy f;
    public final cbr0 g;
    public final AtomicBoolean h;

    public pqi0(hvj hvjVar, nqi0 nqi0Var, lzn0 lzn0Var, sqi0 sqi0Var, kqi0 kqi0Var, asi0 asi0Var, dxy dxyVar) {
        this.a = hvjVar;
        this.b = nqi0Var;
        this.c = lzn0Var;
        this.d = kqi0Var;
        this.e = asi0Var;
        this.f = dxyVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PODCAST_SHOW_MEMBERSHIPSUCCESSMODAL", "podcast/show/membershipsuccessmodal", 1499, "podcast");
        Parcelable.Creator creator = lik1.CREATOR;
        String str = sqi0Var.a;
        this.g = new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(f4i1.e(str, ":membershipsuccess")), (nar0) null)}, false);
        this.h = new AtomicBoolean(false);
        if (ihc1.y0(str)) {
            hhg1.n("Membership confirmation requires non-blank showUri");
            throw null;
        }
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.a.a(f4p1.g(this.b), new j2i(73257415, new otf0(this, (byte) 19), true), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    public final synchronized void c(tv80 tv80Var) {
        if (this.h.compareAndSet(false, true)) {
            this.c.e();
            String str = this.b.i;
            if (str != null) {
                this.c.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
            }
        }
    }
}
