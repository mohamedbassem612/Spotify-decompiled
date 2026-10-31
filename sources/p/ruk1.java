package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ruk1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tuk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruk1(tuk1 tuk1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tuk1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tuk1 tuk1Var = this.b;
        switch (b) {
            case 0:
                return new any(tuk1Var.h, (byte) 18);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.c(new afb1(qtrVar, tuk1Var, (lnm) null, (byte) 15));
                qtrVar.b(new dgh1(tuk1Var, null, (byte) 2));
                return rih1.a;
        }
    }
}
