package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wwm1 implements rs61 {
    public final z0t a;
    public final kly0 b;
    public final p6r0 c;
    public final lik1 d;
    public final Set e;

    public wwm1(z0t z0tVar, thq thqVar) {
        this.a = z0tVar;
        this.b = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.i5();
        this.d = nik1.j1;
        this.e = Collections.singleton(blc0.SETTINGS_YOUR_LIBRARY);
    }

    @Override // p.rs61
    public final Set a() {
        return this.e;
    }

    @Override // p.rs61
    public final kly0 c() {
        return this.b;
    }

    @Override // p.rs61
    public final p6r0 e() {
        return this.c;
    }

    @Override // p.rs61
    public final lik1 getViewUri() {
        return this.d;
    }

    @Override // p.rs61
    public final boolean isEnabled() {
        return this.a.a.i();
    }
}
