package p;

import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ou61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pu61 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou61(pu61 pu61Var, String str, List list, byte b) {
        super(2);
        this.a = b;
        this.b = pu61Var;
        this.c = str;
        this.d = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.d;
        String str = this.c;
        pu61 pu61Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                    hzj.A.getClass();
                    if (((x340) b0kVar2).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(hmb0.t1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, y580.O0);
                    nko1.H(xos0VarM, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE, b0kVar2, y580.Y);
                    pu61Var.a(0, str, b0kVar2, null);
                    kv61 kv61Var = pu61Var.c;
                    c9 c9VarF = mqo1.F(list);
                    qim0 qim0VarL = bmq0.L(nim0Var, k1o1.q(b0kVar2), (g6o0) null);
                    u85 u85Var = (erl1) b0kVar2.k(szf0.b);
                    if (u85Var == null) {
                        b0kVar2.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(b0kVar2).g;
                    } else {
                        b0kVar2.i0(-241885792);
                    }
                    b0kVar2.r(false);
                    vk80 vk80VarC = hqq0.C(u85Var, b0kVar2);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    kv61Var.b(c9VarF, qim0VarL, true, null, lnn1.n(vk80VarC, uyn1.h(1, 0.0f, 8.0f)), b0kVar2, 392, 8);
                    b0kVar2.r(true);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    if (pu61Var.e.c) {
                        x340Var2.i0(1632900967);
                        los losVar = pu61Var.g;
                        boolean zI = x340Var2.i(pu61Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == fkj0.X) {
                            objT = new q961(pu61Var, (byte) 15);
                            x340Var2.s0(objT);
                        }
                        qxd0.i(losVar, (iu30) objT, x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1633085479);
                        x340Var2.r(false);
                    }
                    pu61Var.b(6, apo.r(-866203716, new ou61(pu61Var, str, list, b2), x340Var2), x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }
}
