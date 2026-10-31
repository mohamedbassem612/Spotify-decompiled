package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dml implements h0r0 {
    public final a8e0 a;
    public final Scheduler b;
    public final mp8 c;
    public final g8p d;
    public final h8p e;
    public final cbr0 f;

    public dml(a8e0 a8e0Var, Scheduler scheduler, mp8 mp8Var, g8p g8pVar, h8p h8pVar) {
        this.a = a8e0Var;
        this.b = scheduler;
        this.c = mp8Var;
        this.d = g8pVar;
        this.e = h8pVar;
        dbr0 yxe1Var = new yxe1(new jx21(2131954273));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.o(), nik1.K1, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(this.c.c().observeOn(this.b)), new v7l(this, (byte) 7));
    }
}
