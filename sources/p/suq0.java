package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class suq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n960 b;
    public final /* synthetic */ n960 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ suq0(n960 n960Var, n960 n960Var2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = n960Var;
        this.c = n960Var2;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        n960 n960Var = this.c;
        n960 n960Var2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                j1e1.g(n960Var2, n960Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                j1e1.h(n960Var2, n960Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
