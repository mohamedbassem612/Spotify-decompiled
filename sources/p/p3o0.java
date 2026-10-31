package p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p3o0 implements h0r0 {
    public final qyj a;
    public final utp b;
    public final s3o0 c;
    public final a1r0 d;
    public final cbr0 e;

    public p3o0(qyj qyjVar, utp utpVar, s3o0 s3o0Var, a1r0 a1r0Var, Resources resources) {
        this.a = qyjVar;
        this.b = utpVar;
        this.c = s3o0Var;
        this.d = a1r0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("PERMISSIONS_BLUETOOTH_REQUEST_BOTTOMSHEET", "permissions/bluetooth/request/bottomsheet", 1429, "permissions"), nik1.j5, (nar0) null), new nxb((Integer) null, ixb.b, Integer.valueOf(resources.getDimensionPixelSize(2131165381)), 0, (mxb) null, (los) null, false, false, false, (nsm0) null, 4089), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1950127649, new fhk0(this, (byte) 20), true));
    }
}
