package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r370 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final pc60 i;

    public r370(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, pc60 pc60Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
        this.i = pc60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r370)) {
            return false;
        }
        r370 r370Var = (r370) obj;
        return this.a.equals(r370Var.a) && this.b.equals(r370Var.b) && this.c.equals(r370Var.c) && this.d.equals(r370Var.d) && this.e.equals(r370Var.e) && this.f.equals(r370Var.f) && this.g.equals(r370Var.g) && this.h == r370Var.h && u890.j(this.i, r370Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        pc60 pc60Var = this.i;
        return iG + (pc60Var == null ? 0 : pc60Var.hashCode());
    }
}
