package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n9u extends gau {
    public final boolean a;

    public n9u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9u) && this.a == ((n9u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
