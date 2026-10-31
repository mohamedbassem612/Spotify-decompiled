package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bew implements hiw {
    public final String a;
    public final mst0 b;
    public final tv80 c;

    public bew(String str, mst0 mst0Var, tv80 tv80Var) {
        this.a = str;
        this.b = mst0Var;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bew)) {
            return false;
        }
        bew bewVar = (bew) obj;
        return u890.j(this.a, bewVar.a) && u890.j(this.b, bewVar.b) && u890.j(this.c, bewVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mst0 mst0Var = this.b;
        int iHashCode2 = (iHashCode + (mst0Var == null ? 0 : mst0Var.hashCode())) * 31;
        tv80 tv80Var = this.c;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
