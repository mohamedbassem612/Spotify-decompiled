package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tp1 implements wp1 {
    public final cqn a;
    public final tv80 b;

    public tp1(cqn cqnVar, tv80 tv80Var) {
        this.a = cqnVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        tp1 tp1Var = (tp1) obj;
        return this.a.equals(tp1Var.a) && u890.j(this.b, tp1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
