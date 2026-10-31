package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class var0 {
    public final oar0 a;
    public final r6h1 b;
    public final nsn0 c;

    public var0(oar0 oar0Var, r6h1 r6h1Var, nsn0 nsn0Var) {
        this.a = oar0Var;
        this.b = r6h1Var;
        this.c = nsn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof var0)) {
            return false;
        }
        var0 var0Var = (var0) obj;
        return this.a.equals(var0Var.a) && u890.j(this.b, var0Var.b) && u890.j(this.c, var0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31;
        nsn0 nsn0Var = this.c;
        return iHashCode + (nsn0Var == null ? 0 : nsn0Var.hashCode());
    }
}
