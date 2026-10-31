package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x5x implements rs61 {
    public final ov20 a;
    public final kly0 b;
    public final p6r0 c;
    public final lik1 d;
    public final Set e;
    public final Set f;
    public final ett g;

    public x5x(ov20 ov20Var, thq thqVar) {
        this.a = ov20Var;
        this.b = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.b5();
        this.d = nik1.h1;
        this.e = Collections.singleton(blc0.SETTINGS_EMPLOYEE_TOOLS);
        this.f = Collections.singleton(blc0.EMPLOYEE_TOOLS_SETTINGS);
        this.g = new ett(this, (lnm) null, (byte) 12);
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
    public final Set d() {
        return this.f;
    }

    @Override // p.rs61
    public final p6r0 e() {
        return this.c;
    }

    @Override // p.rs61
    public final vu30 f() {
        return this.g;
    }

    @Override // p.rs61
    public final lik1 getViewUri() {
        return this.d;
    }
}
