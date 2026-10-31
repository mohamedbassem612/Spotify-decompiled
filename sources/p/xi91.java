package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xi91 extends zi91 {
    public final int a;
    public final tv80 b;

    public xi91(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi91)) {
            return false;
        }
        xi91 xi91Var = (xi91) obj;
        return this.a == xi91Var.a && u890.j(this.b, xi91Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        tv80 tv80Var = this.b;
        return iC + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
