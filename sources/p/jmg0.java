package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jmg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmg0(c380 c380Var, Integer num, Integer num2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = num;
        this.d = num2;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Integer num = this.d;
        Integer num2 = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                lrn1.f(c380Var, num2, num, b0kVar, czo1.p(i | 1));
                break;
            default:
                lrn1.f(c380Var, num2, num, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
