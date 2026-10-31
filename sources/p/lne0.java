package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lne0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ume0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ yge0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lne0(ume0 ume0Var, iu30 iu30Var, yge0 yge0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ume0Var;
        this.c = iu30Var;
        this.d = yge0Var;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                s9p1.m(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                s9p1.q(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
