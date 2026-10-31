package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gkn1 {
    static {
        fin1 fin1VarZ = gin1.z();
        fin1VarZ.d();
        ((gin1) fin1VarZ.b).B(-315576000000L);
        fin1VarZ.d();
        ((gin1) fin1VarZ.b).C(-999999999);
        fin1 fin1VarZ2 = gin1.z();
        fin1VarZ2.d();
        ((gin1) fin1VarZ2.b).B(315576000000L);
        fin1VarZ2.d();
        ((gin1) fin1VarZ2.b).C(999999999);
        fin1 fin1VarZ3 = gin1.z();
        fin1VarZ3.d();
        ((gin1) fin1VarZ3.b).B(0L);
        fin1VarZ3.d();
        ((gin1) fin1VarZ3.b).C(0);
    }

    public static void a(gin1 gin1Var) {
        long jX = gin1Var.x();
        int iY = gin1Var.y();
        if (jX >= -315576000000L && jX <= 315576000000L && iY >= -999999999 && iY < 1000000000) {
            if (jX >= 0 && iY >= 0) {
                return;
            }
            if (jX <= 0 && iY <= 0) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iY).length() + String.valueOf(jX).length() + 135 + 89);
        sb.append("Duration is not valid. See proto definition for valid values. Seconds (");
        sb.append(jX);
        sb.append(") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (");
        hhg1.n(gvg.j(sb, iY, ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds"));
    }

    public static gin1 b(int i, long j) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = Math.addExact(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        fin1 fin1VarZ = gin1.z();
        fin1VarZ.d();
        ((gin1) fin1VarZ.b).B(j);
        fin1VarZ.d();
        ((gin1) fin1VarZ.b).C(i);
        gin1 gin1Var = (gin1) fin1VarZ.e();
        a(gin1Var);
        return gin1Var;
    }
}
