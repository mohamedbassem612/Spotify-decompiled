package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jg80 implements og80 {
    public final at80 a;

    public jg80(at80 at80Var) {
        this.a = at80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg80) && this.a == ((jg80) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
