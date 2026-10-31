package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vps implements dr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vps(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.dr20
    public final float invoke() {
        b8f1 state;
        b8f1 state2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                a8f1 a8f1Var = ((i191) obj).k;
                if (a8f1Var == null || (state = a8f1Var.getState()) == null) {
                    return 0.0f;
                }
                return state.c.s();
            default:
                a8f1 a8f1Var2 = ((szg1) obj).o;
                if (a8f1Var2 == null || (state2 = a8f1Var2.getState()) == null) {
                    return 0.0f;
                }
                return state2.c.s();
        }
    }
}
