package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h161 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i161 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h161(i161 i161Var, byte b) {
        super(1);
        this.a = b;
        this.b = i161Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        i161 i161Var = this.b;
        switch (b) {
            case 0:
                return new zo51(new tu41(i161Var.e.m(i161Var.a, i161Var.b, i161.t), (byte) 4), i161Var, (byte) 3);
            default:
                return new jxz0(0, "", i161Var.b, z6x.a);
        }
    }
}
