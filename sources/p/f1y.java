package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f1y {
    public final i1k0 a;
    public final ou80 b;
    public final y6r0 c;

    public f1y(i1k0 i1k0Var, ou80 ou80Var, y6r0 y6r0Var) {
        this.a = i1k0Var;
        this.b = ou80Var;
        this.c = y6r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1y)) {
            return false;
        }
        f1y f1yVar = (f1y) obj;
        return this.a.equals(f1yVar.a) && u890.j(this.b, f1yVar.b) && u890.j(this.c, f1yVar.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + 926993003) * 31;
        ou80 ou80Var = this.b;
        int iHashCode2 = (iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode())) * 31;
        y6r0 y6r0Var = this.c;
        return iHashCode2 + (y6r0Var != null ? y6r0Var.a.hashCode() : 0);
    }
}
