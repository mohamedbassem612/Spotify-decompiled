package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s1f implements q3f {
    public final int a;

    public s1f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1f) && this.a == ((s1f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
