package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqs0 implements Iterator, ola0 {
    public final kqs0 a;

    public jqs0(dqs0 dqs0Var) {
        this.a = new kqs0(dqs0Var.b, dqs0Var.d, (byte) 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        kqs0 kqs0Var = this.a;
        Object objA = kqs0Var.a();
        kqs0Var.b();
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
