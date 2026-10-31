package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x830 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7x0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x830(r7x0 r7x0Var, boolean z, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r7x0Var;
        this.c = z;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        boolean z = this.c;
        r7x0 r7x0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                k8p1.b(r7x0Var, z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                k8p1.c(r7x0Var, z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
