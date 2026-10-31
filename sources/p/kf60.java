package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kf60 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public kf60(c380 c380Var, j2i j2iVar, float f) {
        this.a = (byte) 2;
        this.c = c380Var;
        this.d = j2iVar;
        this.b = f;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        int i;
        Throwable th;
        int i2;
        int i3;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        nim0 nim0Var = nim0.a;
        Object obj5 = this.d;
        c380 c380Var = this.c;
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
                    kmx0 kmx0Var = (kmx0) ((smc0) c380Var).get(iIntValue);
                    x340Var2.i0(1376906620);
                    boolean zG = x340Var2.g(kmx0Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        lzn0 lzn0Var = (lzn0) ((yxc1) ((wdm) ((rsq) obj5).a.c).b).g.get();
                        c8o.l(lzn0Var);
                        objT = new lmx0(lzn0Var);
                        x340Var2.s0(objT);
                    }
                    lmx0 lmx0Var = (lmx0) objT;
                    qim0 qim0VarD = aqb0Var.d(nim0Var, f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
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
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    otw.c(lmx0Var, kmx0Var, (qim0) null, (ipb1) null, x340Var2, 72, 12);
                    x340Var2.r(true);
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
                if ((iIntValue4 & 6) == 0) {
                    th = null;
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    th = null;
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    hd60 hd60Var = (hd60) c380Var.get(iIntValue3);
                    x340Var4.i0(1272350218);
                    boolean zG2 = x340Var4.g(hd60Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        lzn0 lzn0Var2 = (lzn0) ((yxc1) ((wdm) ((qsq) obj5).a.c).b).g.get();
                        c8o.l(lzn0Var2);
                        objT2 = new id60(lzn0Var2);
                        x340Var4.s0(objT2);
                    }
                    id60 id60Var = (id60) objT2;
                    qim0 qim0VarD2 = aqb0Var2.d(nim0Var, f);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarD2);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    otw.c(id60Var, hd60Var, (qim0) null, (ipb1) null, x340Var4, 8, 12);
                    x340Var4.r(true);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
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
                    Object obj6 = c380Var.get(iIntValue5);
                    x340Var6.i0(1175377991);
                    ((j2i) obj5).c1(Integer.valueOf(iIntValue5), obj6, u291.v(nim0Var, f), x340Var6, Integer.valueOf(((i3 & 126) >> 3) & 14));
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ kf60(List list, float f, Object obj, byte b) {
        this.a = b;
        this.c = list;
        this.b = f;
        this.d = obj;
    }
}
