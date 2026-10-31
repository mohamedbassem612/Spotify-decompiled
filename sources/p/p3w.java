package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p3w {
    public final String a;
    public final String b;
    public final zah1 c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public p3w(String str, String str2, zah1 zah1Var, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = zah1Var;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3w)) {
            return false;
        }
        p3w p3wVar = (p3w) obj;
        return this.a.equals(p3wVar.a) && this.b.equals(p3wVar.b) && u890.j(this.c, p3wVar.c) && u890.j(this.d, p3wVar.d) && this.e == p3wVar.e && this.f == p3wVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        zah1 zah1Var = this.c;
        int iHashCode = (iD + (zah1Var == null ? 0 : zah1Var.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.f) + xcg1.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }
}
