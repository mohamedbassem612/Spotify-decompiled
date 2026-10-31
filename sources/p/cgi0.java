package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cgi0 {
    public static final cgi0 g;
    public final float a;
    public final int b;
    public final har0 c;
    public final float d;
    public final byte e;
    public final int f;

    static {
        new cgi0(63);
        g = new cgi0(60);
    }

    public /* synthetic */ cgi0(int i) {
        this((i & 1) != 0 ? 0.85f : 0.74f, (i & 2) != 0 ? 427 : 360, new har0(0), 0.6f, 12, (i & 32) == 0 ? 12 : 0);
    }

    public static cgi0 a(cgi0 cgi0Var, har0 har0Var) {
        float f = cgi0Var.a;
        int i = cgi0Var.b;
        float f2 = cgi0Var.d;
        byte b = cgi0Var.e;
        int i2 = cgi0Var.f;
        cgi0Var.getClass();
        return new cgi0(f, i, har0Var, f2, b, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgi0)) {
            return false;
        }
        cgi0 cgi0Var = (cgi0) obj;
        return Float.compare(this.a, cgi0Var.a) == 0 && this.b == cgi0Var.b && u890.j(this.c, cgi0Var.c) && Float.compare(this.d, cgi0Var.d) == 0 && this.e == cgi0Var.e && this.f == cgi0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, x0d.f(kaa0.f(this.c.a, kaa0.f(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d), 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cgi0(float f, int i, har0 har0Var, float f2, int i2, int i3) {
        this.a = f;
        this.b = i;
        this.c = har0Var;
        this.d = f2;
        this.e = i2;
        this.f = i3;
    }
}
