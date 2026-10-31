package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s3f0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ nl3 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s3f0(c380 c380Var, qim0 qim0Var, nl3 nl3Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = qim0Var;
        this.d = nl3Var;
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
                mym.c(this.b, this.c, this.d, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.e;
                mym.c(this.b, this.c, this.d, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
