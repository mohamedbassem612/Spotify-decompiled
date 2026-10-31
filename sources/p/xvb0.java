package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xvb0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ g271 b;
    public final /* synthetic */ ldo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb0(ldo ldoVar, g271 g271Var) {
        super(2);
        this.c = ldoVar;
        this.b = g271Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ldo ldoVar = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c((smp0) ldoVar.c, this.b, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    g271 g271Var = this.b;
                    ez61 ez61Var = g271Var.a.b.c;
                    j2i j2iVarR = apo.r(-1586236392, new xvb0(ldoVar, g271Var), x340Var4);
                    zy61 zy61Var = ez61.c;
                    ywo1.f(ez61Var, (qim0) null, j2iVarR, x340Var4, 384);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb0(g271 g271Var, ldo ldoVar) {
        super(2);
        this.b = g271Var;
        this.c = ldoVar;
    }
}
