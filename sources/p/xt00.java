package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xt00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xt00(float f, int i, float f2, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.c = f;
        this.b = qim0Var;
        this.d = f2;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.e;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.f;
                iko1.o((p3v) obj3, this.c, this.d, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.f;
                ajo1.n((p3v) obj3, this.c, this.d, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(s | 1);
                byte b4 = this.f;
                pxd0.l(this.c, this.d, iP3, b4, (b0k) obj, (qim0) obj3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xt00(p3v p3vVar, float f, float f2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = p3vVar;
        this.c = f;
        this.d = f2;
        this.e = i;
        this.f = i2;
    }
}
