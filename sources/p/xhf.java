package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xhf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhf(List list, byte b) {
        super(3);
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        byte b2 = 2;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        List<xu30> list = this.b;
        boolean z = false;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarW = uyn1.w(nim0Var, (vzq0) obj);
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var3.i0(-1789996732);
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    rih1 rih1Var2 = rih1.a;
                    if (!zHasNext) {
                        x340Var3.r(false);
                        x340Var3.r(true);
                        return rih1Var2;
                    }
                    otw.c((inf) it.next(), rih1Var2, (qim0) null, (ipb1) null, x340Var, 48, 12);
                }
                break;
            case 1:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA2, x340Var4, lljVar4);
                nko1.H(xos0VarM2, x340Var4, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, lljVar2);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar);
                x340Var6.i0(-2122521647);
                for (xu30 xu30Var : list) {
                    gfh0 gfh0VarC = t1c.c(een.d, z);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, nim0Var);
                    hzj.A.getClass();
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, lljVar4);
                    nko1.H(xos0VarM3, x340Var4, lljVar3);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var4, lljVar2);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE3, x340Var4, lljVar);
                    xu30Var.invoke(h2c.a, x340Var4, 6);
                    x340Var6.r(true);
                    z = false;
                }
                x340Var6.r(z);
                x340Var6.r(true);
                return rih1Var;
            case 2:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                int i = 0;
                for (Object obj4 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) obj4;
                    if (i > 0) {
                        x340 x340Var8 = x340Var7;
                        x340Var8.i0(-1719290942);
                        Object objT = x340Var8.T();
                        if (objT == fkj0.X) {
                            objT = ej11.c;
                            x340Var8.s0(objT);
                        }
                        qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                        uwr uwrVar = cbx.a;
                        uwo1.e("•", qim0VarA, cbx.d(x340Var8).j, cbx.a(x340Var8).b.a, null, null, 0, false, null, 0, null, x340Var8, 6, 0, 2032);
                        x340Var8.r(false);
                    } else {
                        x340 x340Var9 = x340Var7;
                        x340Var9.i0(-1719037641);
                        x340Var9.r(false);
                    }
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, null, cbx.d(x340Var7).j, cbx.a(x340Var7).b.a, null, null, 0, false, cjc0Var, 0, null, x340Var7, 0, 0, 1778);
                    i = i2;
                }
                return rih1Var;
            case 3:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                k5p1.d(null, new d36(4.0f, true, new um5(false)), null, null, 0, 0, apo.r(-65168987, new xhf(list, b2), b0kVar), b0kVar, 1572864, 61);
                return rih1Var;
            case 4:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fC = ((i2c) obj).c() / oto1.x(219.0f, x340Var10);
                qim0 qim0VarH = u291.h(u291.v(nim0Var, oto1.w(fC, 267, x340Var10)), oto1.w(fC, 219, x340Var10));
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var11 = x340Var10;
                int iHashCode4 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM4 = x340Var11.m();
                qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarH);
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
                nko1.H(gfh0VarC2, x340Var10, y580.O0);
                nko1.H(xos0VarM4, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE4, x340Var10, y580.Y);
                jq70 jq70Var = (jq70) o7h.t0(0, list);
                if (jq70Var == null) {
                    x340Var12.i0(1083752671);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(1083752672);
                    kto1.d(jq70Var, u291.r(eqr0.C(nim0Var, oto1.w(fC, 1, x340Var10), oto1.w(fC, 26, x340Var10)), oto1.w(fC, 103, x340Var10)), x340Var10, 0);
                    x340Var12.r(false);
                }
                jq70 jq70Var2 = (jq70) o7h.t0(2, list);
                if (jq70Var2 == null) {
                    x340Var12.i0(1084073149);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(1084073150);
                    kto1.d(jq70Var2, u291.r(eqr0.C(nim0Var, oto1.w(fC, 93, x340Var10), oto1.w(fC, 107, x340Var10)), oto1.w(fC, 103, x340Var10)), x340Var10, 0);
                    x340Var12.r(false);
                }
                jq70 jq70Var3 = (jq70) o7h.t0(1, list);
                if (jq70Var3 == null) {
                    x340Var12.i0(1084379646);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(1084379647);
                    kto1.d(jq70Var3, u291.r(eqr0.C(nim0Var, oto1.w(fC, 164, x340Var10), oto1.w(fC, 9, x340Var10)), oto1.w(fC, 103, x340Var10)), x340Var10, 0);
                    x340Var12.r(false);
                }
                x340Var12.r(true);
                return rih1Var;
            case 5:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fC2 = ((i2c) obj).c() / oto1.x(219.0f, x340Var13);
                qim0 qim0VarH2 = u291.h(u291.v(nim0Var, oto1.w(fC2, 267, x340Var13)), oto1.w(fC2, 219, x340Var13));
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                x340 x340Var14 = x340Var13;
                int iHashCode5 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM5 = x340Var14.m();
                qim0 qim0VarE5 = zr7.E(x340Var13, qim0VarH2);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(gfh0VarC3, x340Var13, y580.O0);
                nko1.H(xos0VarM5, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE5, x340Var13, y580.Y);
                jq70 jq70Var4 = (jq70) o7h.t0(2, list);
                if (jq70Var4 == null) {
                    x340Var15.i0(-1356868096);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-1356868095);
                    kto1.d(jq70Var4, u291.r(eqr0.C(nim0Var, oto1.w(fC2, 5, x340Var13), oto1.w(fC2, 95, x340Var13)), oto1.w(fC2, 98, x340Var13)), x340Var13, 0);
                    x340Var15.r(false);
                }
                jq70 jq70Var5 = (jq70) o7h.t0(0, list);
                if (jq70Var5 == null) {
                    x340Var15.i0(-1356562436);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-1356562435);
                    kto1.d(jq70Var5, u291.r(eqr0.D(oto1.w(fC2, 61, x340Var13), 0.0f, 2, nim0Var), oto1.w(fC2, 98, x340Var13)), x340Var13, 0);
                    x340Var15.r(false);
                }
                jq70 jq70Var6 = (jq70) o7h.t0(1, list);
                if (jq70Var6 == null) {
                    x340Var15.i0(-1356284738);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-1356284737);
                    kto1.d(jq70Var6, u291.r(eqr0.C(nim0Var, oto1.w(fC2, 165, x340Var13), oto1.w(fC2, 29, x340Var13)), oto1.w(fC2, 98, x340Var13)), x340Var13, 0);
                    x340Var15.r(false);
                }
                jq70 jq70Var7 = (jq70) o7h.t0(3, list);
                if (jq70Var7 == null) {
                    x340Var15.i0(-1355977187);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-1355977186);
                    kto1.d(jq70Var7, u291.r(eqr0.C(nim0Var, oto1.w(fC2, 110, x340Var13), oto1.w(fC2, 121, x340Var13)), oto1.w(fC2, 98, x340Var13)), x340Var13, 0);
                    x340Var15.r(false);
                }
                x340Var15.r(true);
                return rih1Var;
            default:
                int iIntValue = ((Number) obj).intValue();
                x340 x340Var16 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var16.e(iIntValue) ? (byte) 4 : (byte) 2;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    uwr uwrVar3 = cbx.a;
                    uwo1.e((String) list.get(iIntValue), null, cbx.d(x340Var17).g, cbx.a(x340Var17).b.a, null, null, 0, false, null, 0, null, x340Var17, 0, 0, 2034);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
        }
    }
}
