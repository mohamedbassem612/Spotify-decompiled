package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w2y extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2y(int i, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        super(2);
        this.a = (byte) 0;
        this.b = c380Var;
        this.d = qim0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                acq0.i(czo1.p(49), b0kVar, iu30Var, c380Var, qim0Var);
                break;
            case 1:
                zmo1.h(czo1.p(1), b0kVar, iu30Var, c380Var, qim0Var);
                break;
            default:
                cso1.u(czo1.p(1), b0kVar, iu30Var, c380Var, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2y(byte b, int i, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = iu30Var;
        this.d = qim0Var;
    }
}
