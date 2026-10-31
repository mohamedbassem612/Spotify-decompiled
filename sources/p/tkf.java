package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tkf {
    public final String a;
    public final String b;
    public final pkf c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public tkf(String str, String str2, pkf pkfVar, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = pkfVar;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkf)) {
            return false;
        }
        tkf tkfVar = (tkf) obj;
        return u890.j(this.a, tkfVar.a) && this.b.equals(tkfVar.b) && this.c.equals(tkfVar.c) && u890.j(this.d, tkfVar.d) && this.e == tkfVar.e && this.f == tkfVar.f && this.g == tkfVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
