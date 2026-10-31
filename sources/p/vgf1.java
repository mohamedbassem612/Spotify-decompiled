package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vgf1 implements h0r0 {
    public final a8e0 a;
    public final Scheduler b;
    public final vr51 c;
    public final ysq d;
    public final cbr0 e;

    public vgf1(a8e0 a8e0Var, Scheduler scheduler, vr51 vr51Var, ysq ysqVar) {
        this.a = a8e0Var;
        this.b = scheduler;
        this.c = vr51Var;
        this.d = ysqVar;
        dbr0 yxe1Var = new yxe1(new jx21(2131957457));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.p(), nik1.K1, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(this.c.g().observeOn(this.b)), new ibf1(this, (byte) 6));
    }
}
