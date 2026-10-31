package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p180 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o180 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p180(o180 o180Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = o180Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        o180 o180Var = this.b;
        int i = 0;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (Object obj3 : o180Var.a) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        ax70 ax70Var = (ax70) obj3;
                        boolean zJ = u890.j(ax70Var, o180Var.b);
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.e(i);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new ck0(iu30Var, i, (byte) 10);
                            x340Var2.s0(objT);
                        }
                        g3p1.d(ax70Var, zJ, (qim0) null, (Function0) objT, x340Var2, 0);
                        i = i2;
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    wqn1.e(8.0f, uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, cbx.b(x340Var4).b.b, 5), apo.r(-2016306111, new p180(o180Var, iu30Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 384);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
