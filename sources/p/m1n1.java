package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m1n1 extends q1n1 {
    public final kjo0 a;
    public final tv80 b;

    public m1n1(kjo0 kjo0Var, tv80 tv80Var) {
        this.a = kjo0Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1n1)) {
            return false;
        }
        m1n1 m1n1Var = (m1n1) obj;
        return u890.j(this.a, m1n1Var.a) && this.b.equals(m1n1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
