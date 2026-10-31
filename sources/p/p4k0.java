package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p4k0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ r4k0 b;
    public final /* synthetic */ s5k0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4k0(r4k0 r4k0Var, s5k0 s5k0Var, iu30 iu30Var) {
        super(2);
        this.b = r4k0Var;
        this.c = s5k0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        s5k0 s5k0Var = this.c;
        r4k0 r4k0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    irn1.u((qim0) null, s1j.a, (vu30) null, (erl1) null, apo.r(947564489, new o4k0(r4k0Var, s5k0Var, iu30Var), x340Var2), x340Var2, 24624, 13);
                }
                break;
            default:
                ((Number) obj2).intValue();
                r4k0Var.e(s5k0Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4k0(r4k0 r4k0Var, s5k0 s5k0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = r4k0Var;
        this.c = s5k0Var;
        this.d = iu30Var;
    }
}
