package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vvl1 {
    public final long a;
    public final long b;

    public vvl1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vvl1.class.equals(obj.getClass())) {
            vvl1 vvl1Var = (vvl1) obj;
            if (vvl1Var.a == this.a && vvl1Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
