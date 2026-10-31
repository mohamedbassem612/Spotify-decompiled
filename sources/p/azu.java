package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class azu implements h0r0 {
    public final czu a;
    public final qyj b;
    public final kly0 c;
    public final cbr0 d;

    public azu(los losVar, czu czuVar, qyj qyjVar, i8p i8pVar) {
        this.a = czuVar;
        this.b = qyjVar;
        this.c = i8pVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.t1(), nik1.P6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, false, (nsm0) null, 4053), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(-411407806, new utt(this, (byte) 5), true));
    }
}
