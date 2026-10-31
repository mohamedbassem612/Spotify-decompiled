package p;

import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hkn1 {
    public static final i92 a;

    static {
        Logger.getLogger(hkn1.class.getName());
        zjn1 zjn1VarZ = akn1.z();
        zjn1VarZ.d();
        ((akn1) zjn1VarZ.b).A(-62135596800L);
        zjn1VarZ.d();
        ((akn1) zjn1VarZ.b).B(0);
        zjn1 zjn1VarZ2 = akn1.z();
        zjn1VarZ2.d();
        ((akn1) zjn1VarZ2.b).A(253402300799L);
        zjn1VarZ2.d();
        ((akn1) zjn1VarZ2.b).B(999999999);
        zjn1 zjn1VarZ3 = akn1.z();
        zjn1VarZ3.d();
        ((akn1) zjn1VarZ3.b).A(0L);
        zjn1VarZ3.d();
        ((akn1) zjn1VarZ3.b).B(0);
        a = new i92((byte) 18);
        try {
            Class.forName("j$.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }

    public static void a(akn1 akn1Var) {
        long jX = akn1Var.x();
        boolean z = jX >= -62135596800L && jX <= 253402300799L;
        int iY = akn1Var.y();
        if (!z || iY < 0 || iY >= 1000000000) {
            StringBuilder sb = new StringBuilder(String.valueOf(iY).length() + String.valueOf(jX).length() + 135 + 37);
            sb.append("Timestamp is not valid. See proto definition for valid values. Seconds (");
            sb.append(jX);
            sb.append(") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (");
            hhg1.n(gvg.j(sb, iY, ") must be in range [0, +999,999,999]."));
        }
    }

    public static akn1 b(int i, long j) {
        if (j < -62135596800L || j > 253402300799L) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 117);
            sb.append("Timestamp is not valid. Input seconds is too large. Seconds (");
            sb.append(j);
            sb.append(") must be in range [-62,135,596,800, +253,402,300,799]. ");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = Math.addExact(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = Math.subtractExact(j, 1L);
        }
        zjn1 zjn1VarZ = akn1.z();
        zjn1VarZ.d();
        ((akn1) zjn1VarZ.b).A(j);
        zjn1VarZ.d();
        ((akn1) zjn1VarZ.b).B(i);
        akn1 akn1Var = (akn1) zjn1VarZ.e();
        a(akn1Var);
        return akn1Var;
    }
}
