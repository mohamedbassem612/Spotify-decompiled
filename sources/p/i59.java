package p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i59 implements h0r0 {
    public final ix81 a;
    public final h2p b;
    public final cbr0 c;

    public i59(ix81 ix81Var, h2p h2pVar) {
        this.a = ix81Var;
        this.b = h2pVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.G1("PUFFIN_AUTODETECT", "puffin/autodetect", 1594, "puffin"), nik1.K1, (nar0) null), new zp71(Uri.EMPTY)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new uv8(this, (byte) 1));
    }
}
