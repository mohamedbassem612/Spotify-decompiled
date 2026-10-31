package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jpc0 implements rpc0 {
    public final rnc0 a;

    public jpc0(rnc0 rnc0Var) {
        this.a = rnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpc0) && u890.j(this.a, ((jpc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
