package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yrn0 extends nsn0 {
    public final ou80 a;

    public yrn0(ou80 ou80Var) {
        this.a = ou80Var;
    }

    @Override // p.nsn0
    public final String b() {
        ou80 ou80Var = this.a;
        return ou80Var == null ? "back" : f4i1.f("back(", ou80Var.a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrn0) && u890.j(this.a, ((yrn0) obj).a);
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }

    @Override // p.nsn0
    public final String toString() {
        return super.toString();
    }
}
