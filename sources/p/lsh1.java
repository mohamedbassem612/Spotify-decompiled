package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsh1 {
    public final String a;
    public final ith1 b;

    public lsh1(String str, ith1 ith1Var) {
        this.a = str;
        this.b = ith1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsh1)) {
            return false;
        }
        lsh1 lsh1Var = (lsh1) obj;
        return u890.j(this.a, lsh1Var.a) && u890.j(this.b, lsh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
