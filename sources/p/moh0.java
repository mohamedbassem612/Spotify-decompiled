package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class moh0 {
    public static final moh0 i = new moh0(new loh0());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f91p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public moh0(loh0 loh0Var) {
        this.a = zoi1.n0(loh0Var.a);
        this.c = zoi1.n0(loh0Var.b);
        this.b = loh0Var.a;
        this.d = loh0Var.b;
        this.e = loh0Var.c;
        this.f = loh0Var.d;
        this.g = loh0Var.e;
        this.h = loh0Var.f;
    }

    public final loh0 a() {
        loh0 loh0Var = new loh0();
        loh0Var.a = this.b;
        loh0Var.b = this.d;
        loh0Var.c = this.e;
        loh0Var.d = this.f;
        loh0Var.e = this.g;
        loh0Var.f = this.h;
        return loh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moh0)) {
            return false;
        }
        moh0 moh0Var = (moh0) obj;
        return this.b == moh0Var.b && this.d == moh0Var.d && this.e == moh0Var.e && this.f == moh0Var.f && this.g == moh0Var.g && this.h == moh0Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
