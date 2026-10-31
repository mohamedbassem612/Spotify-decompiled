package p;

import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e7 extends d7 implements ListIterator {
    public final /* synthetic */ g7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(g7 g7Var, int i) {
        super(g7Var, (byte) 0);
        this.d = g7Var;
        int iB = g7Var.b();
        if (i < 0 || i > iB) {
            eg.g(cy30.i(i, "index: ", iB, ", size: "));
            throw null;
        }
        ((d7) this).b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((d7) this).b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((d7) this).b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        int i = ((d7) this).b - 1;
        ((d7) this).b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((d7) this).b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
