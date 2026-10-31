package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qan0 {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;
    public final y2u0 d;

    public qan0(jo70 jo70Var, xkk1 xkk1Var, hll hllVar, y2u0 y2u0Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
        this.d = y2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qan0)) {
            return false;
        }
        qan0 qan0Var = (qan0) obj;
        return this.a.equals(qan0Var.a) && this.b.equals(qan0Var.b) && this.c.equals(qan0Var.c) && u890.j(this.d, qan0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
