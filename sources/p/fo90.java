package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fo90 extends mjh1 {
    public final Object b;
    public boolean c;

    public fo90(Object obj) {
        super((byte) 0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            hhg1.k();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
