package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y19 {
    public final xqg a;
    public final HashMap b;

    public y19(xqg xqgVar, HashMap map) {
        this.a = xqgVar;
        this.b = map;
    }

    public final long a(xnw0 xnw0Var, long j, int i) {
        long jB = j - this.a.b();
        z19 z19Var = (z19) this.b.get(xnw0Var);
        long j2 = z19Var.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jB), z19Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y19)) {
            return false;
        }
        y19 y19Var = (y19) obj;
        return this.a.equals(y19Var.a) && this.b.equals(y19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
