package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mgv implements nma0 {
    public static final mgv a = new mgv();
    public static final qnw0 b = new qnw0("kotlin.time.Duration", knw0.o);

    public final Object deserialize(dar darVar) {
        ytw0 ytw0Var = jfv.b;
        String strV = darVar.V();
        try {
            long jT = fdg1.T(strV, true);
            if (jfv.f(jT, jfv.e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new jfv(jT);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(f4i1.f("Invalid ISO duration string format: '", strV, "'."), e);
        }
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        long j = ((jfv) obj).a;
        ytw0 ytw0Var = jfv.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jW = j < 0 ? jfv.w(j) : j;
        long jU = jfv.u(jW, ngv.g);
        int iJ = jfv.j(jW);
        int iL = jfv.l(jW);
        int iK = jfv.k(jW);
        if (jfv.n(j)) {
            jU = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = jU != 0;
        boolean z3 = (iL == 0 && iK == 0) ? false : true;
        if (iJ != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jU);
            sb.append('H');
        }
        if (z) {
            sb.append(iJ);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            jfv.b(sb, iL, iK, 9, "S", true);
        }
        uaxVar.h0(sb.toString());
    }
}
