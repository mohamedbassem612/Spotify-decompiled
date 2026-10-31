package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bhm extends b0o1 {
    public final int c;

    public bhm(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhm) && this.c == ((bhm) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }

    public final int r() {
        return this.c;
    }

    public /* synthetic */ bhm() {
        this(2);
    }
}
