package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yaf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ u7h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yaf1(qim0 qim0Var, u7h u7hVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = u7hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u7h u7hVar = this.c;
        qim0 qim0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                zaf1.b(qim0Var, u7hVar, b0kVar, czo1.p(1));
                break;
            default:
                obg1.k(qim0Var, u7hVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
