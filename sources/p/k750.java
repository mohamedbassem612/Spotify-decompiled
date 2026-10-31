package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k750 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k750(byte b, int i, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        byte b = this.a;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarF = nim0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var2, 2131956392);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).h;
                    if (z2) {
                        qim0VarF = u291.f(qim0VarF, 1.0f);
                    }
                    uwo1.e(strO0, qim0VarF, lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF2 = dug.f(u291.d(qim0VarF, 1.0f), yah.a, u5j1Var);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarF2);
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
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    if (z2) {
                        x340Var4.i0(228168428);
                        xto1.e((qim0) null, 6, 0L, 0L, x340Var4, 48, 13);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(228263567);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                sgc1.c(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else if (z2) {
                    x340Var6.i0(1857178492);
                    xto1.e((qim0) null, 1, 0L, 0L, x340Var6, 48, 13);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1857271771);
                    String strO1 = cwl1.o0(x340Var6, 2131959906);
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO1, anm1.N("join_playlist_button", qim0VarF), cbx.d(x340Var6).k, 0L, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var6, 0, 0, 1784);
                    x340Var6.r(false);
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                vyo1.f(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var8, 0);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(jw31VarA, x340Var8, y580.O0);
                    nko1.H(xos0VarM2, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE2, x340Var8, y580.Y);
                    if (z2) {
                        x340Var8.i0(-447268788);
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var8).g;
                        w0h1.a(pox.c, new jsl(cwl1.o0(x340Var8, 2131957465)), u291.r(qim0VarF, 16.0f), 0L, 0L, true, x340Var8, pox.d | 196608, 24);
                        cvx cvxVar = cbx.b(x340Var8).b;
                        ab80.p(qim0VarF, 8.0f, x340Var8, false);
                    } else {
                        x340Var8.i0(-446805586);
                        x340Var8.r(false);
                    }
                    String strO2 = cwl1.o0(x340Var8, 2131957463);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strO2, (qim0) null, cbx.d(x340Var8).k, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2034);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    w0h1.a(z2 ? spx.c : xpx.c, new jsl(cwl1.o0(x340Var10, z2 ? 2131957574 : 2131957573)), (qim0) null, 0L, 0L, false, x340Var10, 8, 60);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                o6p1.i(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strO3 = cwl1.o0(x340Var12, z2 ? 2131957647 : 2131957644);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(strO3, (qim0) null, cbx.d(x340Var12).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2042);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var14, z2 ? 2131953637 : 2131953636), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    w0h1.a(ptx.c, isl.a, (qim0) null, upo1.C(z2, x340Var16), 0L, false, x340Var16, ptx.d | 48, 52);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                z1p1.d(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ha71.g(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    w0h1.a(z2 ? aux.c : ztx.c, new jsl(cwl1.o0(x340Var18, z2 ? 2131962265 : 2131962255)), (qim0) null, 0L, 0L, true, x340Var18, 196616, 28);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                u7n0.k(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                zho1.c(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    hm5.a(Boolean.valueOf(z2), (qim0) null, (iu30) null, (tl3) null, "", (iu30) null, e8j.a, x340Var20, 1597440, 46);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (!x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x340Var22.b0();
                } else if (z2) {
                    x340Var22.i0(1473083912);
                    w0h1.a(spx.c, new jsl(cwl1.o0(x340Var22, 2131963356)), anm1.N("track_preview_pause_button", qim0VarF), 0L, 0L, false, x340Var22, spx.d, 56);
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(1473346699);
                    w0h1.a(xpx.c, new jsl(cwl1.o0(x340Var22, 2131963357)), anm1.N("track_preview_play_button", qim0VarF), 0L, 0L, false, x340Var22, xpx.d, 56);
                    x340Var22.r(false);
                }
                return rih1Var;
            case 18:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    hm5.a(Boolean.valueOf(z2), (qim0) null, (iu30) null, (tl3) null, "", (iu30) null, m8j.a, x340Var24, 1597440, 46);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwr uwrVar6 = cbx.a;
                    lee1 lee1Var2 = cbx.d(x340Var26).j;
                    boolean zH = x340Var26.h(z2);
                    Object objT = x340Var26.T();
                    if (zH || objT == fkj0.X) {
                        objT = new mj10((byte) 19, z2);
                        x340Var26.s0(objT);
                    }
                    uwo1.e("Open feedback sheet", i541.C(qim0VarF, (iu30) objT), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 6, 0, 2040);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 20:
                yxx yxxVar = ((afx) obj).b;
                return new u7h(z2 ? yxxVar.c : yxxVar.a);
            case 21:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    isl islVar = isl.a;
                    if (z2) {
                        x340Var28.i0(1341867957);
                        uwr uwrVar7 = cbx.a;
                        long j = cbx.a(x340Var28).b.c;
                        zov0 zov0Var2 = cbx.b(x340Var28).g;
                        wkt0.a(zkt0.a, u291.r(qim0VarF, 16.0f), islVar, j, false, x340Var28, 390, 16);
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(1342163108);
                        xpx xpxVar = xpx.c;
                        uwr uwrVar8 = cbx.a;
                        zov0 zov0Var3 = cbx.b(x340Var28).g;
                        w0h1.a(xpxVar, islVar, u291.r(qim0VarF, 16.0f), 0L, 0L, false, x340Var28, xpx.d | 48, 56);
                        x340Var28.r(false);
                    }
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    uwr uwrVar9 = cbx.a;
                    ljo1.j(this.b, (iu30) null, (qim0) null, false, hxo1.m(cbx.a(x340Var30).b.a, cbx.a(x340Var30).b.f, cbx.a(x340Var30).b.b, cbx.a(x340Var30).a.b.a(), cbx.a(x340Var30).b.b, x340Var30, 65420), (idn0) null, x340Var30, 48, 92);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (!x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x340Var32.b0();
                } else if (z2) {
                    x340Var32.i0(511199099);
                    x340Var32.r(false);
                } else {
                    x340Var32.i0(511042456);
                    w0h1.a(qpx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var32, qpx.d | 48, 60);
                    x340Var32.r(false);
                }
                return rih1Var;
            case 24:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ijo1.c(6, x340Var34, (qim0) null, z2);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    nyx.a(0, (wux) null, apo.r(-1946957659, new k750((byte) 24, z2), x340Var36), x340Var36, 3072, 7);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                zc01.h(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                cyo1.f(z2, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    qim0 qim0VarF3 = dug.f(u291.d(qim0VarF, 1.0f), yah.a, u5j1Var);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode3 = Long.hashCode(x340Var38.T);
                    xos0 xos0VarM3 = x340Var38.m();
                    qim0 qim0VarE3 = zr7.E(x340Var38, qim0VarF3);
                    hzj.A.getClass();
                    if (x340Var38.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var38.m0();
                    if (x340Var38.S) {
                        x340Var38.l(n4kVar);
                    } else {
                        x340Var38.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var38, y580.O0);
                    nko1.H(xos0VarM3, x340Var38, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var38, y580.R0);
                    nko1.F(x340Var38);
                    nko1.H(qim0VarE3, x340Var38, y580.Y);
                    if (z2) {
                        x340Var38.i0(-667478666);
                        xto1.e((qim0) null, 6, 0L, 0L, x340Var38, 48, 13);
                        x340Var38.r(false);
                    } else {
                        x340Var38.i0(-667383527);
                        x340Var38.r(false);
                    }
                    x340Var38.r(true);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            default:
                ec51 ec51Var = (ec51) obj;
                long jLongValue = ((Number) obj2).longValue();
                int i = ec51Var.e;
                ac51 ac51Var = ec51Var.g;
                cc51 cc51Var = ac51Var != null ? ac51Var.d : null;
                boolean z3 = cc51Var == cc51.d && (num = ec51Var.f) != null && num.intValue() == i;
                if (!z2 && (cc51Var == cc51.f || z3)) {
                    z = true;
                }
                return new yb51(ec51.a(ec51Var, 0, 0L, 0L, 0, i + 1, (Integer) null, z ? null : ac51Var, 0L, 143), z ? ac51Var.c(1, jLongValue) : null, 4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k750(byte b, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
    }
}
