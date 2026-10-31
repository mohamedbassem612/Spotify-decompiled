package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v7p0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w9p0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7p0(w9p0 w9p0Var, qim0 qim0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = w9p0Var;
        this.c = qim0Var;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        qim0 qim0Var = this.c;
        w9p0 w9p0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                voo1.f(w9p0Var, qim0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                epo1.z(w9p0Var, qim0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
