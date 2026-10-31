package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ok80 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pk80 b;

    public /* synthetic */ ok80(pk80 pk80Var, byte b) {
        this.a = b;
        this.b = pk80Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pk80 pk80Var = this.b;
        pk80 pk80Var2 = (dpg1) obj;
        switch (b) {
            case 0:
                pk80 pk80Var3 = pk80Var2;
                erl1 erl1Var = pk80Var.P0;
                if (!u890.j(pk80Var3.O0, erl1Var)) {
                    pk80Var3.O0 = erl1Var;
                    pk80Var3.I1();
                }
                return cpg1.b;
            default:
                pk80Var.O0 = pk80Var2.P0;
                return Boolean.FALSE;
        }
    }
}
