package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ttk1 {
    public final float a;
    public final String b;
    public final int c;
    public final ke71 d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ ttk1(float f, String str, int i, ke71 ke71Var, boolean z, boolean z2, int i2) {
        this(f, str, i, (i2 & 8) != 0 ? new ke71() : ke71Var, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttk1)) {
            return false;
        }
        ttk1 ttk1Var = (ttk1) obj;
        return Float.compare(this.a, ttk1Var.a) == 0 && u890.j(this.b, ttk1Var.b) && this.c == ttk1Var.c && u890.j(this.d, ttk1Var.d) && this.e == ttk1Var.e && this.f == ttk1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + ab80.k(this.c, cy30.d(Float.hashCode(this.a) * 31, 31, this.b), 31)) * 31, 31, this.e);
    }

    public ttk1(float f, String str, int i, ke71 ke71Var, boolean z, boolean z2) {
        this.a = f;
        this.b = str;
        this.c = i;
        this.d = ke71Var;
        this.e = z;
        this.f = z2;
    }
}
