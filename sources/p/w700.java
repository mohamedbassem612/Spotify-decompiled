package p;

import android.graphics.Color;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w700 implements h0r0 {
    public final p800 a;
    public final lo5 b;
    public final n800 c;
    public final cbr0 d;

    public w700(gx81 gx81Var, p800 p800Var, lo5 lo5Var, n800 n800Var) {
        this.a = p800Var;
        this.b = lo5Var;
        this.c = n800Var;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.N0(), new lik1("spotify:concerts:playlists-bottomsheet"), new rxk0(yon1.N0().c, "spotify:concerts:playlists-bottomsheet")), new nxb(null, ixb.b, null, 0, new jxb(Color.rgb(18, 18, 18)), null, false, true, false, null, 3949)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return new nn61(new u700(this, (byte) 0), new dx81(new v700(this), new u700(this, (byte) 1), zp8.c1, (iu30) null), false, (byte) 22);
    }
}
