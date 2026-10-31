package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dk40 extends ck40 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public dk40(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk40)) {
            return false;
        }
        dk40 dk40Var = (dk40) obj;
        return u890.j(this.a, dk40Var.a) && u890.j(this.b, dk40Var.b) && this.c == dk40Var.c && u890.j(this.d, dk40Var.d) && u890.j(this.e, dk40Var.e) && this.f.equals(dk40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
