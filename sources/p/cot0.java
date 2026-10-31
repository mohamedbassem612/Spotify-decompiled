package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cot0 {
    public final r4z a;
    public final long b;
    public final p1p1 c;
    public final ebp1 d;
    public final boolean e;

    public cot0(r4z r4zVar, long j, p1p1 p1p1Var, ebp1 ebp1Var, boolean z) {
        this.a = r4zVar;
        this.b = j;
        this.c = p1p1Var;
        this.d = ebp1Var;
        this.e = z;
    }

    public static cot0 a(cot0 cot0Var, r4z r4zVar, long j, p1p1 p1p1Var, int i) {
        if ((i & 1) != 0) {
            r4zVar = cot0Var.a;
        }
        r4z r4zVar2 = r4zVar;
        if ((i & 2) != 0) {
            j = cot0Var.b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            p1p1Var = cot0Var.c;
        }
        return new cot0(r4zVar2, j2, p1p1Var, cot0Var.d, (i & 16) != 0 ? cot0Var.e : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cot0)) {
            return false;
        }
        cot0 cot0Var = (cot0) obj;
        return this.a.equals(cot0Var.a) && this.b == cot0Var.b && this.c.equals(cot0Var.c) && this.d.equals(cot0Var.d) && this.e == cot0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }
}
