package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l720 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gbx c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l720(String str, gbx gbxVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = gbxVar;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        gbx gbxVar = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                xzo1.c(str, gbxVar, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                xzo1.d(str, gbxVar, qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                ozn1.e(str, gbxVar, qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                rzn1.f(str, gbxVar, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                vzn1.d(str, gbxVar, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
