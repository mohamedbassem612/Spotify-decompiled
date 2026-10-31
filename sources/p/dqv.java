package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dqv extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ de21 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqv(vqv vqvVar, de21 de21Var) {
        super(2);
        this.b = vqvVar;
        this.c = de21Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        de21 de21Var = this.c;
        vqv vqvVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vqvVar.c(de21Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    vqvVar.c(de21Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqv(vqv vqvVar, de21 de21Var, int i) {
        super(2);
        this.b = vqvVar;
        this.c = de21Var;
    }
}
