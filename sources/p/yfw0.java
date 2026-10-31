package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yfw0 extends up30 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final tv80 i;

    public yfw0(String str, String str2, String str3, String str4, String str5, boolean z, tv80 tv80Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfw0)) {
            return false;
        }
        yfw0 yfw0Var = (yfw0) obj;
        return this.c.equals(yfw0Var.c) && this.d.equals(yfw0Var.d) && this.e.equals(yfw0Var.e) && this.f.equals(yfw0Var.f) && u890.j(this.g, yfw0Var.g) && this.h == yfw0Var.h && u890.j(this.i, yfw0Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        tv80 tv80Var = this.i;
        return iG + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
