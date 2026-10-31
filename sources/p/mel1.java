package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mel1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nue1 b;
    public final /* synthetic */ zge1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mel1(nue1 nue1Var, zge1 zge1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nue1Var;
        this.c = zge1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        zge1 zge1Var = this.c;
        nue1 nue1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                nel1.a(nue1Var, zge1Var, nim0Var, b0kVar, czo1.p(1));
                break;
            default:
                nel1.a(nue1Var, zge1Var, nim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
