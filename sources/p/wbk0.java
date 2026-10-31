package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wbk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbk0(float f, int i, float f2, qim0 qim0Var, int i2) {
        super(2);
        this.d = f;
        this.b = i;
        this.e = f2;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.c;
                int iP = czo1.p(1);
                g3p1.e(this.d, this.e, this.b, iP, (b0k) obj, qim0Var);
                break;
            default:
                ((Number) obj2).intValue();
                float f = this.e;
                int iP2 = czo1.p(1);
                y9g1.j(this.d, f, this.b, iP2, (b0k) obj, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbk0(int i, qim0 qim0Var, float f, float f2, int i2) {
        super(2);
        this.b = i;
        this.c = qim0Var;
        this.d = f;
        this.e = f2;
    }
}
