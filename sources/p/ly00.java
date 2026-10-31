package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ly00(float f, float f2, float f3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.e;
                ilo1.p(this.b, this.c, this.d, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.e;
                m6p1.h(this.b, this.c, this.d, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b4 = this.e;
                z1a1.g(this.b, this.c, this.d, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }
}
