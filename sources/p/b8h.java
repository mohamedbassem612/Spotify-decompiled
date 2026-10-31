package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b8h extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z7h b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8h(z7h z7hVar, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = z7hVar;
        this.c = iu30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        z7h z7hVar = this.b;
        int i = 0;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (Object obj3 : z7hVar.a) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        long j = ((d9h) obj3).a;
                        long j2 = z7hVar.b;
                        int i3 = u7h.l;
                        boolean zB = z4h1.b(j, j2);
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.e(i);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new ck0(iu30Var, i, (byte) 7);
                            x340Var2.s0(objT);
                        }
                        l4p1.b(0, j, (Function0) objT, x340Var2, (qim0) null, zB);
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
                    wqn1.e(0.0f, uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, cbx.b(x340Var4).b.a, 5), apo.r(420319929, new b8h(z7hVar, iu30Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 384);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
