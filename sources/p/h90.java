package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ xtb0 c;
    public final /* synthetic */ vzq0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(c380 c380Var, xtb0 xtb0Var, vzq0 vzq0Var, qim0 qim0Var) {
        super(2);
        this.b = c380Var;
        this.c = xtb0Var;
        this.d = vzq0Var;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    m0p1.e(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                m0p1.e(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(c380 c380Var, xtb0 xtb0Var, vzq0 vzq0Var, qim0 qim0Var, int i) {
        super(2);
        this.b = c380Var;
        this.c = xtb0Var;
        this.d = vzq0Var;
        this.e = qim0Var;
    }
}
