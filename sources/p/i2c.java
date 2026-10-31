package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i2c implements g2c {
    public final wat a;
    public final long b;

    public i2c(tlc1 tlc1Var, long j) {
        this.a = tlc1Var;
        this.b = j;
    }

    @Override // p.g2c
    public final qim0 a(qim0 qim0Var, tl3 tl3Var) {
        return qim0Var.then(new o1c(tl3Var, false));
    }

    @Override // p.g2c
    public final qim0 b(qim0 qim0Var) {
        return qim0Var.then(new o1c(een.h, true));
    }

    public final float c() {
        long j = this.b;
        if (!hjl.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.M0(hjl.h(j));
    }

    public final float d() {
        long j = this.b;
        if (!hjl.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.M0(hjl.i(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2c)) {
            return false;
        }
        i2c i2cVar = (i2c) obj;
        return u890.j(this.a, i2cVar.a) && hjl.c(this.b, i2cVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + hjl.m(this.b) + ")";
    }
}
