package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2n1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vmo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2n1(vmo0 vmo0Var, byte b) {
        super(3);
        this.a = b;
        this.b = vmo0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vmo0 vmo0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                irn1.l((nmo0) vmo0Var, (b0k) obj2, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                irn1.r((qmo0) vmo0Var, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                irn1.F((umo0) vmo0Var, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
