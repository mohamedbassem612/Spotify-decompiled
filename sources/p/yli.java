package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yli extends hab0 implements xu30 {
    public static final yli N0;
    public static final yli O0;
    public static final yli P0;
    public static final yli Q0;
    public static final yli R0;
    public static final yli S0;
    public static final yli T0;
    public static final yli U0;
    public static final yli V0;
    public static final yli W0;
    public static final yli X;
    public static final yli X0;
    public static final yli Y;
    public static final yli Y0;
    public static final yli Z;
    public static final yli Z0;
    public static final yli a1;
    public static final yli b;
    public static final yli b1;
    public static final yli c;
    public static final yli c1;
    public static final yli d;
    public static final yli d1;
    public static final yli e;
    public static final yli e1;
    public static final yli f;
    public static final yli g;
    public static final yli h;
    public static final yli i;
    public static final yli t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new yli(i2, (byte) 0);
        c = new yli(i2, (byte) 1);
        d = new yli(i2, (byte) 2);
        e = new yli(i2, (byte) 3);
        f = new yli(i2, (byte) 4);
        g = new yli(i2, (byte) 5);
        h = new yli(i2, (byte) 6);
        i = new yli(i2, (byte) 7);
        t = new yli(i2, (byte) 8);
        X = new yli(i2, (byte) 9);
        Y = new yli(i2, (byte) 10);
        Z = new yli(i2, (byte) 11);
        N0 = new yli(i2, (byte) 12);
        O0 = new yli(i2, (byte) 13);
        P0 = new yli(i2, (byte) 14);
        Q0 = new yli(i2, (byte) 15);
        R0 = new yli(i2, (byte) 16);
        S0 = new yli(i2, (byte) 17);
        T0 = new yli(i2, (byte) 18);
        U0 = new yli(i2, (byte) 19);
        V0 = new yli(i2, (byte) 20);
        W0 = new yli(i2, (byte) 21);
        X0 = new yli(i2, (byte) 22);
        Y0 = new yli(i2, (byte) 23);
        Z0 = new yli(i2, (byte) 24);
        a1 = new yli(i2, (byte) 25);
        b1 = new yli(i2, (byte) 26);
        c1 = new yli(i2, (byte) 27);
        d1 = new yli(i2, (byte) 28);
        e1 = new yli(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yli(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                hux huxVar = (hux) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    w0h1.a(huxVar, isl.a, (qim0) null, 0L, 0L, false, x340Var2, 56 | (iIntValue & 14), 60);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                wr91 wr91Var = (wr91) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(wr91Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    nyx.a(3, (wux) null, apo.r(1239739019, new r6i(wr91Var, (byte) 3), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                bs91 bs91Var = (bs91) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var7.g(bs91Var) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    sok.k(bs91Var, (qim0) null, bmi.a, x340Var8, (iIntValue4 & 14) | 384, 2);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ilx ilxVar = ilx.c;
                uwr uwrVar = cbx.a;
                w0h1.a(ilxVar, isl.a, (qim0) null, cbx.a(b0kVar).c.c, 0L, false, b0kVar, ilx.d | 48, 52);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                ha71.l(new p3v(80.0f), 16.0f, 4.0f, (b0k) obj2, 0, 0);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                ha71.l(new p3v(200.0f), 20.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                ha71.l(new p3v(64.0f), 64.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                return rih1Var;
            case 10:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(b0kVar2, 2131955555);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strO0, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                return rih1Var;
            case 11:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("episode_generation_indicator_progress", nim0Var);
                uwr uwrVar3 = cbx.a;
                xto1.e(qim0VarN, 2, cbx.a(b0kVar3).b.b, 0L, b0kVar3, 48, 8);
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                return rih1Var;
            case 14:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var9.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    qim0 qim0VarV = u291.v(nim0Var, 150.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarV);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE, x340Var10, y580.Y);
                    us71.j(iIntValue5 & 14, vu30Var, x340Var10, true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 15:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var11.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    qim0 qim0VarV2 = u291.v(nim0Var, 150.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM2 = x340Var12.m();
                    qim0 qim0VarE2 = zr7.E(x340Var12, qim0VarV2);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC2, x340Var12, y580.O0);
                    nko1.H(xos0VarM2, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE2, x340Var12, y580.Y);
                    us71.j(iIntValue6 & 14, vu30Var2, x340Var12, true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                vu30 vu30Var3 = (vu30) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var13.i(vu30Var3) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    qim0 qim0VarV3 = u291.v(nim0Var, 150.0f);
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM3 = x340Var14.m();
                    qim0 qim0VarE3 = zr7.E(x340Var14, qim0VarV3);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var14, y580.O0);
                    nko1.H(xos0VarM3, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE3, x340Var14, y580.Y);
                    us71.j(iIntValue7 & 14, vu30Var3, x340Var14, true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                return rih1Var;
            case 18:
                vu30 vu30Var4 = (vu30) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var15.i(vu30Var4) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    qim0 qim0VarV4 = u291.v(nim0Var, 150.0f);
                    gfh0 gfh0VarC4 = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM4 = x340Var16.m();
                    qim0 qim0VarE4 = zr7.E(x340Var16, qim0VarV4);
                    hzj.A.getClass();
                    if (x340Var16.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var16, y580.O0);
                    nko1.H(xos0VarM4, x340Var16, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var16, y580.R0);
                    nko1.F(x340Var16);
                    nko1.H(qim0VarE4, x340Var16, y580.Y);
                    us71.j(iIntValue8 & 14, vu30Var4, x340Var16, true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj3).intValue();
                return rih1Var;
            case 20:
                ((Number) obj3).intValue();
                return rih1Var;
            case 21:
                ((Number) obj3).intValue();
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                return rih1Var;
            case 24:
                ((Number) obj3).intValue();
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                y4o1.m(160.0f, 22.0f, (b0k) obj2, 0);
                return rih1Var;
            case 26:
                ((Number) obj3).intValue();
                return rih1Var;
            case 27:
                ((Number) obj3).intValue();
                return rih1Var;
            case 28:
                ((Number) obj3).intValue();
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                return rih1Var;
        }
    }
}
