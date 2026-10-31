package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kl3 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public kl3(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl3)) {
            return false;
        }
        kl3 kl3Var = (kl3) obj;
        return u890.j(this.a, kl3Var.a) && this.b == kl3Var.b && this.c == kl3Var.c && u890.j(this.d, kl3Var.d) && u890.j(this.e, kl3Var.e) && this.f == kl3Var.f && this.g == kl3Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(cy30.d(cy30.d(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
