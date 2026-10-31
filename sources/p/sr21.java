package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sr21 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr21(long j, az20 az20Var, sud1 sud1Var, xud1 xud1Var, boolean z, iu30 iu30Var) {
        super(2);
        this.b = j;
        this.e = az20Var;
        this.f = sud1Var;
        this.g = xud1Var;
        this.c = z;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                pdp1.g((List) obj5, (String) obj6, this.b, (nr21) obj4, this.c, (iu30) obj3, (b0k) obj, iP);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("taste_profile_page", dug.f(u291.d(nim0.a, 1.0f), this.b, d4o1.a));
                    az20 az20Var = (az20) obj5;
                    sud1 sud1Var = (sud1) obj6;
                    xud1 xud1Var = (xud1) obj4;
                    iu30 iu30Var = (iu30) obj3;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    cvd1.l(x340Var2, 0);
                    es41 es41VarC = l6o1.C(0, 0, 1, x340Var2);
                    boolean zG = x340Var2.g(es41VarC);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new icr0(es41VarC);
                        x340Var2.s0(objT);
                    }
                    icr0 icr0Var = (icr0) objT;
                    mod.b(cvd1.a.a(icr0Var), apo.r(312261174, new uu(az20Var, icr0Var, es41VarC, sud1Var, xud1Var, this.c, iu30Var, (byte) 19), x340Var2), x340Var2, 56);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                j541.h((String) obj6, (String) obj5, (String) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, iP2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr21(String str, String str2, String str3, long j, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.f = str;
        this.e = str2;
        this.g = str3;
        this.b = j;
        this.c = z;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr21(List list, String str, long j, nr21 nr21Var, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.e = list;
        this.f = str;
        this.b = j;
        this.g = nr21Var;
        this.c = z;
        this.d = iu30Var;
    }
}
