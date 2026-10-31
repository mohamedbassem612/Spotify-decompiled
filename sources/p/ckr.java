package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ckr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hkr b;
    public final /* synthetic */ y8j0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckr(hkr hkrVar, y8j0 y8j0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hkrVar;
        this.c = y8j0Var;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        y8j0 y8j0Var = this.c;
        hkr hkrVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hkrVar.a(y8j0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                hkrVar.b(y8j0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                hkrVar.d(y8j0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                hkrVar.e(y8j0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
