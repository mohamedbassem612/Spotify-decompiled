package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mn9 {
    public final String a;
    public final ub10 b;

    public mn9(String str, ub10 ub10Var) {
        this.a = str;
        this.b = ub10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn9)) {
            return false;
        }
        mn9 mn9Var = (mn9) obj;
        return u890.j(this.a, mn9Var.a) && u890.j(this.b, mn9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
