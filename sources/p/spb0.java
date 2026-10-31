package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class spb0 implements fy11 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ct41 b;

    public /* synthetic */ spb0(ct41 ct41Var, byte b) {
        this.a = b;
        this.b = ct41Var;
    }

    @Override // p.fy11
    public final void w(hmb0 hmb0Var) {
        byte b = this.a;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case 0:
                ((upb0) xtb0Var).j = hmb0Var;
                break;
            case 1:
                xtb0Var.l = hmb0Var;
                break;
            default:
                ((fvb0) xtb0Var).h = hmb0Var;
                break;
        }
    }
}
