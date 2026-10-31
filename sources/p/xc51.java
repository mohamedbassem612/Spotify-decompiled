package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xc51 extends hd51 {
    public final tv80 b;
    public final int c;

    public xc51(int i, tv80 tv80Var) {
        this.b = tv80Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc51)) {
            return false;
        }
        xc51 xc51Var = (xc51) obj;
        return u890.j(this.b, xc51Var.b) && this.c == xc51Var.c;
    }

    public final int hashCode() {
        tv80 tv80Var = this.b;
        return Integer.hashCode(this.c) + ((tv80Var == null ? 0 : tv80Var.hashCode()) * 31);
    }
}
