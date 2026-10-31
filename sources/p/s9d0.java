package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s9d0 implements u9d0 {
    public final gax a;

    public s9d0(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9d0) && this.a.equals(((s9d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
