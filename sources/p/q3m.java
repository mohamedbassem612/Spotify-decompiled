package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q3m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s3m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3m(s3m s3mVar, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = s3mVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s3m s3mVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                s3mVar.c((b0k) obj, czo1.p(1));
                break;
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                rzo0 rzo0Var = s3mVar.f;
                rzo0Var.p().i(((ro41) s3mVar.c.e.a.getValue()).a, iIntValue, (gxs0) obj);
                break;
            case 2:
                s3mVar.f.D(((Number) obj).intValue(), ((ro41) s3mVar.c.e.a.getValue()).a, (String) obj2);
                break;
            case 3:
                s3mVar.f.D(((Number) obj).intValue(), ((ro41) s3mVar.c.e.a.getValue()).a, (String) obj2);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    s3mVar.c(x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3m(s3m s3mVar, byte b) {
        super(2);
        this.a = b;
        this.b = s3mVar;
    }
}
