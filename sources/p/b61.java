package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b61 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nl3 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ List h;
    public final /* synthetic */ gdx i;
    public final /* synthetic */ lee1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(boolean z, nl3 nl3Var, float f, qim0 qim0Var, j2i j2iVar, vu30 vu30Var, String str, List list, gdx gdxVar, lee1 lee1Var, int i) {
        super(2);
        this.a = z;
        this.b = nl3Var;
        this.c = f;
        this.d = qim0Var;
        this.e = j2iVar;
        this.f = vu30Var;
        this.g = str;
        this.h = list;
        this.i = gdxVar;
        this.t = lee1Var;
        this.X = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            boolean z = this.a;
            List list = this.h;
            j2i j2iVar = this.e;
            if (z) {
                x340Var2.i0(1013793898);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                era eraVar = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z2 = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                qim0 qim0VarThen = kk0.q(x340Var2, qim0VarE, lljVar4, 1.0f, true).then(this.d);
                j2i j2iVarR = apo.r(-1699624692, new a61(j2iVar, this.f), x340Var2);
                nl3 nl3Var = this.b;
                float f = this.c;
                c4p1.c(nl3Var, f, qim0VarThen, j2iVarR, x340Var2, 3072);
                qim0 qim0VarO = ab80.o(nim0Var, f, x340Var2, nim0Var, 1.0f);
                String str = this.g;
                if (str != null) {
                    qim0VarO = anm1.N(str, qim0VarO);
                }
                mbh mbhVarA2 = jbh.a(f36Var, nl3Var, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarO);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                c4p1.b(list, nim0Var, nl3Var, f, this.i, this.t, this.X, x340Var2, 48, 0);
                us71.m(x340Var2, true, true, false);
            } else {
                x340Var2.i0(1014754743);
                vu30 vu30Var = this.f;
                nl3 nl3Var2 = this.b;
                float f2 = this.c;
                c4p1.c(nl3Var2, f2, this.d, apo.r(-1445250407, new x51(j2iVar, list, nl3Var2, f2, this.i, this.t, this.X, vu30Var, (byte) 3), x340Var2), x340Var2, 3072);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
