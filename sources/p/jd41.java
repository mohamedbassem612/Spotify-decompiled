package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jd41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd41(int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                jd41 jd41Var = new jd41(this.c, lnmVar, (byte) 0);
                jd41Var.b = ((Number) obj).intValue();
                return jd41Var;
            default:
                jd41 jd41Var2 = new jd41(this.c, lnmVar, (byte) 1);
                jd41Var2.b = ((Number) obj).intValue();
                return jd41Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int iIntValue = ((Number) obj).intValue();
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(Integer.valueOf(iIntValue), lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.valueOf(i2 <= i);
            default:
                hm5.M(obj);
                return Boolean.valueOf(i2 <= i);
        }
    }
}
