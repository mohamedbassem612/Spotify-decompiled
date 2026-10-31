package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class atl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atl(float f, float f2, float f3, hux huxVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.f = huxVar;
        this.g = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ctl.c((dtl) obj4, (maa) obj3, this.b, this.c, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                hux huxVar = (hux) obj4;
                qim0 qim0Var = (qim0) obj3;
                int iP2 = czo1.p(i | 1);
                ulo1.c(this.b, this.c, this.d, huxVar, qim0Var, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                float f = this.b;
                float f2 = this.c;
                float f3 = this.d;
                dro.o((nue1) obj4, f, f2, f3, (iu30) obj3, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                dro.q((nue1) obj4, (ggv) obj3, this.b, this.c, this.d, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atl(Object obj, Object obj2, float f, float f2, float f3, int i, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atl(nue1 nue1Var, float f, float f2, float f3, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.f = nue1Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.g = iu30Var;
        this.e = i;
    }
}
