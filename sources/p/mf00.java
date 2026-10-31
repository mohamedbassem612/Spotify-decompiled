package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mf00 extends o4o1 {
    public final String e;
    public final tv80 f;

    public mf00(String str, tv80 tv80Var) {
        this.e = str;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf00)) {
            return false;
        }
        mf00 mf00Var = (mf00) obj;
        return u890.j(this.e, mf00Var.e) && u890.j(this.f, mf00Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        tv80 tv80Var = this.f;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
