package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class do01 {
    public static final long a;
    public static final long b;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(2, ngv.f);
        b = fdg1.k0(7, ngv.h);
    }

    public static final mmw0 a(Long l) {
        if (l.longValue() < 0) {
            l = null;
        }
        return l != null ? new lmw0(l.longValue()) : kmw0.a;
    }

    public static final boolean b(co01 co01Var, boolean z, long j, mmw0 mmw0Var) {
        int i = co01Var.c;
        if (z && i > 0) {
            long j2 = ((long) i) * 1000;
            long j3 = j - j2;
            if (j3 >= (-jfv.h(a)) && j3 < jfv.h(b) && !mmw0Var.equals(kmw0.a)) {
                if (mmw0Var.equals(jmw0.a)) {
                    return true;
                }
                if (mmw0Var instanceof lmw0) {
                    long j4 = ((lmw0) mmw0Var).a;
                    if (j4 >= 0 && j2 > j4) {
                        return true;
                    }
                } else {
                    eg.o();
                }
            }
        }
        return false;
    }
}
