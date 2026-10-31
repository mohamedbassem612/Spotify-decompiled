package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ir90 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ pp90 b;
    public /* synthetic */ ap90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir90(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        pp90 pp90Var = (pp90) obj;
        ap90 ap90Var = (ap90) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                ir90 ir90Var = new ir90(i, lnmVar, (byte) 0);
                ir90Var.b = pp90Var;
                ir90Var.c = ap90Var;
                return ir90Var.invokeSuspend(rih1Var);
            default:
                ir90 ir90Var2 = new ir90(i, lnmVar, (byte) 1);
                ir90Var2.b = pp90Var;
                ir90Var2.c = ap90Var;
                return ir90Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        zo90 zo90Var;
        switch (this.a) {
            case 0:
                pp90 pp90Var = this.b;
                ap90 ap90Var = this.c;
                hm5.M(obj);
                if (pp90Var == null || (zo90Var = ap90Var.b.c) == null) {
                    return null;
                }
                return new r6a0(pp90Var, zo90Var);
            default:
                pp90 pp90Var2 = this.b;
                ap90 ap90Var2 = this.c;
                hm5.M(obj);
                return bwp0.t(pp90Var2, ap90Var2);
        }
    }
}
