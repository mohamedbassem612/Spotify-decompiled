package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dl01 {
    public final cl01 a;
    public final c380 b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public dl01(cl01 cl01Var, c380 c380Var, boolean z, String str, boolean z2) {
        this.a = cl01Var;
        this.b = c380Var;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl01)) {
            return false;
        }
        dl01 dl01Var = (dl01) obj;
        return this.a.equals(dl01Var.a) && u890.j(this.b, dl01Var.b) && this.c == dl01Var.c && this.d.equals(dl01Var.d) && this.e == dl01Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(xcg1.g(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
