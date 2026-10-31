package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r2g0 implements rs61 {
    public final kly0 a;
    public final p6r0 b;
    public final lik1 c;
    public final Set d;
    public final Set e;

    public r2g0(thq thqVar) {
        this.a = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = yon1.W4();
        this.c = nik1.W0;
        this.d = Collections.singleton(blc0.SETTINGS);
        this.e = Collections.singleton(blc0.CONFIG);
    }

    @Override // p.rs61
    public final Set a() {
        return this.d;
    }

    @Override // p.rs61
    public final kly0 c() {
        return this.a;
    }

    @Override // p.rs61
    public final Set d() {
        return this.e;
    }

    @Override // p.rs61
    public final p6r0 e() {
        return this.b;
    }

    @Override // p.rs61
    public final lik1 getViewUri() {
        return this.c;
    }
}
