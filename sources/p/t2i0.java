package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class t2i0 implements akl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mgc b;
    public final /* synthetic */ d2e0 c;
    public final /* synthetic */ qqh0 d;

    public /* synthetic */ t2i0(mgc mgcVar, d2e0 d2e0Var, qqh0 qqh0Var, byte b) {
        this.a = b;
        this.b = mgcVar;
        this.c = d2e0Var;
        this.d = qqh0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        qqh0 qqh0Var = this.d;
        d2e0 d2e0Var = this.c;
        mgc mgcVar = this.b;
        w2i0 w2i0Var = (w2i0) obj;
        switch (b) {
            case 0:
                w2i0Var.d(mgcVar.b, (p2i0) mgcVar.c, d2e0Var, qqh0Var);
                break;
            default:
                w2i0Var.h(mgcVar.b, (p2i0) mgcVar.c, d2e0Var, qqh0Var);
                break;
        }
    }
}
