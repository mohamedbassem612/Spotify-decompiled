package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gnj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af5 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnj(qim0 qim0Var, af5 af5Var) {
        super(2);
        this.a = (byte) 0;
        this.c = qim0Var;
        this.b = af5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        af5 af5Var = this.b;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwo1.f(this.b, anm1.N("title_text", u291.f(nim0.a, 1.0f).then(qim0Var)), (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 3772);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                dro.s(af5Var, qim0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                p9p1.l(af5Var, qim0Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnj(af5 af5Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = af5Var;
        this.c = qim0Var;
    }
}
