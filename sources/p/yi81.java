package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yi81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ aj81 b;
    public final /* synthetic */ res c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi81(res resVar, aj81 aj81Var, iu30 iu30Var) {
        super(2);
        this.c = resVar;
        this.b = aj81Var;
        this.d = iu30Var;
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
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    this.c.n(this.b, this.d, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), x340Var2, 8);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    aj81 aj81Var = this.b;
                    boolean z = aj81Var.e.a instanceof ii81;
                    res resVar = this.c;
                    if (!z) {
                        x340Var4.i0(265956301);
                        resVar.o(aj81Var, this.d, aj81Var.f, x340Var4, 520);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(265947482);
                        li81 li81Var = aj81Var.f;
                        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                        uwr uwrVar = cbx.a;
                        qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var4).a.a.a(), d4o1.a);
                        Object objT = x340Var4.T();
                        if (objT == fkj0.X) {
                            objT = da71.e1;
                            x340Var4.s0(objT);
                        }
                        resVar.e(li81Var, bin.x(qim0VarF2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), x340Var4, 8);
                        x340Var4.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi81(aj81 aj81Var, res resVar, iu30 iu30Var) {
        super(2);
        this.b = aj81Var;
        this.c = resVar;
        this.d = iu30Var;
    }
}
