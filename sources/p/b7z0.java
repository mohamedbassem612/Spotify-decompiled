package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b7z0 implements c7z0 {
    public final baz0 a;

    public b7z0(baz0 baz0Var) {
        this.a = baz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7z0) && this.a.equals(((b7z0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
