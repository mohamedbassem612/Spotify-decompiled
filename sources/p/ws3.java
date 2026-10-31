package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ws3 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ ws3(ven0 ven0Var, ven0 ven0Var2, byte b) {
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final void dispose() {
        byte b = this.a;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.b;
        switch (b) {
            case 0:
                r091 r091Var = (r091) ven0Var2.getValue();
                if (r091Var != null) {
                    r091Var.g();
                }
                ven0Var2.setValue((Object) null);
                ven0Var.setValue((Object) null);
                break;
            default:
                r091 r091Var2 = (r091) ven0Var2.getValue();
                if (r091Var2 != null) {
                    r091Var2.g();
                }
                ven0Var2.setValue((Object) null);
                ven0Var.setValue((Object) null);
                break;
        }
    }
}
