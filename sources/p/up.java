package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class up implements rs61 {
    public final kly0 a;
    public final p6r0 b;
    public final lik1 c;
    public final ksk0 d;
    public final Set e;
    public final Set f;

    public up(thq thqVar) {
        this.a = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = yon1.X4();
        lik1 lik1Var = nik1.g1;
        this.c = lik1Var;
        this.d = new ksk0(yon1.X4().a, lik1Var.a, (byte) 22);
        this.e = Collections.singleton(blc0.Of);
        this.f = Collections.singleton(blc0.xd);
    }

    public final Set a() {
        return this.e;
    }

    public final v8h1 b() {
        return this.d;
    }

    public final kly0 c() {
        return this.a;
    }

    public final Set d() {
        return this.f;
    }

    public final p6r0 e() {
        return this.b;
    }

    public final lik1 getViewUri() {
        return this.c;
    }
}
