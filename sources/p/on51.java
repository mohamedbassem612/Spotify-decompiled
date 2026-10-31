package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class on51 {
    public static final on51 c;
    public static final on51 d;
    public final long a;
    public final long b;

    static {
        on51 on51Var = new on51(0L, 0L);
        new on51(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new on51(Long.MAX_VALUE, 0L);
        new on51(0L, Long.MAX_VALUE);
        d = on51Var;
    }

    public on51(long j, long j2) {
        dm5.m(j >= 0);
        dm5.m(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[RETURN] */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = zoi1.a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long jA = zoi1.a(j, j5);
        boolean z = j7 <= j2 && j2 <= jA;
        boolean z2 = j7 <= j3 && j3 <= jA;
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j7;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && on51.class == obj.getClass()) {
            on51 on51Var = (on51) obj;
            if (this.a == on51Var.a && this.b == on51Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
