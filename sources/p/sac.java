package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sac extends i7 {
    public final Object[] c;

    public sac(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.c = objArr;
    }

    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        int iA = a();
        b(iA + 1);
        return this.c[iA];
    }

    public final Object previous() {
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        b(a() - 1);
        return this.c[a()];
    }
}
