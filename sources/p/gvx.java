package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gvx extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ vzq0 c;
    public final /* synthetic */ g36 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvx(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, g36 g36Var, iu30 iu30Var, int i) {
        super(2);
        this.a = qim0Var;
        this.b = xtb0Var;
        this.c = vzq0Var;
        this.d = g36Var;
        this.e = iu30Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (x340) b0kVar;
        if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            iu30 iu30Var = this.e;
            boolean zG = x340Var.g(iu30Var);
            int i = this.f;
            boolean zE = zG | x340Var.e(l1d.C(i));
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = new fvx(i, iu30Var);
                x340Var.s0(objT);
            }
            ujo1.d(this.a, this.b, this.c, false, this.d, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 480);
        } else {
            x340Var.b0();
        }
        return rih1.a;
    }
}
