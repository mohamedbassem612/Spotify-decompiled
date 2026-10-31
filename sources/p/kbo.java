package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kbo {
    public final String a;
    public final String b;
    public final d8r0 c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public kbo(String str, String str2, d8r0 d8r0Var, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = d8r0Var;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbo)) {
            return false;
        }
        kbo kboVar = (kbo) obj;
        return u890.j(this.a, kboVar.a) && u890.j(this.b, kboVar.b) && this.c.equals(kboVar.c) && this.d == kboVar.d && this.e == kboVar.e && this.f == kboVar.f && this.g == kboVar.g && this.h == kboVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.d, hrt.i(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }
}
