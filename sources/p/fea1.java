package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fea1 {
    public final String a;
    public final k1r b;
    public final qtt0 c;

    public fea1(String str, k1r k1rVar, qtt0 qtt0Var) {
        this.a = str;
        this.b = k1rVar;
        this.c = qtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fea1)) {
            return false;
        }
        fea1 fea1Var = (fea1) obj;
        return u890.j(this.a, fea1Var.a) && this.b.equals(fea1Var.b) && this.c == fea1Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qtt0 qtt0Var = this.c;
        return iHashCode + (qtt0Var == null ? 0 : qtt0Var.hashCode());
    }
}
