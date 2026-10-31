package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g6o extends j6o {
    public final int a;

    public g6o(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6o) && this.a == ((g6o) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
