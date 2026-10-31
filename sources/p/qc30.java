package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qc30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc30(lzn0 lzn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = lzn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 8;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        lzn0 lzn0Var = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new skv(lzn0Var, lnmVar, b2));
                return rih1Var;
            case 1:
                int iOrdinal = ((mt70) obj).ordinal();
                if (iOrdinal == 0) {
                    lzn0Var.e();
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new ms4(ofo0.N0, (lnm) null, (byte) 8));
                rwq0.z(qtrVar, new dyd(lzn0Var, (byte) 1));
                return rih1Var;
            default:
                ((qtr) obj).b(new pnp0(lzn0Var, (lnm) null, (byte) 21));
                return rih1Var;
        }
    }
}
