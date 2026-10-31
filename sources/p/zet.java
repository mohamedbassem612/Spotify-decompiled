package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zet extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hrr0 b;
    public final /* synthetic */ b4v0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zet(hrr0 hrr0Var, b4v0 b4v0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = hrr0Var;
        this.c = b4v0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        hrr0 hrr0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    tet tetVar = (tet) hrr0Var.getValue();
                    if (tetVar != null) {
                        x340Var2.i0(354984733);
                        String str = tetVar.a;
                        boolean z = tetVar.b;
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new hbs(iu30Var, (byte) 19);
                            x340Var2.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        boolean zG2 = x340Var2.g(iu30Var);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new hbs(iu30Var, (byte) 20);
                            x340Var2.s0(objT2);
                        }
                        dro.g(str, this.c, z, qim0VarZ, function0, (Function0) objT2, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(354984732);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(2061065671, new zet(hrr0Var, this.c, iu30Var, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
