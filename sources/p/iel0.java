package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iel0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ uel0 c;

    public iel0(uel0 uel0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = uel0Var;
                x6h1 x6h1VarC = uel0Var.a.c();
                x6h1VarC.i.add(new a7h1("control_panel_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = uel0Var;
                x6h1 x6h1VarC2 = uel0Var.a.c();
                x6h1VarC2.i.add(new a7h1("chip_panel_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            default:
                r6h1 r6h1Var2 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }
}
