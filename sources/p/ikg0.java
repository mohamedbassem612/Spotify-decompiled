package p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ikg0 implements h0r0 {
    public final a8e0 a;
    public final wqp b;
    public final x5u c;
    public final cbr0 d;

    public ikg0(a8e0 a8e0Var, wqp wqpVar, x5u x5uVar) {
        this.a = a8e0Var;
        this.b = wqpVar;
        this.c = x5uVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.G1("PUFFIN_MANUAL_SELECT", "puffin/manual-select", 1598, "puffin"), nik1.K1, (nar0) null), new zp71(Uri.EMPTY)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(((vpy0) this.c.b).a().map(yi20.d).map(ua20.Z)), new e4f0(this, (byte) 20));
    }
}
