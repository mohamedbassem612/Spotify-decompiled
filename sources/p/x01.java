package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x01 {
    public static final bma1 b;
    public static final bma1 c;
    public static final bma1 d;
    public final dma1 a;

    static {
        nbc nbcVar = bma1.b;
        b = nbcVar.q("ADAPTIVE_AUTH_METADATA_AUTH_SOURCE");
        c = nbcVar.q("ADAPTIVE_AUTH_METADATA_DEEPLINK");
        d = nbcVar.q("ADAPTIVE_AUTH_METADATA_REFERRER");
    }

    public x01(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final y01 a() {
        dma1 dma1Var = this.a;
        String strE = dma1Var.e(b, (String) null);
        return new y01(dma1Var.e(c, (String) null), dma1Var.e(d, (String) null), strE != null ? bk8.valueOf(strE) : null);
    }

    public final void b(bma1 bma1Var, String str) {
        hma1 hma1VarEdit = this.a.edit();
        if (str != null) {
            hma1VarEdit.d(bma1Var, str);
        } else {
            hma1VarEdit.f(bma1Var);
        }
        hma1VarEdit.g();
    }
}
