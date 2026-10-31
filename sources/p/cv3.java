package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cv3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public cv3(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv3)) {
            return false;
        }
        cv3 cv3Var = (cv3) obj;
        return this.a.equals(cv3Var.a) && this.b.equals(cv3Var.b) && this.c.equals(cv3Var.c) && this.d.equals(cv3Var.d) && this.e == cv3Var.e && u890.j(this.f, cv3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
