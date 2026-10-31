package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nle0 extends hme0 {
    public final jj40 a;

    public nle0(jj40 jj40Var) {
        this.a = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nle0) && u890.j(this.a, ((nle0) obj).a);
    }

    public final int hashCode() {
        jj40 jj40Var = this.a;
        if (jj40Var == null) {
            return 0;
        }
        return jj40Var.hashCode();
    }
}
