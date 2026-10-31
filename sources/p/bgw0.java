package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bgw0 extends up30 {
    public final tv80 c;

    public bgw0(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgw0) && u890.j(this.c, ((bgw0) obj).c);
    }

    public final int hashCode() {
        tv80 tv80Var = this.c;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
