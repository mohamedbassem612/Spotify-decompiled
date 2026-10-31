package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s9u extends gau {
    public final boolean a;

    public s9u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9u) && this.a == ((s9u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
