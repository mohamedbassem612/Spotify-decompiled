package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y9g0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ca50 e;
    public final /* synthetic */ lb9 f;
    public final /* synthetic */ g2f0 g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9g0(long j, float f, boolean z, Object obj, ca50 ca50Var, lb9 lb9Var, g2f0 g2f0Var, byte b) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = f;
        this.d = z;
        this.h = obj;
        this.e = ca50Var;
        this.f = lb9Var;
        this.g = g2f0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        Object obj4 = this.h;
        boolean z = this.d;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(this.b, 1.0f, 0.0f, 0.0f, 0.0f, 14)));
                    Float fValueOf = Float.valueOf(1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarE = dug.e(qim0VarZ, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(x340Var2).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarE, 0.0f, this.c, 0.0f, 16.0f, 5);
                    xag0 xag0Var = (xag0) obj4;
                    String str = xag0Var.b;
                    String str2 = xag0Var.a;
                    kdg0 kdg0Var = xag0Var.i;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE2, x340Var2, y580.Y);
                    if (z || kdg0Var == null) {
                        x340Var2.i0(-680392424);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-680704749);
                        otw.c(this.e, new aa50(kdg0Var.a, str2, str), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    }
                    otw.c(this.f, new kb9(str, xag0Var.c, xag0Var.d, str2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    if (xag0Var.e != 4) {
                        x340Var2.i0(-680051269);
                        otw.c(this.g, new e2f0(str2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-679900392);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    mmr0 mmr0Var2 = new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(this.b, 1.0f, 0.0f, 0.0f, 0.0f, 14)));
                    Float fValueOf2 = Float.valueOf(1.0f);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarE3 = dug.e(qim0VarZ2, v9c.t(new mmr0[]{mmr0Var2, new mmr0(fValueOf2, new u7h(cbx.a(x340Var4).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarE3, 0.0f, this.c, 0.0f, 16.0f, 5);
                    hdg0 hdg0Var = (hdg0) obj4;
                    String str3 = hdg0Var.c;
                    String str4 = hdg0Var.a;
                    e850 e850Var = hdg0Var.l;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE4 = zr7.E(x340Var4, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE4, x340Var4, y580.Y);
                    if (z || e850Var == null) {
                        x340Var4.i0(350331840);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(350010866);
                        otw.c(this.e, new aa50(e850Var.a, str4, str3), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                        x340Var4.r(false);
                    }
                    otw.c(this.f, new kb9(str3, hdg0Var.d, hdg0Var.e, str4), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    if (hdg0Var.g) {
                        x340Var4.i0(350665338);
                        otw.c(this.g, new e2f0(str4), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(350824864);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
