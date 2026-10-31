package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class of00 extends o4o1 {
    public final String e;
    public final ou80 f;

    public of00(String str, ou80 ou80Var) {
        this.e = str;
        this.f = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of00)) {
            return false;
        }
        of00 of00Var = (of00) obj;
        return u890.j(this.e, of00Var.e) && u890.j(this.f, of00Var.f);
    }

    public final int hashCode() {
        String str = this.e;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ou80 ou80Var = this.f;
        return iHashCode + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }
}
