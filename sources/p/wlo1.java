package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wlo1 extends qgo1 {
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;

    public wlo1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
        this.g = atomicReferenceFieldUpdater5;
    }

    @Override // p.qgo1
    public final void A(ivo1 ivo1Var, ivo1 ivo1Var2) {
        this.d.lazySet(ivo1Var, ivo1Var2);
    }

    @Override // p.qgo1
    public final void B(ivo1 ivo1Var, Thread thread) {
        this.c.lazySet(ivo1Var, thread);
    }

    @Override // p.qgo1
    public final boolean C(fzo1 fzo1Var, zeo1 zeo1Var, zeo1 zeo1Var2) {
        return ujo1.x(this.f, fzo1Var, zeo1Var, zeo1Var2);
    }

    @Override // p.qgo1
    public final boolean D(fzo1 fzo1Var, Object obj, Object obj2) {
        return ujo1.x(this.g, fzo1Var, obj, obj2);
    }

    @Override // p.qgo1
    public final boolean E(fzo1 fzo1Var, ivo1 ivo1Var, ivo1 ivo1Var2) {
        return ujo1.x(this.e, fzo1Var, ivo1Var, ivo1Var2);
    }
}
