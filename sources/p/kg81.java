package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kg81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mg81 b;
    public final /* synthetic */ lg81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg81(lg81 lg81Var, mg81 mg81Var) {
        super(2);
        this.a = (byte) 0;
        this.c = lg81Var;
        this.b = mg81Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lg81 lg81Var = this.c;
        mg81 mg81Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                fh81 fh81Var = lg81Var.N0;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (!((Boolean) rwq.h(fh81Var.q1, x340Var2, 0).getValue()).booleanValue()) {
                    x340Var2.i0(575216213);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(574619432);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = (zg81) mg81Var.e.get();
                        x340Var2.s0(objT);
                    }
                    zg81 zg81Var = (zg81) objT;
                    vg81 vg81Var = new vg81(mg81Var.f, fh81Var.s1);
                    zg81Var.getClass();
                    otw.c(zg81Var, vg81Var, (qim0) null, wpb1.D("sideDrawer", zg81Var, vg81Var, x340Var2, 6), x340Var2, 0, 4);
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ely0 ely0VarA = oi7.a.a(mg81Var.a);
                    kiv kivVar = vvx.a;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    mod.c(new ely0[]{ely0VarA, kivVar.a(new uvx(1, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 494))}, apo.r(1152369773, new kg81(lg81Var, mg81Var), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1519591725, new kg81(mg81Var, lg81Var, b2), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg81(mg81 mg81Var, lg81 lg81Var, byte b) {
        super(2);
        this.a = b;
        this.b = mg81Var;
        this.c = lg81Var;
    }
}
