package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s100 implements m600 {
    public final boolean a;

    public s100(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s100) && this.a == ((s100) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
