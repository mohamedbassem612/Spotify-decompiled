package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ym6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af5 b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym6(af5 af5Var, Integer num, int i, byte b) {
        super(2);
        this.a = b;
        this.b = af5Var;
        this.c = num;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Integer num = this.c;
        af5 af5Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                zm6.f(af5Var, num, b0kVar, czo1.p(i | 1));
                break;
            default:
                zm6.f(af5Var, num, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
