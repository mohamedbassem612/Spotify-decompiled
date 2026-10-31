package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class so3 extends qxd0 {
    public final String d;
    public final cob1 e;
    public final ou80 f;

    public so3(String str, cob1 cob1Var, ou80 ou80Var) {
        this.d = str;
        this.e = cob1Var;
        this.f = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so3)) {
            return false;
        }
        so3 so3Var = (so3) obj;
        return u890.j(this.d, so3Var.d) && this.e == so3Var.e && u890.j(this.f, so3Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        ou80 ou80Var = this.f;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
