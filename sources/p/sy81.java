package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sy81 extends i7 {
    public final Object c;

    public sy81(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a++;
            return this.c;
        }
        hhg1.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.a--;
            return this.c;
        }
        hhg1.k();
        return null;
    }
}
