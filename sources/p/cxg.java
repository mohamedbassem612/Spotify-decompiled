package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cxg implements isi0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ynb0 b;
    public final /* synthetic */ pdy0 c;

    public /* synthetic */ cxg(pdy0 pdy0Var, ynb0 ynb0Var, byte b) {
        this.a = b;
        this.c = pdy0Var;
        this.b = ynb0Var;
    }

    @Override // p.isi0
    public final void a() {
        wf01 wf01VarD;
        byte b = this.a;
        ynb0 ynb0Var = this.b;
        pdy0 pdy0Var = this.c;
        switch (b) {
            case 0:
                if (((zk4) pdy0Var).a() && (wf01VarD = ((rf01) ynb0Var.get()).d()) != null) {
                    wf01VarD.a();
                    break;
                }
                break;
            default:
                if (((qg4) pdy0Var).a()) {
                    ((qu00) ynb0Var.get()).a.f(-1);
                }
                break;
        }
    }
}
