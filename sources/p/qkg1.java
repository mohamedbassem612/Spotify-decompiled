package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qkg1 {
    public final lhg1 a;
    public final String b;

    public qkg1(lhg1 lhg1Var, String str) {
        this.a = lhg1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkg1)) {
            return false;
        }
        qkg1 qkg1Var = (qkg1) obj;
        return u890.j(this.a, qkg1Var.a) && this.b.equals(qkg1Var.b);
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        return this.b.hashCode() + ((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31);
    }
}
