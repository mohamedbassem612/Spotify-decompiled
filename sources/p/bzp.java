package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bzp implements p20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ bzp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.p20
    public final umf0 a(mdp0 mdp0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new umf0(mdp0Var, xqu.a(((yxo) ((p2p) r7qVar).d).Z));
            case 1:
                return new umf0(mdp0Var, xqu.a(((o0q) ((p2p) r7qVar).d).U0));
            case 2:
                return new umf0(mdp0Var, xqu.a(((v5q) ((thq) r7qVar).c).L2));
            case 3:
                return new umf0(mdp0Var, xqu.a((obq) ((yxo) ((obq) r7qVar).d).P0));
            default:
                return new umf0(mdp0Var, xqu.a(r7qVar.d.X));
        }
    }
}
