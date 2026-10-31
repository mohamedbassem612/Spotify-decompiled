package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ft90 implements h0r0 {
    public final qyj a;
    public final res b;
    public final String c;
    public final String d;
    public final cbr0 e;

    public ft90(qyj qyjVar, res resVar, los losVar, gt90 gt90Var, Resources resources) {
        this.a = qyjVar;
        this.b = resVar;
        this.c = gt90Var.a;
        this.d = gt90Var.b;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("SOCIAL_LISTENING_SHAREOPTIONS", "social-listening/shareoptions", 1913, "social-listening"), nik1.H5, (nar0) null), new nxb(null, ixb.a, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, null, losVar, false, false, false, null, 4057), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1411541487, new gs90(this, (byte) 1), true));
    }
}
