package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kwd1 {
    public final String a;
    public final bwd1 b;

    public kwd1(String str, bwd1 bwd1Var) {
        this.a = str;
        this.b = bwd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwd1)) {
            return false;
        }
        kwd1 kwd1Var = (kwd1) obj;
        return u890.j(this.a, kwd1Var.a) && u890.j(this.b, kwd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
