package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p9u extends gau {
    public final boolean a;

    public p9u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9u) && this.a == ((p9u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
