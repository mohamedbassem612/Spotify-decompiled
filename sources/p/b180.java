package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b180 {
    public static int k;
    public static final hfb l = new hfb((byte) 13);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final aui1 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public b180(String str, float f, float f2, float f3, float f4, aui1 aui1Var, long j, int i, boolean z) {
        int iM = hfb.m();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = aui1Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = iM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b180)) {
            return false;
        }
        b180 b180Var = (b180) obj;
        if (!u890.j(this.a, b180Var.a) || !p3v.c(this.b, b180Var.b) || !p3v.c(this.c, b180Var.c) || this.d != b180Var.d || this.e != b180Var.e || !this.f.equals(b180Var.f)) {
            return false;
        }
        long j = b180Var.g;
        int i = u7h.l;
        return z4h1.b(this.g, j) && jm5.j(this.h, b180Var.h) && this.i == b180Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + x0d.f(x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        int i = u7h.l;
        return Boolean.hashCode(this.i) + ((jm5.l(this.h) + c13.f(iHashCode, this.g, 31)) * 31);
    }
}
