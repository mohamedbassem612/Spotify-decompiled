package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g1u implements h1u {
    public final int a;

    public g1u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1u) && this.a == ((g1u) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
