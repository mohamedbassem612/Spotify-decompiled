package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rhq0 {
    public final String a;
    public final qhq0 b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public /* synthetic */ rhq0(String str, phq0 phq0Var, String str2, String str3, int i) {
        this(str, (i & 2) != 0 ? null : phq0Var, str2, str3, 1, null);
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhq0)) {
            return false;
        }
        rhq0 rhq0Var = (rhq0) obj;
        return u890.j(this.a, rhq0Var.a) && u890.j(this.b, rhq0Var.b) && u890.j(this.c, rhq0Var.c) && u890.j(this.d, rhq0Var.d) && this.e == rhq0Var.e && u890.j(this.f, rhq0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qhq0 qhq0Var = this.b;
        int iHashCode2 = (iHashCode + (qhq0Var == null ? 0 : qhq0Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iK = ab80.k(this.e, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        return iK + (str3 != null ? str3.hashCode() : 0);
    }

    public rhq0(String str, qhq0 qhq0Var, String str2, String str3, int i, String str4) {
        this.a = str;
        this.b = qhq0Var;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
    }
}
