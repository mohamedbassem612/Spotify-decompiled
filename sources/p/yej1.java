package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yej1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;

    public yej1(String str, String str2, String str3, String str4, String str5, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yej1)) {
            return false;
        }
        yej1 yej1Var = (yej1) obj;
        return u890.j(this.a, yej1Var.a) && this.b.equals(yej1Var.b) && this.c.equals(yej1Var.c) && this.d.equals(yej1Var.d) && this.e.equals(yej1Var.e) && Float.compare(this.f, yej1Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
