package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s910 {
    public final boolean a;

    public s910(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s910) && this.a == ((s910) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
