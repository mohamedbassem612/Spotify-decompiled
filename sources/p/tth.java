package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ adj1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tth(adj1 adj1Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 4;
        this.b = adj1Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        adj1 adj1Var = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p9p1.i(adj1Var, iu30Var, true, x340Var2, 384);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s9p1.j(adj1Var, iu30Var, true, x340Var4, 384);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fho1.d(adj1Var, iu30Var, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str = adj1Var.a().c.a;
                    String str2 = adj1Var.a().c.c;
                    hti1 hti1Var = hti1.e;
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    qim0 qim0VarZ = uyn1.z(6.0f, 0.0f, 2, qim0VarF);
                    boolean zG = x340Var8.g(iu30Var);
                    Object objT = x340Var8.T();
                    if (zG || objT == fkj0.X) {
                        objT = new yth(iu30Var, (byte) 2);
                        x340Var8.s0(objT);
                    }
                    f6o1.b(str, str2, hti1Var, qim0VarZ, (String) null, (Function0) objT, apo.r(-116700166, new tth(adj1Var, iu30Var, b2), x340Var8), x340Var8, 1573248, 16);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    boolean zB = adj1Var.a().d.b.b();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarX = uyn1.x(u291.f(nim0Var, 1.0f), 8.0f);
                    jw31 jw31VarA = ew31.a(h36.g, een.O0, x340Var10, 0);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(hmb0.t1);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(jw31VarA, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE, x340Var10, y580.Y);
                    c2p1.m(0, x340Var10, iu30Var, uyn1.B(nim0Var, 4.0f, 0.0f, 12.0f, 0.0f, 10), adj1Var);
                    String str3 = adj1Var.a().c.b;
                    lee1 lee1Var = cbx.d(x340Var10).n;
                    boolean zH = x340Var10.h(zB) | x340Var10.g(iu30Var);
                    Object objT2 = x340Var10.T();
                    if (zH || objT2 == fkj0.X) {
                        objT2 = new z20(zB, iu30Var, (byte) 16);
                        x340Var10.s0(objT2);
                    }
                    c0p1.e(str3, 1, lee1Var, (Function0) objT2, apo.r(894797242, new wth(adj1Var, zB, iu30Var), x340Var10), x340Var10, 24624);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                fho1.d(adj1Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tth(adj1 adj1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = adj1Var;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tth(adj1 adj1Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.b = adj1Var;
        this.c = iu30Var;
    }
}
