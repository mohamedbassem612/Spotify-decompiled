package p;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oy2 extends aym {
    public final AtomicReferenceFieldUpdater c;
    public final AtomicIntegerFieldUpdater d;

    public oy2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.c = atomicReferenceFieldUpdater;
        this.d = atomicIntegerFieldUpdater;
    }

    public final void o(rch rchVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(rchVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(rchVar) == null);
    }

    public final int q(rch rchVar) {
        return this.d.decrementAndGet(rchVar);
    }
}
