package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tnr0 {
    public final long a;
    public final float b;
    public final float c;
    public final eor0 d;

    public tnr0() {
        this(u7h.j, 0.0f, 0.0f, new eor0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnr0)) {
            return false;
        }
        tnr0 tnr0Var = (tnr0) obj;
        long j = tnr0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && p3v.c(this.b, tnr0Var.b) && p3v.c(this.c, tnr0Var.c) && u890.j(this.d, tnr0Var.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.d.hashCode() + x0d.f(x0d.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public tnr0(long j, float f, float f2, eor0 eor0Var) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = eor0Var;
    }
}
