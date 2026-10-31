package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dih1 implements g0x {
    public final long a;
    public final boolean b;
    public final e441 c;
    public final boolean d;

    public dih1(long j, boolean z, e441 e441Var, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = e441Var;
        this.d = z2;
    }

    public static dih1 f(dih1 dih1Var, long j, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            j = dih1Var.a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = dih1Var.b;
        }
        boolean z3 = z;
        e441 e441Var = dih1Var.c;
        if ((i & 8) != 0) {
            z2 = dih1Var.d;
        }
        return new dih1(j2, z3, e441Var, z2);
    }

    public final boolean a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final e441 c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dih1)) {
            return false;
        }
        dih1 dih1Var = (dih1) obj;
        return yr80.b(this.a, dih1Var.a) && this.b == dih1Var.b && u890.j(this.c, dih1Var.c) && this.d == dih1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + xcg1.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
