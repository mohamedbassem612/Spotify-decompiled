package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fgh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zfh b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgh(zfh zfhVar, iu30 iu30Var, iu30 iu30Var2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zfhVar;
        this.c = iu30Var;
        this.d = iu30Var2;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        iu30 iu30Var2 = this.c;
        zfh zfhVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                p6p1.d(zfhVar, iu30Var2, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                p6p1.d(zfhVar, iu30Var2, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                p6p1.d(zfhVar, iu30Var2, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
