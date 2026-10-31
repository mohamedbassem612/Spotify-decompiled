package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ry81 extends h7 {
    public final Object c;

    public ry81(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    public final Object next() {
        if (hasNext()) {
            ((h7) this).a++;
            return this.c;
        }
        hhg1.k();
        return null;
    }

    public final Object previous() {
        if (hasPrevious()) {
            ((h7) this).a--;
            return this.c;
        }
        hhg1.k();
        return null;
    }
}
