package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v4p1 extends k5n1 {
    public final Object b;
    public boolean c;

    public v4p1(Object obj) {
        super((byte) 8);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // p.k5n1, java.util.Iterator
    public final Object next() {
        if (this.c) {
            hhg1.k();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
