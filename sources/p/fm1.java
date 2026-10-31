package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fm1 {
    public final String a;
    public final Boolean b;
    public final String c;

    public fm1(Boolean bool, String str, String str2) {
        this.a = str;
        this.b = bool;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return u890.j(this.a, fm1Var.a) && u890.j(this.b, fm1Var.b) && u890.j(this.c, fm1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
