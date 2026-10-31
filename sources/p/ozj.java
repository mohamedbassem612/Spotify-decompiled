package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ozj implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qzj b;
    public final /* synthetic */ ha4 c;
    public final /* synthetic */ vu30 d;

    public /* synthetic */ ozj(ha4 ha4Var, qzj qzjVar, vu30 vu30Var) {
        this.c = ha4Var;
        this.b = qzjVar;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.d;
        ha4 ha4Var = this.c;
        qzj qzjVar = this.b;
        x340 x340Var = (b0k) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    x340Var2.i0(866651995);
                    t4k.a(ha4Var, qzjVar.l, vu30Var, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            default:
                num.getClass();
                qzjVar.a(ha4Var, vu30Var, x340Var, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ ozj(qzj qzjVar, ha4 ha4Var, vu30 vu30Var, int i) {
        this.b = qzjVar;
        this.c = ha4Var;
        this.d = vu30Var;
    }
}
