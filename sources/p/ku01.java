package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ku01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x360 b;
    public final /* synthetic */ w460 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku01(x360 x360Var, w460 w460Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = x360Var;
        this.c = w460Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        w460 w460Var = this.c;
        x360 x360Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                cyo1.k(x360Var, w460Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                cyo1.k(x360Var, w460Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
