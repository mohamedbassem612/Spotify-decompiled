package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jdw extends w0o1 {
    public final tv80 c;

    public jdw(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdw) && u890.j(this.c, ((jdw) obj).c);
    }

    public final int hashCode() {
        tv80 tv80Var = this.c;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
