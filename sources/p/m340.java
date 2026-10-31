package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m340 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m340(c380 c380Var, float f, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.b = c380Var;
        this.c = f;
        this.d = iu30Var;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                sbl.h(this.c, iP, (b0k) obj, this.d, this.b, qim0Var);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                f2p1.g(this.c, iP2, (b0k) obj, this.d, this.b, qim0Var2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m340(c380 c380Var, iu30 iu30Var, float f, qim0 qim0Var, int i) {
        super(2);
        this.b = c380Var;
        this.d = iu30Var;
        this.c = f;
        this.e = qim0Var;
    }
}
