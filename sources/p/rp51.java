package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rp51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dtw b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp51(dtw dtwVar, String str, byte b) {
        super(1);
        this.a = b;
        this.b = dtwVar;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        goa0 goa0Var = goa0.a;
        String str = this.c;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                k430 k430Var = new k430(str, false, false);
                tka0 tka0Var = dtw.C;
                dtwVar.k(k430Var, goa0Var, (vu30) null);
                break;
            default:
                wsz0 wsz0Var = new wsz0(str);
                tka0 tka0Var2 = dtw.C;
                dtwVar.k(wsz0Var, goa0Var, (vu30) null);
                break;
        }
        return rih1Var;
    }
}
