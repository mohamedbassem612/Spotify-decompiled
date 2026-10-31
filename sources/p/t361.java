package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t361 {
    public final String a;
    public final String b;
    public final String c;
    public final byte d;
    public final boolean e;
    public final s361 f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public t361(String str, String str2, String str3, int i, boolean z, s361 s361Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = s361Var;
        this.g = z2;
    }

    public static t361 a(t361 t361Var, boolean z) {
        return new t361(t361Var.a, t361Var.b, t361Var.c, t361Var.d, z, t361Var.f, t361Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t361)) {
            return false;
        }
        t361 t361Var = (t361) obj;
        return u890.j(this.a, t361Var.a) && u890.j(this.b, t361Var.b) && u890.j(this.c, t361Var.c) && this.d == t361Var.d && this.e == t361Var.e && this.f.equals(t361Var.f) && this.g == t361Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + xcg1.g(kaa0.f(this.d, cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31);
    }
}
