package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aa9 {
    public final c380 a;
    public final c380 b;
    public final c380 c;
    public final String d;
    public final c380 e;
    public final boolean f;
    public final boolean g;

    public aa9(c380 c380Var, c380 c380Var2, c380 c380Var3, String str, c380 c380Var4, boolean z, boolean z2) {
        this.a = c380Var;
        this.b = c380Var2;
        this.c = c380Var3;
        this.d = str;
        this.e = c380Var4;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa9)) {
            return false;
        }
        aa9 aa9Var = (aa9) obj;
        return u890.j(this.a, aa9Var.a) && u890.j(this.b, aa9Var.b) && u890.j(this.c, aa9Var.c) && this.d.equals(aa9Var.d) && u890.j(this.e, aa9Var.e) && this.f == aa9Var.f && this.g == aa9Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(kk0.f(this.e, cy30.d(kk0.f(this.c, kk0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31, this.f);
    }
}
