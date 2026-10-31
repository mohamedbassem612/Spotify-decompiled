package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rn10 {
    public final String a;
    public final String b;
    public final amh0 c;
    public final String d;
    public final ur20 e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;

    public rn10(String str, String str2, amh0 amh0Var, String str3, ur20 ur20Var, String str4, boolean z, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = amh0Var;
        this.d = str3;
        this.e = ur20Var;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn10)) {
            return false;
        }
        rn10 rn10Var = (rn10) obj;
        return this.a.equals(rn10Var.a) && this.b.equals(rn10Var.b) && this.c.equals(rn10Var.c) && this.d.equals(rn10Var.d) && u890.j(this.e, rn10Var.e) && this.f.equals(rn10Var.f) && this.g == rn10Var.g && this.h.equals(rn10Var.h) && this.i.equals(rn10Var.i) && this.j.equals(rn10Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        ur20 ur20Var = this.e;
        return this.j.hashCode() + cy30.d(cy30.d(xcg1.g(cy30.d((iD + (ur20Var == null ? 0 : ur20Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
