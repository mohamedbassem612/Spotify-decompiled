package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rcf1 {
    public final qcf1 a;
    public final qcf1 b;
    public final qcf1 c;
    public final qcf1 d;
    public final qcf1 e;

    public rcf1(qcf1 qcf1Var, qcf1 qcf1Var2, qcf1 qcf1Var3, qcf1 qcf1Var4, qcf1 qcf1Var5) {
        this.a = qcf1Var;
        this.b = qcf1Var2;
        this.c = qcf1Var3;
        this.d = qcf1Var4;
        this.e = qcf1Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcf1)) {
            return false;
        }
        rcf1 rcf1Var = (rcf1) obj;
        return this.a.equals(rcf1Var.a) && this.b.equals(rcf1Var.b) && this.c.equals(rcf1Var.c) && this.d.equals(rcf1Var.d) && this.e.equals(rcf1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
