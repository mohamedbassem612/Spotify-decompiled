package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jo0 {
    public final re00 a;
    public final q8n b;
    public final xn0 c;

    public jo0(re00 re00Var, q8n q8nVar, xn0 xn0Var, yqg yqgVar) {
        this.a = re00Var;
        this.b = q8nVar;
        this.c = xn0Var;
    }

    public static Object a(jo0 jo0Var, co0 co0Var, String str, long j, String str2, String str3, String str4, String str5, a8d1 a8d1Var, int i) {
        long j2 = (i & 4) != 0 ? -1L : j;
        String str6 = (i & 8) != 0 ? null : str2;
        String str7 = (i & 16) != 0 ? null : str3;
        String str8 = (i & 64) != 0 ? null : str4;
        String str9 = (i & 128) != 0 ? null : str5;
        jo0Var.getClass();
        co0Var.getClass();
        int i2 = gr0.a;
        Object objH = c921.H(jo0Var.b, new ho0(str, co0Var, j2, str8, str6, str7, str9, jo0Var, (lnm) null), a8d1Var);
        return objH == d9n.a ? objH : rih1.a;
    }
}
