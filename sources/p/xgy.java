package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xgy implements wgy {
    public final gg11 a;

    public xgy(gg11 gg11Var) {
        this.a = gg11Var;
    }

    @Override // p.wgy
    public final String a(ttm1 ttm1Var) {
        wgy wgyVar = (wgy) this.a.get(ttm1Var.e);
        if (wgyVar != null) {
            return wgyVar.a(ttm1Var);
        }
        return null;
    }
}
