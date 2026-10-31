package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w191 {
    public static final n8b1 a = irn1.l0(0.0f, 0.0f, null, 7);

    public static final tob1 a(long j, fe5 fe5Var, String str, b0k b0kVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            fe5Var = a;
        }
        fe5 fe5Var2 = fe5Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(u7h.e(j));
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            tzg1 tzg1Var = new tzg1(m4h.X0, new syf(u7h.e(j), (byte) 20));
            x340Var.s0(tzg1Var);
            objT = tzg1Var;
        }
        int i3 = i << 6;
        return z95.d(new u7h(j), (tzg1) objT, fe5Var2, (Float) null, str2, (iu30) null, x340Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
