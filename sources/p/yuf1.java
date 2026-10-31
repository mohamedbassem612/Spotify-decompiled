package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yuf1 implements h0r0 {
    public final avf1 a;
    public final q7r0 b;
    public final qyj c;
    public final etq d;
    public final ynb0 e;
    public final cbr0 f;

    public yuf1(los losVar, avf1 avf1Var, q7r0 q7r0Var, qyj qyjVar, etq etqVar, ynb0 ynb0Var) {
        this.a = avf1Var;
        this.b = q7r0Var;
        this.c = qyjVar;
        this.d = etqVar;
        this.e = ynb0Var;
        losVar.c(new ibf1(this, (byte) 14));
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("REINVENTFREE_TRACK_PREVIEW_UPSELL", "reinventfree-track-preview-upsell", 1646, "reinventfree-track-preview-upsell");
        Parcelable.Creator creator = lik1.CREATOR;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1(avf1Var.a), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, true, true, true, (nsm0) null, 3605), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.c.a(new j2i(47317623, new wcf1(this, (byte) 12), true));
    }
}
