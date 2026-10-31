package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lbg0 extends hab0 implements xu30 {
    public final /* synthetic */ b0v0 N0;
    public final /* synthetic */ lb9 O0;
    public final /* synthetic */ ca50 P0;
    public final /* synthetic */ ti51 Q0;
    public final /* synthetic */ fa50 R0;
    public final /* synthetic */ lfs0 S0;
    public final /* synthetic */ oyr0 T0;
    public final /* synthetic */ k1k1 U0;
    public final /* synthetic */ oex0 V0;
    public final /* synthetic */ kjn0 W0;
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ j6r X0;
    public final /* synthetic */ u7j0 Y;
    public final /* synthetic */ fx Y0;
    public final /* synthetic */ lhd0 Z;
    public final /* synthetic */ gw3 Z0;
    public final /* synthetic */ wat a;
    public final /* synthetic */ x4g0 a1;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ a81 b1;
    public final /* synthetic */ hdg0 c;
    public final /* synthetic */ o921 c1;
    public final /* synthetic */ long d;
    public final /* synthetic */ k6t d1;
    public final /* synthetic */ g2f0 e;
    public final /* synthetic */ c0c1 e1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ tr00 i;
    public final /* synthetic */ mij1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbg0(wat watVar, xtb0 xtb0Var, hdg0 hdg0Var, long j, g2f0 g2f0Var, boolean z, ven0 ven0Var, boolean z2, tr00 tr00Var, mij1 mij1Var, ven0 ven0Var2, u7j0 u7j0Var, lhd0 lhd0Var, b0v0 b0v0Var, lb9 lb9Var, ca50 ca50Var, ti51 ti51Var, fa50 fa50Var, lfs0 lfs0Var, oyr0 oyr0Var, k1k1 k1k1Var, oex0 oex0Var, kjn0 kjn0Var, j6r j6rVar, fx fxVar, gw3 gw3Var, x4g0 x4g0Var, a81 a81Var, o921 o921Var, k6t k6tVar, c0c1 c0c1Var) {
        super(3);
        this.a = watVar;
        this.b = xtb0Var;
        this.c = hdg0Var;
        this.d = j;
        this.e = g2f0Var;
        this.f = z;
        this.g = ven0Var;
        this.h = z2;
        this.i = tr00Var;
        this.t = mij1Var;
        this.X = ven0Var2;
        this.Y = u7j0Var;
        this.Z = lhd0Var;
        this.N0 = b0v0Var;
        this.O0 = lb9Var;
        this.P0 = ca50Var;
        this.Q0 = ti51Var;
        this.R0 = fa50Var;
        this.S0 = lfs0Var;
        this.T0 = oyr0Var;
        this.U0 = k1k1Var;
        this.V0 = oex0Var;
        this.W0 = kjn0Var;
        this.X0 = j6rVar;
        this.Y0 = fxVar;
        this.Z0 = gw3Var;
        this.a1 = x4g0Var;
        this.b1 = a81Var;
        this.c1 = o921Var;
        this.d1 = k6tVar;
        this.e1 = c0c1Var;
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
            x340Var2.i0(349746418);
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
            hdg0 hdg0Var = this.c;
            boolean zI = x340Var2.i(hdg0Var);
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
            u7j0 u7j0Var = this.Y;
            boolean zG6 = zG5 | x340Var2.g(u7j0Var);
            lhd0 lhd0Var = this.Z;
            boolean zG7 = zG6 | x340Var2.g(lhd0Var);
            b0v0 b0v0Var = this.N0;
            boolean zG8 = zG7 | x340Var2.g(b0v0Var);
            Object objT = x340Var2.T();
            if (zG8 || objT == fkj0.X) {
                kbg0 kbg0Var = new kbg0(hdg0Var, j, f, this.O0, g2f0Var, this.P0, z, this.Q0, this.R0, this.S0, z2, tr00Var, mij1Var, this.T0, this.U0, u7j0Var, lhd0Var, b0v0Var, this.V0, this.W0, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, this.d1, this.e1, tob1Var, tob1Var2);
                x340Var2.s0(kbg0Var);
                objT = kbg0Var;
            }
            ujo1.d(qim0VarD2, this.b, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 6, 504);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
