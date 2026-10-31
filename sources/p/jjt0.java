package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jjt0 implements mjt0 {
    public final vp31 a;

    public jjt0(vp31 vp31Var) {
        this.a = vp31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjt0) && this.a.equals(((jjt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
