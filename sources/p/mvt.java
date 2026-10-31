package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mvt extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kvt b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvt(kvt kvtVar, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = kvtVar;
        this.c = iu30Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        kvt kvtVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                k4k.c(kvtVar, iu30Var, qim0Var, b0kVar, czo1.p(9));
                break;
            default:
                k4k.e(kvtVar, iu30Var, qim0Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
