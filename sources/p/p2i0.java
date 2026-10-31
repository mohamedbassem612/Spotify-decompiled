package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p2i0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public p2i0(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final p2i0 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new p2i0(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(p2i0 p2i0Var) {
        if (p2i0Var == null) {
            return false;
        }
        if (this == p2i0Var) {
            return true;
        }
        return this.a.equals(p2i0Var.a) && this.b == p2i0Var.b && this.c == p2i0Var.c && this.d == p2i0Var.d;
    }

    public final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2i0)) {
            return false;
        }
        p2i0 p2i0Var = (p2i0) obj;
        return b(p2i0Var) && this.e == p2i0Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public p2i0(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public p2i0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public p2i0(Object obj) {
        this(-1L, obj);
    }
}
