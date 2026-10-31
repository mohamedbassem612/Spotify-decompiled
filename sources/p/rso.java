package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rso implements h0r0 {
    public final fso a;
    public final qso b;
    public final hvj c;
    public final wzn d;
    public final cbr0 e;

    public rso(fso fsoVar, qso qsoVar, hvj hvjVar, wzn wznVar) {
        this.a = fsoVar;
        this.b = qsoVar;
        this.c = hvjVar;
        this.d = wznVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("BLUEJAY_CREATE", "bluejay/create", 229, "bluejay"), nik1.q6, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return hvj.b(this.c, f4p1.g(this.b), new j2i(-318881737, new mgl(this, (byte) 18), true));
    }
}
