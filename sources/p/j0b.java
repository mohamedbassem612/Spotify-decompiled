package p;

import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j0b implements h0r0 {
    public final a8e0 a;
    public final l0b b;
    public final s2p c;
    public final t2p d;
    public final cbr0 e;

    public j0b(a8e0 a8e0Var, l0b l0bVar, s2p s2pVar, t2p t2pVar) {
        this.a = a8e0Var;
        this.b = l0bVar;
        this.c = s2pVar;
        this.d = t2pVar;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.d0(), nik1.Z.b(l0bVar.getPageUri()), (nar0) null), new j0c0(mno1.c)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(bbp1.g(Single.just(this.b.a())), new s20(this, (byte) 2), new u7r0(a4p1.n(), (g4h1) null, (iu30) null, false, false, 126));
    }
}
