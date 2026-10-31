package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x6k0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x561 b;
    public final /* synthetic */ p6k0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6k0(x561 x561Var, p6k0 p6k0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = x561Var;
        this.c = p6k0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        p6k0 p6k0Var = this.c;
        x561 x561Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    fq7.h(x561Var.b, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(188726794, new u6k0(p6k0Var, iu30Var, (byte) 1), x340Var2), x340Var2, 1600518, 18);
                    o6k0 o6k0Var = p6k0Var.a;
                    boolean z = o6k0Var.a;
                    boolean z2 = o6k0Var.e;
                    z50 z50Var = z50.c;
                    if (z2) {
                        x340Var2.i0(749302851);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new stj0(iu30Var, (byte) 13);
                            x340Var2.s0(objT);
                        }
                        wro1.h(new gbx(z50Var, (Function0) objT), kdx.c, anm1.N("mixing_header_more_button", nim0Var), (max) null, yla.s(x340Var2), uyn1.h(2, 14.0f, 0.0f), false, (idn0) null, (ga80) null, u1j.d, x340Var2, 1573296, 6, 920);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        ab80.p(nim0Var, 8.0f, x340Var2, false);
                    } else {
                        x340Var2.i0(750084144);
                        x340Var2.r(false);
                    }
                    boolean zG2 = x340Var2.g(p6k0Var) | x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new v6k0(p6k0Var, iu30Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), pqo.h(anm1.N("mixing_header_save_button_enabled_is_" + z, nim0Var), !z), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, u1j.e, x340Var2, 0, 48, 2008);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    fq7.d(x561Var.a, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(10178151, new u6k0(p6k0Var, iu30Var, (byte) 2), x340Var4), x340Var4, 200064, 18);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
