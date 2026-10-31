package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qpq0 {
    public final r591 a;
    public final int b;
    public final int c;
    public final q591 d;

    public qpq0(r591 r591Var, int i, int i2, q591 q591Var) {
        this.a = r591Var;
        this.b = i;
        this.c = i2;
        this.d = q591Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpq0)) {
            return false;
        }
        qpq0 qpq0Var = (qpq0) obj;
        return this.a == qpq0Var.a && this.b == qpq0Var.b && this.c == qpq0Var.c && this.d.equals(qpq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
