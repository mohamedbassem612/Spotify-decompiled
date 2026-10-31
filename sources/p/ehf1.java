package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ehf1 implements h0r0 {
    public final ix81 a;
    public final azf b;
    public final cbr0 c;

    public ehf1(ix81 ix81Var, azf azfVar) {
        this.a = ix81Var;
        this.b = azfVar;
        dbr0 yxe1Var = new yxe1(new jx21(2131963316));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarQ = yon1.q();
        Parcelable.Creator creator = lik1.CREATOR;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarQ, oap1.i("spotify:aaa:t"), (nar0) null), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new ibf1(this, (byte) 7));
    }
}
