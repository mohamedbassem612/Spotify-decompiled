package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hd0 {
    public final int a;

    public hd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd0) && this.a == ((hd0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
