package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hgc1 {
    public final int a;

    public hgc1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgc1) && this.a == ((hgc1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
