package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jgx extends pgx {
    public final int e;

    public jgx(int i) {
        super(i, 12, urw.b1);
        this.e = i;
    }

    @Override // p.pgx
    public final int a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgx) && this.e == ((jgx) obj).e;
    }

    public final int hashCode() {
        return l1d.C(this.e);
    }
}
