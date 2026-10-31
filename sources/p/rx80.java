package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rx80 {
    public final int a;
    public final tv80 b;

    public rx80(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx80)) {
            return false;
        }
        rx80 rx80Var = (rx80) obj;
        return this.a == rx80Var.a && u890.j(this.b, rx80Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        tv80 tv80Var = this.b;
        return iC + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
