package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z03 implements wih0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jjq b;

    public /* synthetic */ z03(jjq jjqVar, byte b) {
        this.a = b;
        this.b = jjqVar;
    }

    @Override // p.wih0
    public final vih0 a(ruk rukVar, x610 x610Var, lxh0 lxh0Var) {
        byte b = this.a;
        jjq jjqVar = this.b;
        switch (b) {
            case 0:
                return jjqVar.a(rukVar, x610Var, lxh0Var, mct0.b);
            default:
                return jjqVar.a(rukVar, x610Var, lxh0Var, mct0.H1);
        }
    }
}
