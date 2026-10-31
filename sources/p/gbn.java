package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gbn implements h0r0 {
    public final van a;
    public final dbn b;
    public final x8p c;
    public final cbr0 d;

    public gbn(gx81 gx81Var, van vanVar, dbn dbnVar, x8p x8pVar) {
        this.a = vanVar;
        this.b = dbnVar;
        this.c = x8pVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.D0(), nik1.j2, (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true), new s9h1(14, true, false, false), new kce0()}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return gx81.a(new v7l(this, (byte) 26), new dx81(new fbn(this), new ptj(this, (byte) 15), new pob((byte) 3, false), new ptj(this, (byte) 16)));
    }
}
