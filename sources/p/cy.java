package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cy {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public cy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return this.a.equals(cyVar.a) && this.b.equals(cyVar.b) && this.c.equals(cyVar.c) && this.d.equals(cyVar.d) && this.e.equals(cyVar.e) && this.f.equals(cyVar.f) && this.g == cyVar.g && this.h == cyVar.h && this.i == cyVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
