package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p9 extends oto1 {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public p9(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    public final boolean h(t9 t9Var, o9 o9Var, o9 o9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(t9Var, o9Var, o9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t9Var) == o9Var);
        return false;
    }

    public final boolean i(t9 t9Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(t9Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t9Var) == obj);
        return false;
    }

    public final boolean j(t9 t9Var, s9 s9Var, s9 s9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(t9Var, s9Var, s9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t9Var) == s9Var);
        return false;
    }

    public final void u(s9 s9Var, s9 s9Var2) {
        this.c.lazySet(s9Var, s9Var2);
    }

    public final void v(s9 s9Var, Thread thread) {
        this.b.lazySet(s9Var, thread);
    }
}
