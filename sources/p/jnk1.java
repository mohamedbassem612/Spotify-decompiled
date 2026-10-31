package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jnk1 {
    public final boolean a;

    public jnk1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnk1) && this.a == ((jnk1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
