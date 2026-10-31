package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f6x0 extends q6x0 {
    public final int a;
    public final tv80 b;

    public f6x0(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6x0)) {
            return false;
        }
        f6x0 f6x0Var = (f6x0) obj;
        return this.a == f6x0Var.a && u890.j(this.b, f6x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
