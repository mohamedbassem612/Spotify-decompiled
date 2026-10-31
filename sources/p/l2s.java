package p;

import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l2s extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2s b;
    public final /* synthetic */ maa c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2s(m2s m2sVar, maa maaVar, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = m2sVar;
        this.c = maaVar;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        maa maaVar = this.c;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        m2s m2sVar = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fO = yoi1.o(1.0f - ((f260) m2sVar.g.getValue()).a, 0.0f, 1.0f);
                    float fM = dsa0.m(x340Var2, 2131165728);
                    qim0 qim0VarR = u291.r(nim0.a, dsa0.m(x340Var2, 2131165727));
                    boolean zD = x340Var2.d(fO) | x340Var2.i(m2sVar) | x340Var2.d(fM);
                    Object objT = x340Var2.T();
                    if (zD || objT == fkj0.X) {
                        obj3 = objT;
                        axj axjVar = new axj(fO, m2sVar, fM);
                        x340Var2.s0(axjVar);
                        obj3 = axjVar;
                    }
                    obj3 = objT;
                    qim0 qim0VarQ = exd0.q(qim0VarR, (iu30) obj3);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    otw.c(this.c, ((nt70) ven0Var.getValue()).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qsw.c(new obk1((BehaviorRetainingAppBarLayout) m2sVar.h.b), apo.r(-142444850, new l2s(m2sVar, maaVar, ven0Var, z ? 1 : 0), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mod.b(oi7.a.a(m2sVar.a), apo.r(622096719, new l2s(m2sVar, maaVar, ven0Var, b2), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
