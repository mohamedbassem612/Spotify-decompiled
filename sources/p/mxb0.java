package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mxb0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public mxb0(List list, ws61 ws61Var, boolean z, iu30 iu30Var) {
        this.a = (byte) 3;
        this.b = list;
        this.d = ws61Var;
        this.c = z;
        this.e = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        List list = this.b;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    ji0 ji0Var = (ji0) list.get(iIntValue);
                    x340Var2.i0(180370885);
                    boolean zG = x340Var2.g(ji0Var.a);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = (xpw) ((Function0) obj5).invoke();
                        x340Var2.s0(objT);
                    }
                    otw.c((xpw) objT, new cxb0(ji0Var, iIntValue, z, (String) obj6), u291.v(nim0Var, 316.0f), (ipb1) null, x340Var2, 0, 8);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(i2 & 1, (i2 & 147) != 146);
                j06 j06Var = x340Var4.a;
                if (!zY) {
                    x340Var4.b0();
                    return rih1Var;
                }
                pjh0 pjh0Var = (pjh0) list.get(iIntValue3);
                x340Var4.i0(-329001932);
                gra graVar = een.f;
                Object objT2 = x340Var4.T();
                m4c m4cVar = fkj0.X;
                if (objT2 == m4cVar) {
                    objT2 = zdh0.P0;
                    x340Var4.s0(objT2);
                }
                qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT2);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                boolean z2 = x340Var4.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                String strN0 = cwl1.n0(pjh0Var.c == 2 ? 2131958385 : 2131958383, new Object[]{Integer.valueOf(iIntValue3 + 1), Integer.valueOf(((c380) obj6).size())}, x340Var4);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC2, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                jsl jslVar = new jsl(strN0);
                boolean zG2 = x340Var4.g(iu30Var) | x340Var4.i(pjh0Var);
                Object objT3 = x340Var4.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new sjh0(iu30Var, pjh0Var, (byte) 0);
                    x340Var4.s0(objT3);
                }
                xio1.d(pjh0Var, this.c, jslVar, (Function0) objT3, x340Var4, 0);
                if (pjh0Var.c == 2) {
                    x340Var4.i0(1050906199);
                    q3p1.j(0, pjh0Var.f, x340Var4, h2c.a.b(nim0Var));
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1051064764);
                    x340Var4.r(false);
                }
                x340Var4.r(true);
                cr31 cr31Var = er31.a;
                mgx mgxVar = mgx.e;
                gra graVar2 = een.h;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                zzq0 zzq0Var = new zzq0(4.0f, 4.0f, 4.0f, 4.0f);
                qim0 qim0VarC = eqr0.C(nim0Var, 5.0f, -5.0f);
                boolean zG3 = x340Var4.g(iu30Var) | x340Var4.i(pjh0Var);
                Object objT4 = x340Var4.T();
                if (zG3 || objT4 == m4cVar) {
                    objT4 = new sjh0(iu30Var, pjh0Var, (byte) 1);
                    x340Var4.s0(objT4);
                }
                cwl1.b(bin.x(qim0VarC, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), graVar2, cr31Var, mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, zzi.a, x340Var4, 0, 48, 2016);
                x340Var4.r(true);
                x340Var4.r(false);
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    sy41 sy41Var = (sy41) list.get(iIntValue5);
                    x340Var6.i0(462395036);
                    x340Var6.f0(-1924746681, sy41Var.getUuid());
                    p2o1.g(sy41Var, this.c, (s951) obj6, ((u380) obj5).contains(sy41Var.getUri()), x340Var6, 0);
                    x340Var6.r(false);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var2 = (iu30) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    ws61 ws61Var = (ws61) list.get(iIntValue7);
                    x340Var8.i0(1485374814);
                    boolean z3 = ws61Var == ((ws61) obj6);
                    boolean z4 = z && ws61Var != ws61.c;
                    boolean zG4 = x340Var8.g(iu30Var2) | x340Var8.e(ws61Var.ordinal());
                    Object objT5 = x340Var8.T();
                    if (zG4 || objT5 == m4cVar2) {
                        objT5 = new fh61(iu30Var2, ws61Var, (byte) 1);
                        x340Var8.s0(objT5);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT5);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarX = u291.x(cbx.b(x340Var8).b.e, 0.0f, 2, nim0Var);
                    mta mtaVar = cbx.b(x340Var8).d;
                    qim0 qim0VarH = u291.h(qim0VarX, 48.0f);
                    boolean zH = x340Var8.h(z3);
                    Object objT6 = x340Var8.T();
                    if (zH || objT6 == m4cVar2) {
                        objT6 = new mj10((byte) 24, z3);
                        x340Var8.s0(objT6);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarH, false, (iu30) objT6);
                    jgx jgxVar = z3 ? new jgx(8) : ogx.e;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                    gra graVar3 = een.h;
                    cua cuaVar = cbx.b(x340Var8).f;
                    cwl1.b(qim0VarB2, graVar3, er31.b(8.0f), jgxVar, zzq0VarH, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(1645886123, new zw2(ws61Var, z4, (byte) 20), x340Var8), x340Var8, 1572864, 48, 1440);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                ib60 ib60Var = (ib60) obj6;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (x340Var9.g(aqb0Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    wq61 wq61Var = (wq61) list.get(iIntValue9);
                    x340Var10.i0(-53938528);
                    x340Var10.f0(-417381949, ib60Var);
                    otw.c((ga51) obj5, new fa51(iIntValue9, wq61Var, ib60Var, z), (qim0) null, (ipb1) null, x340Var10, 70, 12);
                    x340Var10.r(false);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ mxb0(List list, Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = list;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    public /* synthetic */ mxb0(List list, boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = list;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }
}
