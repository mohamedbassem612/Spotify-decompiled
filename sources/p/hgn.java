package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hgn implements ugn {
    public final int a;

    public hgn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgn) && this.a == ((hgn) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
