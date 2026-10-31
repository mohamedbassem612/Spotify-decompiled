package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(nl3 nl3Var, List list, float f, gdx gdxVar, lee1 lee1Var, int i) {
        super(2);
        this.d = nl3Var;
        this.e = list;
        this.b = f;
        this.f = gdxVar;
        this.g = lee1Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = gx0.X;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
                    nl3 nl3Var = (nl3) obj6;
                    List list = (List) obj5;
                    gdx gdxVar = (gdx) obj4;
                    lee1 lee1Var = (lee1) obj3;
                    mbh mbhVarA = jbh.a(h36.c, nl3Var, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
                    c4p1.b(list, nim0Var, nl3Var, this.b, gdxVar, lee1Var, this.c, x340Var2, 48, 0);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ioo1.e((j2i) obj6, this.b, (qim0) obj5, (xu30) obj4, (xu30) obj3, (b0k) obj, iP);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                w130.a((v130) obj6, (me10) obj5, (ke10) obj4, this.b, (iu30) obj3, (b0k) obj, iP2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(j2i j2iVar, float f, qim0 qim0Var, xu30 xu30Var, xu30 xu30Var2, int i) {
        super(2);
        this.d = j2iVar;
        this.b = f;
        this.e = qim0Var;
        this.f = xu30Var;
        this.g = xu30Var2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(v130 v130Var, me10 me10Var, ke10 ke10Var, float f, iu30 iu30Var, int i) {
        super(2);
        this.d = v130Var;
        this.e = me10Var;
        this.f = ke10Var;
        this.b = f;
        this.g = iu30Var;
        this.c = i;
    }
}
