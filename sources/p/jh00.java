package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jh00 extends mh00 {
    public final jj40 a;

    public jh00(jj40 jj40Var) {
        this.a = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh00) && u890.j(this.a, ((jh00) obj).a);
    }

    public final int hashCode() {
        jj40 jj40Var = this.a;
        if (jj40Var == null) {
            return 0;
        }
        return jj40Var.hashCode();
    }
}
