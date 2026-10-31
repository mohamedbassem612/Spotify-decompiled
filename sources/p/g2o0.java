package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g2o0 implements h0r0 {
    public final qyj a;
    public final ttp b;
    public final j2o0 c;
    public final a1r0 d;
    public final cbr0 e;

    public g2o0(qyj qyjVar, ttp ttpVar, j2o0 j2o0Var, a1r0 a1r0Var, Resources resources) {
        this.a = qyjVar;
        this.b = ttpVar;
        this.c = j2o0Var;
        this.d = a1r0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("PERMISSIONS_BLUETOOTH_INFO_BOTTOMSHEET", "permissions/bluetooth/info/bottomsheet", 1428, "permissions"), nik1.k5, (nar0) null), new nxb((Integer) null, ixb.b, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4089), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-2064661558, new fhk0(this, (byte) 19), true));
    }
}
