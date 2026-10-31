package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jve1 {
    public final long a;
    public final long b;
    public final long c;

    public jve1() {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.e;
        long jK0 = fdg1.k0(45, ngvVar);
        long jK1 = fdg1.k0(5, ngvVar);
        long jK2 = fdg1.k0(5, ngvVar);
        this.a = jK0;
        this.b = jK1;
        this.c = jK2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jve1)) {
            return false;
        }
        jve1 jve1Var = (jve1) obj;
        return jfv.f(this.a, jve1Var.a) && jfv.f(this.b, jve1Var.b) && jfv.f(this.c, jve1Var.c);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return n9x0.R0.hashCode() + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) jfv.v(this.a)) + ", additionalTime=" + ((Object) jfv.v(this.b)) + ", idleTimeout=" + ((Object) jfv.v(this.c)) + ", timeSource=" + n9x0.R0 + ')';
    }
}
