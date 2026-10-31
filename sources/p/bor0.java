package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bor0 {
    public final long a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;

    public bor0(long j, String str, float f, float f2, float f3) {
        this.a = j;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final float a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bor0)) {
            return false;
        }
        bor0 bor0Var = (bor0) obj;
        long j = bor0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && u890.j(this.b, bor0Var.b) && p3v.c(this.c, bor0Var.c) && p3v.c(this.d, bor0Var.d) && p3v.c(this.e, bor0Var.e);
    }

    public final int hashCode() {
        int i = u7h.l;
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Float.hashCode(this.e) + x0d.f(x0d.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
