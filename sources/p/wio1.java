package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wio1 extends mjh1 {
    public final Object b;
    public boolean c;

    public wio1(Object obj) {
        super((byte) 2);
        this.b = obj;
    }

    public final boolean hasNext() {
        return !this.c;
    }

    public final Object next() {
        if (this.c) {
            hhg1.k();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
