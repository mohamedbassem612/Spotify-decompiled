package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jfw0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ofw0 b;

    public /* synthetic */ jfw0(ofw0 ofw0Var, byte b) {
        this.a = b;
        this.b = ofw0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ofw0 ofw0Var = this.b;
        switch (b) {
            case 0:
                ofw0Var.k(new ydw0(((Boolean) obj).booleanValue()));
                break;
            case 1:
                ofw0Var.k(new tdw0((hwt) obj));
                break;
            case 2:
                sgn0 sgn0Var = (sgn0) obj;
                ofw0Var.k(new xdw0(sgn0Var.b, sgn0Var.a));
                break;
            case 3:
                ofw0Var.k(new sdw0((zkm) obj));
                break;
            default:
                ofw0Var.k(new bew0(((Boolean) obj).booleanValue()));
                break;
        }
        return rih1Var;
    }
}
