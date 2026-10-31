package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fpq0 {
    public final jo31 a;
    public final jo31 b;

    public fpq0(jo31 jo31Var, jo31 jo31Var2) {
        this.a = jo31Var;
        this.b = jo31Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpq0)) {
            return false;
        }
        fpq0 fpq0Var = (fpq0) obj;
        return this.a.equals(fpq0Var.a) && this.b.equals(fpq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
