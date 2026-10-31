package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mog extends x1p1 {
    public final i8g1 c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;

    public mog(i8g1 i8g1Var, String str, String str2, int i, int i2, String str3, String str4, String str5, long j) {
        this.c = i8g1Var;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mog)) {
            return false;
        }
        mog mogVar = (mog) obj;
        return u890.j(this.c, mogVar.c) && u890.j(this.d, mogVar.d) && this.e.equals(mogVar.e) && this.f == mogVar.f && this.g == mogVar.g && this.h.equals(mogVar.h) && u890.j(this.i, mogVar.i) && u890.j(this.j, mogVar.j) && this.k == mogVar.k;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.g, kaa0.f(this.f, cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
        String str = this.j;
        return Long.hashCode(this.k) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
