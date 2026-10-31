package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jxd0 implements rxd0 {
    public final xvd0 a;

    public jxd0(xvd0 xvd0Var) {
        this.a = xvd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxd0) && this.a.equals(((jxd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
