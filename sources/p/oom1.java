package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oom1 implements qom1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final nom1 f;
    public final boolean g;

    public oom1(String str, String str2, String str3, String str4, String str5, nom1 nom1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = nom1Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oom1)) {
            return false;
        }
        oom1 oom1Var = (oom1) obj;
        return u890.j(this.a, oom1Var.a) && this.b.equals(oom1Var.b) && u890.j(this.c, oom1Var.c) && u890.j(this.d, oom1Var.d) && u890.j(this.e, oom1Var.e) && this.f.equals(oom1Var.f) && this.g == oom1Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
