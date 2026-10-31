package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cru extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cru(float f, float f2, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 4:
                cqz0 cqz0Var = dqz0.a;
                this.b = f;
                this.c = f2;
                super(2);
                break;
            default:
                this.b = f;
                this.c = f2;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        int i;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = false;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strN0 = cwl1.n0(2131963831, new Object[]{"2x"}, x340Var2);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strN0, (qim0) null, cbx.d(x340Var2).k, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    op71.g(x340Var2, u291.v(nim0Var, 4.0f));
                    xpx xpxVar = xpx.c;
                    qim0 qim0VarR = u291.r(nim0Var, 10.0f);
                    boolean zD = x340Var2.d(f2);
                    Object objT = x340Var2.T();
                    if (zD || objT == m4cVar) {
                        obj3 = objT;
                        jc5 jc5Var = new jc5((byte) 20, f2);
                        x340Var2.s0(jc5Var);
                        obj3 = jc5Var;
                    }
                    qim0 qim0VarC = i541.C(qim0VarR, (iu30) obj3);
                    long j = cbx.a(x340Var2).b.a;
                    int i2 = xpx.d | 48;
                    isl islVar = isl.a;
                    w0h1.a(xpxVar, islVar, qim0VarC, j, 0L, false, x340Var2, i2, 48);
                    qim0 qim0VarR2 = u291.r(nim0Var, 12.0f);
                    boolean zD2 = x340Var2.d(f);
                    Object objT2 = x340Var2.T();
                    Object obj5 = objT2;
                    if (zD2 || objT2 == m4cVar) {
                        jc5 jc5Var2 = new jc5((byte) 21, f);
                        x340Var2.s0(jc5Var2);
                        obj5 = jc5Var2;
                    }
                    w0h1.a(xpxVar, islVar, i541.C(qim0VarR2, (iu30) obj5), cbx.a(x340Var2).b.a, 0L, false, x340Var2, i2, 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarB = u291.B(nim0Var, (gra) null, 3);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarY = uyn1.y(dug.f(qim0VarB, cbx.a(x340Var4).a.c, er31.b(16.0f)), 16.0f, 8.0f);
                    Object objT3 = x340Var4.T();
                    if (objT3 == fkj0.X) {
                        obj4 = objT3;
                        wiu wiuVar = wiu.R0;
                        x340Var4.s0(wiuVar);
                        obj4 = wiuVar;
                    }
                    obj4 = objT3;
                    qim0 qim0VarA = s161.a(qim0VarY, (iu30) obj4);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var4, 48);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(hmb0.t1);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    gfx.b(1, apo.r(-962614979, new cru(f2, f, (byte) (z2 ? 1 : 0), z ? 1 : 0), x340Var4), x340Var4, 54);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                y4o1.m(f2, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                tm80.p(f2, f, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 4:
                tlc1 tlc1Var = (tlc1) obj;
                long j2 = ((hjl) obj2).a;
                int iH = hjl.h(j2);
                float fX0 = tlc1Var.X0(f2);
                float fX1 = tlc1Var.X0(f) * 2.0f;
                if (iH == Integer.MAX_VALUE || (i = (int) (iH / (fX0 + fX1))) < 1) {
                    i = 1;
                }
                cqz0 cqz0Var = dqz0.a;
                return tlc1Var.S(hjl.i(j2), hjl.h(j2), b7x.a, new f2(((afh0) o7h.q0(tlc1Var.P("Bars", new j2i(803491714, new oae0(i, f2, f), true)))).H(j2), (byte) 21));
            case 5:
                ((Number) obj2).intValue();
                yah0.k(f2, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                z5p1.g(f2, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                j6p1.i(f2, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Context context = (Context) x340Var6.k(p4k.b);
                    float f3 = (f - 16.0f) - 16.0f;
                    if (p3v.b(f2, 36.0f + w6p1.l(nee1.d, context.getString(2131959298), f3, x340Var6) + w6p1.l(nee1.e, context.getString(2131959297), f3, x340Var6) + 16.0f) >= 0) {
                        x340Var6.i0(2019767887);
                        rwq0.j(x340Var6, 0);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(2019813364);
                        if (p3v.b(f2, 110.0f) > 0) {
                            x340Var6.i0(2019866219);
                            rwq0.j(x340Var6, 0);
                            x340Var6.r(false);
                        } else {
                            x340Var6.i0(2019912161);
                            fbp1.k(x340Var6, 0);
                            x340Var6.r(false);
                        }
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cru(float f, float f2, byte b, boolean z) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cru(float f, float f2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = f2;
    }
}
