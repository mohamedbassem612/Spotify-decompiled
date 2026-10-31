package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m5r0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public m5r0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5r0)) {
            return false;
        }
        m5r0 m5r0Var = (m5r0) obj;
        return this.a.equals(m5r0Var.a) && this.b.equals(m5r0Var.b) && this.c.equals(m5r0Var.c) && this.d.equals(m5r0Var.d) && this.e.equals(m5r0Var.e) && this.f.equals(m5r0Var.f) && this.g.equals(m5r0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
