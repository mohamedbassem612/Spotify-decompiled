package p;

import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mee implements h0r0 {
    public final a8e0 a;
    public final nee b;
    public final lo8 c;
    public final cbr0 d;

    public mee(a8e0 a8e0Var, nee neeVar, lo8 lo8Var) {
        this.a = a8e0Var;
        this.b = neeVar;
        this.c = lo8Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.s4(), nik1.K1, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return a8e0.b(this.a, bbp1.g(Single.just(this.b.a())), new m4d(this, (byte) 16));
    }
}
