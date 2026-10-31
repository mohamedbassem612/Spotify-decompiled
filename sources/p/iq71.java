package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iq71 {
    public final String a;
    public final z771 b;
    public final String c;
    public final String d;

    public iq71(String str, z771 z771Var, String str2, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.a = str;
        this.b = z771Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq71)) {
            return false;
        }
        iq71 iq71Var = (iq71) obj;
        return u890.j(this.a, iq71Var.a) && u890.j(this.b, iq71Var.b) && u890.j(this.c, iq71Var.c) && u890.j(this.d, iq71Var.d);
    }

    public final int hashCode() {
        int iJ = xvj1.j(this.b.a, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
