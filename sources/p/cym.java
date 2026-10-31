package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cym extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ rwm c;
    public final /* synthetic */ Integer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cym(c380 c380Var, rwm rwmVar, Integer num, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = rwmVar;
        this.d = num;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Integer num = this.d;
        rwm rwmVar = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                dym.g(c380Var, rwmVar, num, b0kVar, czo1.p(1));
                break;
            default:
                dym.g(c380Var, rwmVar, num, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
