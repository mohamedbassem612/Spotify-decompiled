package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y791 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g891 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y791(g891 g891Var, int i, float f, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = g891Var;
        this.c = i;
        this.d = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        int i = this.c;
        g891 g891Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                g891Var.f(i, f, b0kVar, czo1.p(1));
                break;
            default:
                g891Var.g(i, f, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
