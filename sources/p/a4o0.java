package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a4o0 implements h0r0 {
    public final qyj a;
    public final xtp b;
    public final f4o0 c;
    public final a1r0 d;
    public final cbr0 e;

    public a4o0(qyj qyjVar, xtp xtpVar, f4o0 f4o0Var, a1r0 a1r0Var) {
        this.a = qyjVar;
        this.b = xtpVar;
        this.c = f4o0Var;
        this.d = a1r0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("PERMISSIONS_BLUETOOTH_REQUEST_FULLSCREEN", "permissions/bluetooth/request/fullscreen", 1430, "permissions"), nik1.i5, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-985829970, new fhk0(this, (byte) 21), true));
    }
}
