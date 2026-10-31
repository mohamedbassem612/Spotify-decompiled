package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aq71 {
    public final String a;
    public final String b;
    public final String c;
    public final bc71 d;
    public final int e;
    public final sge0 f;

    public aq71(String str, String str2, String str3, bc71 bc71Var, sge0 sge0Var, int i) {
        bc71Var = (i & 8) != 0 ? lb71.a : bc71Var;
        int i2 = (i & 16) != 0 ? 1 : 2;
        sge0Var = (i & 32) != 0 ? null : sge0Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bc71Var;
        this.e = i2;
        this.f = sge0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq71)) {
            return false;
        }
        aq71 aq71Var = (aq71) obj;
        return u890.j(this.a, aq71Var.a) && u890.j(this.b, aq71Var.b) && u890.j(this.c, aq71Var.c) && this.d.equals(aq71Var.d) && this.e == aq71Var.e && u890.j(this.f, aq71Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iK = ab80.k(this.e, (this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        sge0 sge0Var = this.f;
        return iK + (sge0Var != null ? sge0Var.hashCode() : 0);
    }
}
