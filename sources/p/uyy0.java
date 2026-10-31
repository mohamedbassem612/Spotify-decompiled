package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uyy0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public uyy0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        if (!(obj instanceof uyy0)) {
            return false;
        }
        uyy0 uyy0Var = (uyy0) obj;
        return this.a.equals(uyy0Var.a) && this.b.equals(uyy0Var.b) && this.c.equals(uyy0Var.c) && this.d.equals(uyy0Var.d) && this.e.equals(uyy0Var.e) && this.f.equals(uyy0Var.f) && this.g.equals(uyy0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
