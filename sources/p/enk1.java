package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class enk1 {
    public final long a;
    public final float b;
    public final float c;
    public final boolean d;
    public final umk1 e;
    public final boolean f;

    public enk1(long j, umk1 umk1Var, boolean z, int i) {
        j = (i & 1) != 0 ? u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14) : j;
        float f = (i & 2) != 0 ? Float.NaN : 16.0f;
        float f2 = (i & 4) == 0 ? 32.0f : Float.NaN;
        boolean z2 = (i & 8) != 0;
        umk1Var = (i & 16) != 0 ? rmk1.a : umk1Var;
        z = (i & 32) != 0 ? true : z;
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = z2;
        this.e = umk1Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enk1)) {
            return false;
        }
        enk1 enk1Var = (enk1) obj;
        long j = enk1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && p3v.c(this.b, enk1Var.b) && p3v.c(this.c, enk1Var.c) && this.d == enk1Var.d && this.e.equals(enk1Var.e) && this.f == enk1Var.f;
    }

    public final int hashCode() {
        int i = u7h.l;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + xcg1.g(x0d.f(x0d.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
