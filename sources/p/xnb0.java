package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xnb0 extends pim0 implements csr0 {
    public float O0;
    public boolean P0;

    @Override // p.csr0
    public final Object e(wat watVar, Object obj) {
        it31 it31Var = obj instanceof it31 ? (it31) obj : null;
        if (it31Var == null) {
            it31Var = new it31();
        }
        it31Var.a = this.O0;
        it31Var.b = this.P0;
        return it31Var;
    }
}
