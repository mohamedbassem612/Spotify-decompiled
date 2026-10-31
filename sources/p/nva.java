package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nva extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7x0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nva(r7x0 r7x0Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r7x0Var;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        r7x0 r7x0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                c8o.c(r7x0Var, iu30Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                y1a1.h(r7x0Var, iu30Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
