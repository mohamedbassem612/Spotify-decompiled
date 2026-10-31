package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tsh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jiv0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ short f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tsh(qim0 qim0Var, String str, jiv0 jiv0Var, int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = str;
        this.d = jiv0Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.g;
                bth.d(this.b, this.c, this.d, this.e, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.g;
                bth.d(this.b, this.c, this.d, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
