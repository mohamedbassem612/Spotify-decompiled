package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ht70 implements h0r0 {
    public final hvj a;
    public final lt70 b;
    public final ft70 c;
    public final nl9 d;
    public final cbr0 e;

    public ht70(hvj hvjVar, lt70 lt70Var, ft70 ft70Var, nl9 nl9Var) {
        this.a = hvjVar;
        this.b = lt70Var;
        this.c = ft70Var;
        this.d = nl9Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.b2(), nik1.g5, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.c), apo.j(-1551724512, new gn50(this, (byte) 18), true));
    }
}
