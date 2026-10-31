package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fj41 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ he5 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj41(boolean z, ven0 ven0Var, iu30 iu30Var, ven0 ven0Var2, vu30 vu30Var, boolean z2, float f, tob1 tob1Var, he5 he5Var, ven0 ven0Var3) {
        super(3);
        this.a = z;
        this.b = ven0Var;
        this.c = iu30Var;
        this.d = ven0Var2;
        this.e = vu30Var;
        this.f = z2;
        this.g = f;
        this.h = tob1Var;
        this.i = he5Var;
        this.t = ven0Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        float fD = i2cVar.d() / i2cVar.c();
        cbx.a.getClass();
        float fMin = Math.min(fD, ((ecx) uwr.i.getValue()).a);
        if (fMin < 0.01f) {
            fMin = 0.01f;
        }
        nim0 nim0Var = nim0.a;
        boolean z = this.a;
        qim0 qim0VarD = z ? u291.d(nim0Var, 1.0f) : d7e.r(fMin, nim0Var, false);
        x340 x340Var2 = x340Var;
        ven0 ven0Var = this.b;
        boolean zI = x340Var2.i(ven0Var);
        j06 j06Var = x340Var2.a;
        boolean zH = zI | x340Var2.h(z);
        iu30 iu30Var = this.c;
        boolean zG = zH | x340Var2.g(iu30Var);
        Object objT = x340Var2.T();
        if (zG || objT == m4cVar) {
            objT = new wq01(ven0Var, z, iu30Var, (byte) 3);
            x340Var2.s0(objT);
        }
        qim0 qim0VarX = ern1.x(qim0VarD, (iu30) objT);
        ven0 ven0Var2 = this.d;
        boolean zI2 = x340Var2.i(ven0Var2);
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new r9y0(ven0Var2, (byte) 12);
            x340Var2.s0(objT2);
        }
        qim0 qim0VarU = lrn1.u(qim0VarX, (iu30) objT2);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarU);
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
        nko1.H(gfh0VarC, x340Var2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var2, lljVar3);
        nko1.F(x340Var2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var2, lljVar4);
        vu30 vu30Var = this.e;
        if (vu30Var == null || !this.f) {
            x340Var2.i0(-1920820364);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1920892439);
            vvm1.q(this.g, 0, x340Var2);
            x340Var2.r(false);
        }
        Object objT3 = x340Var2.T();
        if (objT3 == m4cVar) {
            objT3 = ej41.b;
            x340Var2.s0(objT3);
        }
        iu30 iu30Var2 = (iu30) objT3;
        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
        tob1 tob1Var = this.h;
        boolean zI3 = x340Var2.i(tob1Var);
        he5 he5Var = this.i;
        boolean zG2 = zI3 | x340Var2.g(he5Var);
        ven0 ven0Var3 = this.t;
        boolean zI4 = zG2 | x340Var2.i(ven0Var3);
        Object objT4 = x340Var2.T();
        if (zI4 || objT4 == m4cVar) {
            objT4 = new v721(he5Var, ven0Var3, tob1Var, (byte) 22);
            x340Var2.s0(objT4);
        }
        dm5.a(iu30Var2, qim0VarD2, (iu30) objT4, x340Var2, 6, 0);
        if (vu30Var != null) {
            x340Var2.i0(-1920416899);
            qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            us71.k(0, vu30Var, x340Var2, true, false);
        } else {
            x340Var2.i0(-1920271788);
            x340Var2.r(false);
        }
        x340Var2.r(true);
        return rih1.a;
    }
}
