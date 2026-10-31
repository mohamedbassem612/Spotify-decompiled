package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wze0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ es41 c;
    public final /* synthetic */ w6e0 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wze0(iu30 iu30Var, es41 es41Var, w6e0 w6e0Var, long j) {
        super(2);
        this.b = iu30Var;
        this.c = es41Var;
        this.d = w6e0Var;
        this.e = j;
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
                    vbe.q(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                vbe.q(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wze0(iu30 iu30Var, es41 es41Var, w6e0 w6e0Var, long j, int i) {
        super(2);
        this.b = iu30Var;
        this.c = es41Var;
        this.d = w6e0Var;
        this.e = j;
    }
}
