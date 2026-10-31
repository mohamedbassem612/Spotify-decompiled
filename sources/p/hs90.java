package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hs90 implements h0r0 {
    public final okp a;
    public final skp b;
    public final qyj c;
    public final ks90 d;
    public final cbr0 e;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public hs90(okp okpVar, skp skpVar, qyj qyjVar, ks90 ks90Var, los losVar, Resources resources) {
        this.a = okpVar;
        this.b = skpVar;
        this.c = qyjVar;
        this.d = ks90Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("JAM_INVITESLEARNMORESHEET", "jam/inviteslearnmoresheet", 857, "jam"), nik1.x5, (nar0) null), new nxb(null, ixb.a, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, null, losVar, false, false, false, null, 4057), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.c.a(new j2i(-467296108, new gs90(this, (byte) 0), true));
    }
}
