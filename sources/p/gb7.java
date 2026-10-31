package p;

import android.app.DatePickerDialog;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gb7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb7(zzq0 zzq0Var, boolean z, boolean z2, vu30 vu30Var) {
        super(3);
        this.a = (byte) 0;
        this.d = zzq0Var;
        this.b = z;
        this.c = z2;
        this.e = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        max maxVar;
        max maxVar2;
        boolean z2;
        boolean z3;
        max maxVar3;
        boolean z4;
        byte b = this.a;
        max maxVar4 = jax.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarA = nim0.a;
        boolean z5 = this.c;
        boolean z6 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarW = uyn1.w(aqo1.e(z6, z5), nmn1.m((zzq0) obj5, new p3v(0.0f), new p3v(0.0f), null, new p3v(0.0f), 4));
                vu30 vu30Var = (vu30) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                vu30Var.invoke(x340Var, 0);
                x340Var3.r(true);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z6) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-244950317);
                    z = false;
                    x340Var5.r(false);
                    maxVar = maxVar4;
                } else {
                    z = false;
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(-244896811);
                    max haxVar = new hax(cwl1.o0(x340Var6, 2131963822));
                    x340Var6.r(false);
                    maxVar = haxVar;
                }
                if (z5) {
                    x340 x340Var7 = x340Var4;
                    x340Var7.i0(-244727117);
                    x340Var7.r(z);
                    maxVar2 = maxVar4;
                } else {
                    x340 x340Var8 = x340Var4;
                    x340Var8.i0(-244673611);
                    max haxVar2 = new hax(cwl1.o0(x340Var8, 2131963823));
                    x340Var8.r(z);
                    maxVar2 = haxVar2;
                }
                beo0 beo0Var = (beo0) obj5;
                int i = beo0Var.e;
                String str = beo0Var.h;
                String str2 = beo0Var.i;
                String str3 = beo0Var.j;
                String str4 = beo0Var.k;
                iu30 iu30Var = (iu30) obj4;
                qim0 qim0VarB = u291.B(qim0VarA, (gra) null, 3);
                x340 x340Var9 = x340Var4;
                Object objT = x340Var9.T();
                if (objT == fkj0.X) {
                    objT = oqi.N0;
                    x340Var9.s0(objT);
                }
                dgo1.g(i, maxVar, maxVar2, str, str2, str3, str4, iu30Var, s161.a(qim0VarB, (iu30) objT), x340Var9, 12582912);
                return rih1Var;
            case 2:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD = ((i2c) obj).d() * 0.6f;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var10, 0);
                x340 x340Var11 = x340Var10;
                int iHashCode2 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM2 = x340Var11.m();
                qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarA);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(jw31VarA, x340Var10, y580.O0);
                nko1.H(xos0VarM2, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE2, x340Var10, y580.Y);
                uwr uwrVar = cbx.a;
                uwo1.e(str5, new wnb0(1.0f, false).then((!z6 || z5) ? qim0VarA : e9k.n(63, qim0VarA)), cbx.d(x340Var10).j, cbx.a(x340Var10).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var10, 0, 0, 1712);
                if (str6 != null) {
                    x340Var12.i0(529892905);
                    z2 = true;
                    lrn1.k(0, str6, x340Var10, u291.x(0.0f, fD, 1, qim0VarA));
                    x340Var12.r(false);
                } else {
                    z2 = true;
                    x340Var12.i0(530119701);
                    x340Var12.r(false);
                }
                x340Var12.r(z2);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                e4p1.c(this.b, this.c, (Function0) obj5, (Function0) obj4, null, (b0k) obj2, 0);
                return rih1Var;
            case 4:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                u4p1.q(z6, apo.r(1557754634, new r7e0(obj5, z5, obj4, (byte) 22), b0kVar), b0kVar, 48);
                return rih1Var;
            case 5:
                i2c i2cVar = (i2c) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var13.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                boolean zY = x340Var14.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var14.a;
                if (zY) {
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var14).g;
                    float f = zjy.p(48.0f, new p3v(i2cVar.c() * 0.4f)).a;
                    float fC = i2cVar.c() * 0.125f;
                    Object objT2 = x340Var14.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        objT2 = pzm.i(x340Var14);
                    }
                    lz20 lz20Var = (lz20) objT2;
                    ven0 ven0VarY = h7w.y(x340Var14);
                    if (z6 && ((Boolean) ven0VarY.getValue()).booleanValue()) {
                        x340Var14.i0(360202711);
                        Boolean boolValueOf = Boolean.valueOf(z5);
                        boolean zH = x340Var14.h(z5);
                        Object objT3 = x340Var14.T();
                        if (zH || objT3 == m4cVar) {
                            objT3 = new iwd(z5, lz20Var, (lnm) null, (byte) 4);
                            x340Var14.s0(objT3);
                        }
                        qxd0.t(boolValueOf, x340Var14, (vu30) objT3);
                        z3 = false;
                        x340Var14.r(false);
                    } else {
                        j06Var = j06Var;
                        obj5 = obj5;
                        z3 = false;
                        x340Var14.i0(360501582);
                        x340Var14.r(false);
                    }
                    qim0 qim0VarB2 = i2cVar.b(qim0VarA);
                    lfa1 lfa1Var = (lfa1) obj5;
                    tcf1 tcf1Var = (tcf1) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.h, z3);
                    int iHashCode3 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM3 = x340Var14.m();
                    qim0 qim0VarE3 = zr7.E(x340Var14, qim0VarB2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC2, x340Var14, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM3, x340Var14, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var14, lljVar3);
                    nko1.F(x340Var14);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE3, x340Var14, lljVar4);
                    qim0 qim0VarZ = uyn1.z(0.0f, fC, 1, qim0VarA);
                    Object objT4 = x340Var14.T();
                    if (objT4 == m4cVar) {
                        objT4 = v7f1.R0;
                        x340Var14.s0(objT4);
                    }
                    qim0 qim0VarThen = s161.b(qim0VarZ, true, (iu30) objT4).then(z6 ? vby0.p(qim0VarA, lz20Var).then(c030.a) : qxy0.u(qim0VarA, (idn0) null, 3));
                    mbh mbhVarA = jbh.a(f36Var, een.Q0, x340Var14, 48);
                    int iHashCode4 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM4 = x340Var14.m();
                    qim0 qim0VarE4 = zr7.E(x340Var14, qim0VarThen);
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(mbhVarA, x340Var14, lljVar);
                    nko1.H(xos0VarM4, x340Var14, lljVar2);
                    x0d.q(iHashCode4, x340Var14, lljVar3, x340Var14);
                    nko1.H(qim0VarE4, x340Var14, lljVar4);
                    h7w.a(lfa1Var.e.a, f, tcf1Var, x340Var14, 70);
                    op71.g(x340Var14, u291.h(qim0VarA, cbx.b(x340Var14).b.a));
                    if (z5) {
                        x340Var14.i0(-320656032);
                    } else {
                        x340Var14.i0(-320655281);
                        Object objT5 = x340Var14.T();
                        if (objT5 == m4cVar) {
                            objT5 = v7f1.S0;
                            x340Var14.s0(objT5);
                        }
                        qim0VarA = s161.a(qim0VarA, (iu30) objT5);
                    }
                    x340Var14.r(false);
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM5 = x340Var14.m();
                    qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarA);
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var14, lljVar);
                    nko1.H(xos0VarM5, x340Var14, lljVar2);
                    x0d.q(iHashCode5, x340Var14, lljVar3, x340Var14);
                    nko1.H(qim0VarE5, x340Var14, lljVar4);
                    h7w.l(lfa1Var, tcf1Var, x340Var14, 0);
                    us71.m(x340Var14, true, true, true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            default:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var15.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                boolean zY2 = x340Var16.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18);
                j06 j06Var2 = x340Var16.a;
                if (zY2) {
                    qim0 qim0VarW2 = uyn1.w(u291.d(qim0VarA, 1.0f), vzq0Var);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var16).b;
                    qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarW2);
                    cvx cvxVar2 = cbx.b(x340Var16).b;
                    qim0 qim0VarB3 = uyn1.B(qim0VarZ2, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    DatePickerDialog datePickerDialog = (DatePickerDialog) obj5;
                    y7e1 y7e1Var = (y7e1) obj4;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var16, 0);
                    int iHashCode6 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM6 = x340Var16.m();
                    qim0 qim0VarE6 = zr7.E(x340Var16, qim0VarB3);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA2, x340Var16, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM6, x340Var16, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, x340Var16, lljVar7);
                    nko1.F(x340Var16);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE6, x340Var16, lljVar8);
                    String strO0 = cwl1.o0(x340Var16, 2131963513);
                    lee1 lee1Var = cbx.d(x340Var16).d;
                    qim0 qim0VarF = u291.f(qim0VarA, 1.0f);
                    cvx cvxVar3 = cbx.b(x340Var16).b;
                    qim0 qim0VarB4 = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    Object objT6 = x340Var16.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT6 == m4cVar2) {
                        objT6 = qmh1.V0;
                        x340Var16.s0(objT6);
                    }
                    uwo1.e(strO0, s161.b(qim0VarB4, false, (iu30) objT6), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var16, 0, 0, 2024);
                    qim0 qim0VarF2 = u291.f(qim0VarA, 1.0f);
                    boolean zH2 = x340Var16.h(z6) | x340Var16.i(datePickerDialog);
                    Object objT7 = x340Var16.T();
                    if (zH2 || objT7 == m4cVar2) {
                        objT7 = new cb8(z6, datePickerDialog, (byte) 21);
                        x340Var16.s0(objT7);
                    }
                    qim0 qim0VarS = b9p1.s(qim0VarF2, (iu30) objT7);
                    gfh0 gfh0VarC4 = t1c.c(een.d, false);
                    int iHashCode7 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM7 = x340Var16.m();
                    qim0 qim0VarE7 = zr7.E(x340Var16, qim0VarS);
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var16, lljVar5);
                    nko1.H(xos0VarM7, x340Var16, lljVar6);
                    x0d.q(iHashCode7, x340Var16, lljVar7, x340Var16);
                    nko1.H(qim0VarE7, x340Var16, lljVar8);
                    eyx eyxVar = eyx.e;
                    if (z6) {
                        x340Var16.i0(1767143616);
                        max haxVar3 = new hax(cwl1.o0(x340Var16, 2131963512));
                        x340Var16.r(false);
                        maxVar3 = haxVar3;
                    } else {
                        x340Var16.i0(1767147779);
                        x340Var16.r(false);
                        maxVar3 = maxVar4;
                    }
                    String strO1 = cwl1.o0(x340Var16, 2131963507);
                    qim0 qim0VarF3 = u291.f(qim0VarA, 1.0f);
                    boolean z7 = this.c;
                    rwo1.a(y7e1Var, eyxVar, qim0VarF3, maxVar3, strO1, null, null, z7, null, null, null, null, null, null, null, null, null, null, 0.0f, false, x340Var16, 390, 0, 0, 2096864);
                    x340Var16.r(true);
                    if (z7) {
                        x340Var16.i0(-1298517310);
                        String strO2 = cwl1.o0(x340Var16, 2131963508);
                        lee1 lee1Var2 = cbx.d(x340Var16).j;
                        qim0 qim0VarF4 = u291.f(qim0VarA, 1.0f);
                        cvx cvxVar4 = cbx.b(x340Var16).b;
                        qim0 qim0VarB5 = uyn1.B(qim0VarF4, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                        Object objT8 = x340Var16.T();
                        if (objT8 == m4cVar2) {
                            objT8 = qmh1.W0;
                            x340Var16.s0(objT8);
                        }
                        uwo1.e(strO2, s161.b(qim0VarB5, false, (iu30) objT8), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2040);
                        z4 = false;
                        x340Var16.r(false);
                    } else {
                        z4 = false;
                        x340Var16.i0(-1298177767);
                        x340Var16.r(false);
                    }
                    x340Var16.r(true);
                    if (z6) {
                        x340Var16.i0(-1364887329);
                        qim0 qim0VarD = u291.d(qim0VarA, 1.0f);
                        gfh0 gfh0VarC5 = t1c.c(een.h, z4);
                        int iHashCode8 = Long.hashCode(x340Var16.T);
                        xos0 xos0VarM8 = x340Var16.m();
                        qim0 qim0VarE8 = zr7.E(x340Var16, qim0VarD);
                        x340Var16.m0();
                        if (x340Var16.S) {
                            x340Var16.l(n4kVar);
                        } else {
                            x340Var16.v0();
                        }
                        nko1.H(gfh0VarC5, x340Var16, lljVar5);
                        nko1.H(xos0VarM8, x340Var16, lljVar6);
                        x0d.q(iHashCode8, x340Var16, lljVar7, x340Var16);
                        nko1.H(qim0VarE8, x340Var16, lljVar8);
                        rhx0.a((qim0) null, cbx.a(x340Var16).c.c, 0.0f, 0L, 0, 0.0f, x340Var16, 0, 61);
                        x340Var16.r(true);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(-1364564433);
                        x340Var16.r(z4);
                    }
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb7(boolean z, Object obj, boolean z2, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = z2;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb7(boolean z, boolean z2, Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = obj;
        this.e = obj2;
    }
}
