package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mi81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi81(fob fobVar, aeb1 aeb1Var, boolean z, int i) {
        super(2);
        this.a = (byte) 1;
        this.d = fobVar;
        this.e = aeb1Var;
        this.b = z;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.e;
        boolean z = this.b;
        Object obj4 = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ((pt) obj4).g(czo1.p(i | 1), b0kVar, (qim0) obj3, z);
                break;
            case 1:
                ((fob) obj4).g((aeb1) obj3, z, b0kVar, czo1.p(i | 1));
                break;
            default:
                pok1.m((mr20) obj4, z, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi81(Object obj, boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.e = qim0Var;
        this.c = i;
    }
}
