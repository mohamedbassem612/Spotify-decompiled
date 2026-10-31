package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qnf0 {
    public final ay61 a;
    public final int b;
    public final int c;
    public final ez61 d;

    public qnf0(ay61 ay61Var, int i, int i2, ez61 ez61Var) {
        this.a = ay61Var;
        this.b = i;
        this.c = i2;
        this.d = ez61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnf0)) {
            return false;
        }
        qnf0 qnf0Var = (qnf0) obj;
        return u890.j(this.a, qnf0Var.a) && this.b == qnf0Var.b && this.c == qnf0Var.c && u890.j(this.d, qnf0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
