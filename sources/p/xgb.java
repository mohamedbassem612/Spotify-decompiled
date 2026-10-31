package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xgb implements io20 {
    public final kly0 a;

    public static vqo c(xgb xgbVar, t1s0 t1s0Var, String str, int i, int i2, int i3, int i4, mr20 mr20Var, int i5) {
        return xgbVar.a(t1s0Var, str, i, i2, i3, i4, null, (i5 & 128) != 0 ? new huz(Boolean.TRUE, (byte) 10) : mr20Var);
    }

    public vqo a(t1s0 t1s0Var, String str, int i, int i2, int i3, int i4, h2s0 h2s0Var, mr20 mr20Var) {
        cxo1 cxo1Var = cxo1.P0;
        return new vqo(str, new uqo(Integer.valueOf(i2), null, Integer.valueOf(i3), null, 26), mr20Var, cxo1Var, this.a, new sqo(new hh6(str, t1s0Var, i4, i, h2s0Var)));
    }

    public Object b() {
        return Integer.valueOf(((dhb) this.a.get()).A());
    }
}
