package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jsv0 implements m270 {
    public final pjm0 a;
    public final yqg b;
    public final nsm0 c;

    public jsv0(zle1 zle1Var, yqg yqgVar, rrv0 rrv0Var) {
        pjm0 pjm0Var = ((s45) zle1Var).a;
        nsm0 nsm0Var = new nsm0(2, rrv0Var, rrv0.class, "transportTimingsReceived", "transportTimingsReceived(JJ)V", 0, (byte) 9);
        this.a = pjm0Var;
        this.b = yqgVar;
        this.c = nsm0Var;
    }

    public final void a(jf01 jf01Var, st60 st60Var) {
        s7g1 s7g1Var;
        Long l;
        j4g1 j4g1Var = (j4g1) st60Var.c;
        if (j4g1Var == null || (s7g1Var = (s7g1) o7h.C0(j4g1Var.e)) == null || (l = s7g1Var.i) == null) {
            return;
        }
        long jLongValue = l.longValue();
        Long l2 = s7g1Var.k;
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            long jA = this.a.a();
            long jB = this.b.b();
            this.c.invoke(Long.valueOf(jA - ((jB - jLongValue) * 1000)), Long.valueOf(jA - ((jB - jLongValue2) * 1000)));
        }
    }
}
