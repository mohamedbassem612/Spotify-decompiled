package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o00 implements m10 {
    public final int a;
    public final int b;
    public final fde1 c;
    public final boolean d;
    public final c380 e;
    public final long f;

    public o00(int i, int i2, fde1 fde1Var, boolean z, c380 c380Var, long j) {
        this.a = i;
        this.b = i2;
        this.c = fde1Var;
        this.d = z;
        this.e = c380Var;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return this.a == o00Var.a && this.b == o00Var.b && this.c == o00Var.c && this.d == o00Var.d && this.e.equals(o00Var.e) && this.f == o00Var.f;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
        fde1 fde1Var = this.c;
        return Long.hashCode(this.f) + kk0.f(this.e, xcg1.g((iF + (fde1Var == null ? 0 : fde1Var.hashCode())) * 31, 31, this.d), 31);
    }
}
