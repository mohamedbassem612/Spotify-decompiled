package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oyh1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public oyh1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        if (!(obj instanceof oyh1)) {
            return false;
        }
        oyh1 oyh1Var = (oyh1) obj;
        return u890.j(this.a, oyh1Var.a) && u890.j(this.b, oyh1Var.b) && u890.j(this.c, oyh1Var.c) && u890.j(this.d, oyh1Var.d) && u890.j(this.e, oyh1Var.e) && u890.j(this.f, oyh1Var.f) && u890.j(this.g, oyh1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
