package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a1g {
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public final dma1 a;
    public final yqg b;

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.q("child_initiated_auth_session_flow_type");
        d = nbcVar.q("child_initiated_auth_session_flow_id");
        e = nbcVar.q("child_initiated_auth_session_valid_until_timestamp");
    }

    public a1g(yqg yqgVar, dma1 dma1Var) {
        this.a = dma1Var;
        this.b = yqgVar;
    }

    public final void a() {
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.f(c);
        hma1VarEdit.f(d);
        hma1VarEdit.f(e);
        hma1VarEdit.g();
    }

    public final z0g b() {
        dma1 dma1Var = this.a;
        String strE = dma1Var.e(c, (String) null);
        String strE2 = dma1Var.e(d, (String) null);
        long jG = dma1Var.g(e, 0L);
        if (strE == null || strE2 == null) {
            return null;
        }
        long jB = this.b.b();
        if (jG <= 0 || jB < jG) {
            return new z0g(jG, ktd.c(strE), strE2);
        }
        a();
        return null;
    }
}
