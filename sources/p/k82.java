package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k82 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k82(float f, float f2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        float f = this.c;
        float f2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                cbp1.a(f2, f, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                dsa0.g(f2, f, qim0Var, b0kVar, czo1.p(7));
                break;
            case 2:
                dro.j(f2, f, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                cev0.l(f2, f, qim0Var, b0kVar, czo1.p(55));
                break;
        }
        return rih1Var;
    }
}
