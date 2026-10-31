package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qig1 {
    public static final qig1 c;
    public final qjg1 a;
    public final qjg1 b;

    static {
        ljg1 ljg1Var = ljg1.a;
        c = new qig1(ljg1Var, ljg1Var);
    }

    public qig1(qjg1 qjg1Var, qjg1 qjg1Var2) {
        this.a = qjg1Var;
        this.b = qjg1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qig1)) {
            return false;
        }
        qig1 qig1Var = (qig1) obj;
        return u890.j(this.a, qig1Var.a) && u890.j(this.b, qig1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
