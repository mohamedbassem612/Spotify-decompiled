package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cqv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ htv c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqv(vqv vqvVar, htv htvVar, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = vqvVar;
        this.c = htvVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        htv htvVar = this.c;
        rih1 rih1Var = rih1.a;
        vqv vqvVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    tjq tjqVar = vqvVar.f;
                    String str = vqvVar.a;
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                    WeakHashMap weakHashMap = osl1.x;
                    tjqVar.e(str, this.c, this.d, uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, poo1.x(lhc.g(x340Var2).e, x340Var2).a(), 7), x340Var2, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                vqvVar.k(htvVar, iu30Var, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    vqvVar.m(htvVar, iu30Var, x340Var4, 0);
                }
                break;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    vqvVar.k(htvVar, iu30Var, x340Var6, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                vqvVar.m(htvVar, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqv(vqv vqvVar, htv htvVar, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = vqvVar;
        this.c = htvVar;
        this.d = iu30Var;
    }
}
