package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s7j0 {
    public final boolean a;

    public s7j0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7j0) && this.a == ((s7j0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
