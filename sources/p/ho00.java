package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ho00 implements e9d0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tqh0 b;

    public /* synthetic */ ho00(tqh0 tqh0Var, byte b) {
        this.a = b;
        this.b = tqh0Var;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        tqh0 tqh0Var = this.b;
        o8u0 o8u0Var = (o8u0) obj;
        switch (b) {
            case 0:
                o8u0Var.n0(tqh0Var);
                break;
            default:
                o8u0Var.A(tqh0Var);
                break;
        }
    }
}
