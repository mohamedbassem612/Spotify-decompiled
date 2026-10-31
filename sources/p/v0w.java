package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v0w implements h0r0 {
    public final a8e0 a;
    public final g1w b;
    public final w0w c;
    public final yzu d;
    public final Scheduler e;
    public final Scheduler f;
    public final cbr0 g;

    public v0w(a8e0 a8e0Var, g1w g1wVar, w0w w0wVar, yzu yzuVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = a8e0Var;
        this.b = g1wVar;
        this.c = w0wVar;
        this.d = yzuVar;
        this.e = scheduler;
        this.f = scheduler2;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.m4(), nik1.H0, (nar0) null), new j0c0(mno1.k0), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(this.d.B(this.c.getUsername()).subscribeOn(this.f).observeOn(this.e)), new nit(this, (byte) 23));
    }
}
