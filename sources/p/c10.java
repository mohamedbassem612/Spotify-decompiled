package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ c10(String str, int i, String str2, String str3, boolean z, String str4) {
        this((i & 1) != 0 ? "" : "TIME", (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z, false);
    }

    public static c10 a(c10 c10Var) {
        return new c10(c10Var.a, c10Var.b, c10Var.c, c10Var.d, c10Var.e, c10Var.f, true);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        return u890.j(this.a, c10Var.a) && u890.j(this.b, c10Var.b) && u890.j(this.c, c10Var.c) && u890.j(this.d, c10Var.d) && u890.j(this.e, c10Var.e) && this.f == c10Var.f && this.g == c10Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public c10(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
    }
}
