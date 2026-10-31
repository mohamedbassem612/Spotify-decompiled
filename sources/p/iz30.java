package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iz30 extends upf {
    public final tv80 d;

    public iz30(tv80 tv80Var) {
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz30) && u890.j(this.d, ((iz30) obj).d);
    }

    public final int hashCode() {
        tv80 tv80Var = this.d;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
