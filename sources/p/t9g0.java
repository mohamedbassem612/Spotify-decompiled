package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9g0 extends hab0 implements xu30 {
    public final /* synthetic */ ti51 N0;
    public final /* synthetic */ lfs0 O0;
    public final /* synthetic */ fa50 P0;
    public final /* synthetic */ oyr0 Q0;
    public final /* synthetic */ kjn0 R0;
    public final /* synthetic */ j6r S0;
    public final /* synthetic */ fx T0;
    public final /* synthetic */ a81 U0;
    public final /* synthetic */ o921 V0;
    public final /* synthetic */ k6t W0;
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ lb9 Y;
    public final /* synthetic */ ca50 Z;
    public final /* synthetic */ wat a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ xag0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ g2f0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ tr00 i;
    public final /* synthetic */ mij1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9g0(wat watVar, xtb0 xtb0Var, xag0 xag0Var, long j, g2f0 g2f0Var, boolean z, ven0 ven0Var, boolean z2, tr00 tr00Var, mij1 mij1Var, ven0 ven0Var2, lb9 lb9Var, ca50 ca50Var, ti51 ti51Var, lfs0 lfs0Var, fa50 fa50Var, oyr0 oyr0Var, kjn0 kjn0Var, j6r j6rVar, fx fxVar, a81 a81Var, o921 o921Var, k6t k6tVar) {
        super(3);
        this.a = watVar;
        this.b = xtb0Var;
        this.c = xag0Var;
        this.d = j;
        this.e = g2f0Var;
        this.f = z;
        this.g = ven0Var;
        this.h = z2;
        this.i = tr00Var;
        this.t = mij1Var;
        this.X = ven0Var2;
        this.Y = lb9Var;
        this.Z = ca50Var;
        this.N0 = ti51Var;
        this.O0 = lfs0Var;
        this.P0 = fa50Var;
        this.Q0 = oyr0Var;
        this.R0 = kjn0Var;
        this.S0 = j6rVar;
        this.T0 = fxVar;
        this.U0 = a81Var;
        this.V0 = o921Var;
        this.W0 = k6tVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.i0(1794573853);
            WeakHashMap weakHashMap = osl1.x;
            float fM0 = this.a.M0(lhc.g(x340Var2).f.e().b);
            x340Var2.r(false);
            float f = fM0 + 56.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
            xag0 xag0Var = this.c;
            boolean zI = x340Var2.i(xag0Var);
            long j = this.d;
            boolean zF = zI | x340Var2.f(j) | x340Var2.d(f);
            g2f0 g2f0Var = this.e;
            boolean zG = zF | x340Var2.g(g2f0Var);
            boolean z = this.f;
            boolean zH = zG | x340Var2.h(z);
            tob1 tob1Var = this.g;
            boolean zG2 = zH | x340Var2.g(tob1Var);
            boolean z2 = this.h;
            boolean zH2 = zG2 | x340Var2.h(z2);
            tr00 tr00Var = this.i;
            boolean zG3 = zH2 | x340Var2.g(tr00Var);
            mij1 mij1Var = this.t;
            boolean zG4 = zG3 | x340Var2.g(mij1Var);
            tob1 tob1Var2 = this.X;
            boolean zG5 = zG4 | x340Var2.g(tob1Var2);
            Object objT = x340Var2.T();
            if (zG5 || objT == fkj0.X) {
                s9g0 s9g0Var = new s9g0(xag0Var, j, f, this.Y, g2f0Var, this.Z, z, this.N0, this.O0, this.P0, z2, tr00Var, mij1Var, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, tob1Var, tob1Var2);
                x340Var2.s0(s9g0Var);
                objT = s9g0Var;
            }
            ujo1.d(qim0VarD2, this.b, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 6, 504);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
