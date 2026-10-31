package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rqa1 implements era1 {
    public final String a;
    public final qig1 b;

    public rqa1(String str, qig1 qig1Var) {
        this.a = str;
        this.b = qig1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqa1)) {
            return false;
        }
        rqa1 rqa1Var = (rqa1) obj;
        return u890.j(this.a, rqa1Var.a) && this.b.equals(rqa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
