package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s8z0 extends z8z0 {
    public final int a;

    public s8z0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8z0) && this.a == ((s8z0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
