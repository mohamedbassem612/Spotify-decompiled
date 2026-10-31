package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dfa0 {
    public final y6r0 a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public dfa0(y6r0 y6r0Var, long j, String str, String str2, String str3, String str4) {
        this.a = y6r0Var;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final y6r0 d() {
        return this.a;
    }

    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfa0)) {
            return false;
        }
        dfa0 dfa0Var = (dfa0) obj;
        return u890.j(this.a, dfa0Var.a) && this.b == dfa0Var.b && u890.j(this.c, dfa0Var.c) && u890.j(this.d, dfa0Var.d) && u890.j(this.e, dfa0Var.e) && u890.j(this.f, dfa0Var.f);
    }

    public final int hashCode() {
        y6r0 y6r0Var = this.a;
        int iF = cy30.f((y6r0Var == null ? 0 : y6r0Var.a.hashCode()) * 31, this.b, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
