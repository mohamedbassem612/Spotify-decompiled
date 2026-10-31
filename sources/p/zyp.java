package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zyp implements bsp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ zyp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final czb0 a(g7o0 g7o0Var, des desVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new czb0((xrp0) ((yxo) ((p2p) r7qVar).d).Q0.get(), g7o0Var, desVar);
            case 1:
                return new czb0((xrp0) ((o0q) ((p2p) r7qVar).d).X0.get(), g7o0Var, desVar);
            case 2:
                return new czb0((xrp0) ((v5q) ((thq) r7qVar).c).O2.get(), g7o0Var, desVar);
            case 3:
                return new czb0((xrp0) ((yxo) ((obq) r7qVar).d).T0.get(), g7o0Var, desVar);
            default:
                return new czb0((xrp0) r7qVar.d.O0.get(), g7o0Var, desVar);
        }
    }
}
