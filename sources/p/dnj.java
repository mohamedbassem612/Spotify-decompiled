package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dnj extends hab0 implements xu30 {
    public static final dnj N0;
    public static final dnj O0;
    public static final dnj P0;
    public static final dnj Q0;
    public static final dnj R0;
    public static final dnj S0;
    public static final dnj T0;
    public static final dnj U0;
    public static final dnj V0;
    public static final dnj W0;
    public static final dnj X;
    public static final dnj X0;
    public static final dnj Y;
    public static final dnj Y0;
    public static final dnj Z;
    public static final dnj Z0;
    public static final dnj a1;
    public static final dnj b;
    public static final dnj b1;
    public static final dnj c;
    public static final dnj c1;
    public static final dnj d;
    public static final dnj d1;
    public static final dnj e;
    public static final dnj e1;
    public static final dnj f;
    public static final dnj g;
    public static final dnj h;
    public static final dnj i;
    public static final dnj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new dnj(i2, (byte) 0);
        c = new dnj(i2, (byte) 1);
        d = new dnj(i2, (byte) 2);
        e = new dnj(i2, (byte) 3);
        f = new dnj(i2, (byte) 4);
        g = new dnj(i2, (byte) 5);
        h = new dnj(i2, (byte) 6);
        i = new dnj(i2, (byte) 7);
        t = new dnj(i2, (byte) 8);
        X = new dnj(i2, (byte) 9);
        Y = new dnj(i2, (byte) 10);
        Z = new dnj(i2, (byte) 11);
        N0 = new dnj(i2, (byte) 12);
        O0 = new dnj(i2, (byte) 13);
        P0 = new dnj(i2, (byte) 14);
        Q0 = new dnj(i2, (byte) 15);
        R0 = new dnj(i2, (byte) 16);
        S0 = new dnj(i2, (byte) 17);
        T0 = new dnj(i2, (byte) 18);
        U0 = new dnj(i2, (byte) 19);
        V0 = new dnj(i2, (byte) 20);
        W0 = new dnj(i2, (byte) 21);
        X0 = new dnj(i2, (byte) 22);
        Y0 = new dnj(i2, (byte) 23);
        Z0 = new dnj(i2, (byte) 24);
        a1 = new dnj(i2, (byte) 25);
        b1 = new dnj(i2, (byte) 26);
        c1 = new dnj(i2, (byte) 27);
        d1 = new dnj(i2, (byte) 28);
        e1 = new dnj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dnj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        gex0 gex0Var = h36.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                String str = (String) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(str) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var2).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, iIntValue & 14, 0, 2042);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var4, 54);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
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
                    nko1.H(jw31VarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    String strO0 = cwl1.o0(x340Var4, 2131963334);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var4).g, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                    dnx dnxVar = dnx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var4, 2131963334));
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    w0h1.a(dnxVar, jslVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var4).b.b, 0L, false, x340Var4, dnx.d, 48);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    cev0.m(uyn1.z(8.0f, 0.0f, 2, nim0Var), x340Var6, 54);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    cev0.l(130.0f, 13.0f, (qim0) null, x340Var8, 54);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    cev0.l(140.0f, 16.0f, (qim0) null, x340Var10, 54);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    cev0.l(64.0f, 64.0f, (qim0) null, x340Var12, 54);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar, 2131963432);
                uwr uwrVar3 = cbx.a;
                long j = cbx.a(b0kVar).b.a;
                lee1 lee1Var = cbx.d(b0kVar).h;
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                cvx cvxVar3 = cbx.b(b0kVar).b;
                uwo1.e(strO1, uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5), lee1Var, j, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2016);
                return rih1Var;
            case 9:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                era eraVar = een.Q0;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var13).b;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                float f2 = cbx.b(x340Var13).b.a;
                cvx cvxVar5 = cbx.b(x340Var13).b;
                qim0 qim0VarB = uyn1.B(qim0VarZ2, 0.0f, f2, 0.0f, 16.0f, 5);
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var13, 0);
                x340 x340Var14 = x340Var13;
                int iHashCode2 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM2 = x340Var14.m();
                qim0 qim0VarE2 = zr7.E(x340Var13, qim0VarB);
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
                nko1.H(mbhVarA, x340Var13, y580.O0);
                nko1.H(xos0VarM2, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE2, x340Var13, y580.Y);
                uwo1.e(cwl1.o0(x340Var13, 2131963431), (qim0) null, cbx.d(x340Var13).e, cbx.a(x340Var13).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var13, 0, 0, 2018);
                String strO2 = cwl1.o0(x340Var13, 2131963430);
                lee1 lee1Var2 = cbx.d(x340Var13).j;
                long j2 = cbx.a(x340Var13).b.b;
                cvx cvxVar6 = cbx.b(x340Var13).b;
                uwo1.e(strO2, uyn1.B(nim0Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var2, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var13, 0, 0, 2016);
                x340Var15.r(true);
                return rih1Var;
            case 10:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                era eraVar2 = een.P0;
                jw31 jw31VarA2 = ew31.a(new d36(0.0f, true, new g21(eraVar2, (byte) 29)), een.N0, x340Var16, 0);
                x340 x340Var17 = x340Var16;
                int iHashCode3 = Long.hashCode(x340Var17.T);
                xos0 xos0VarM3 = x340Var17.m();
                qim0 qim0VarE3 = zr7.E(x340Var16, qim0VarD);
                hzj.A.getClass();
                x340 x340Var18 = x340Var16;
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA2, x340Var16, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var16, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var16, lljVar3);
                nko1.F(x340Var16);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var16, lljVar4);
                Uri uri = Uri.parse("https://i.scdn.co/image/ab6732da00001007023b573e621de5bed99592f6");
                qim0 qim0VarR = u291.r(nim0Var, 70.0f);
                isl islVar = isl.a;
                eso1.e(uri, islVar, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var16, 48, 0, 4088);
                qim0 qim0VarB2 = uyn1.B(new wnb0(1.0f, true), 16.0f, 0.0f, 12.0f, 0.0f, 10);
                mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar2, x340Var16, 0);
                int iHashCode4 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM4 = x340Var18.m();
                qim0 qim0VarE4 = zr7.E(x340Var16, qim0VarB2);
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                nko1.H(mbhVarA2, x340Var16, lljVar);
                nko1.H(xos0VarM4, x340Var16, lljVar2);
                i3a.l(iHashCode4, x340Var16, lljVar3, x340Var16);
                nko1.H(qim0VarE4, x340Var16, lljVar4);
                String strO3 = cwl1.o0(x340Var16, 2131952721);
                uwr uwrVar5 = cbx.a;
                uwo1.e(strO3, (qim0) null, cbx.d(x340Var16).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2042);
                uwo1.e(cwl1.o0(x340Var16, 2131952720), (qim0) null, cbx.d(x340Var16).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2042);
                x340Var18.r(true);
                w0h1.a(plx.c, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var16).c.a, 0L, false, x340Var16, plx.d | 48, 48);
                x340Var18.r(true);
                return rih1Var;
            case 11:
                ((Boolean) obj).getClass();
                x340 x340Var19 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    nyx.a(0, (wux) null, jpj.a, x340Var20, 3072, 7);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 12:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                dmx dmxVar = dmx.c;
                uwr uwrVar6 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                w0h1.a(dmxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar2, dmx.d | 48, 56);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                return rih1Var;
            case 14:
                x340 x340Var21 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA3 = ew31.a(gex0Var, een.N0, x340Var21, 0);
                x340 x340Var22 = x340Var21;
                int iHashCode5 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM5 = x340Var22.m();
                qim0 qim0VarE5 = zr7.E(x340Var21, nim0Var);
                hzj.A.getClass();
                x340 x340Var23 = x340Var21;
                if (x340Var23.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                nko1.H(jw31VarA3, x340Var21, y580.O0);
                nko1.H(xos0VarM5, x340Var21, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var21, y580.R0);
                nko1.F(x340Var21);
                nko1.H(qim0VarE5, x340Var21, y580.Y);
                uwr uwrVar7 = cbx.a;
                zov0 zov0Var3 = cbx.b(x340Var21).g;
                w0h1.a(wtx.c, isl.a, u291.r(nim0Var, 16.0f), ((wex) ((gmt) zex.a.c).c).b, 0L, true, x340Var21, wtx.d | 196656, 16);
                cvx cvxVar7 = cbx.b(x340Var21).b;
                op71.g(x340Var21, u291.v(nim0Var, 4.0f));
                uwo1.e(cwl1.o0(x340Var21, 2131963730), (qim0) null, cbx.d(x340Var21).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var21, 0, 0, 2042);
                x340Var23.r(true);
                return rih1Var;
            case 15:
                x340 x340Var24 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA4 = ew31.a(gex0Var, een.N0, x340Var24, 0);
                x340 x340Var25 = x340Var24;
                int iHashCode6 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM6 = x340Var25.m();
                qim0 qim0VarE6 = zr7.E(x340Var24, nim0Var);
                hzj.A.getClass();
                x340 x340Var26 = x340Var24;
                if (x340Var26.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var26.m0();
                if (x340Var26.S) {
                    x340Var26.l(n4kVar);
                } else {
                    x340Var26.v0();
                }
                nko1.H(jw31VarA4, x340Var24, y580.O0);
                nko1.H(xos0VarM6, x340Var24, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var24, y580.R0);
                nko1.F(x340Var24);
                nko1.H(qim0VarE6, x340Var24, y580.Y);
                uwr uwrVar8 = cbx.a;
                zov0 zov0Var4 = cbx.b(x340Var24).g;
                w0h1.a(wtx.c, isl.a, u291.r(nim0Var, 16.0f), ((wex) ((gmt) zex.a.c).c).b, 0L, true, x340Var24, wtx.d | 196656, 16);
                cvx cvxVar8 = cbx.b(x340Var24).b;
                op71.g(x340Var24, u291.v(nim0Var, 4.0f));
                uwo1.e(cwl1.o0(x340Var24, 2131963730), (qim0) null, cbx.d(x340Var24).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2042);
                x340Var26.r(true);
                return rih1Var;
            case 16:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO4 = cwl1.o0(b0kVar3, 2131963781);
                uwr uwrVar9 = cbx.a;
                uwo1.e(strO4, anm1.N("video_quality_selection_entry_point_row_title", nim0Var), cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2032);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar = plx.c;
                uwr uwrVar10 = cbx.a;
                zov0 zov0Var5 = cbx.b(b0kVar4).g;
                w0h1.a(plxVar, isl.a, anm1.N("video_quality_selection_entry_point_row_right_icon", u291.r(nim0Var, 16.0f)), 0L, 0L, false, b0kVar4, plx.d | 48, 56);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                xtx xtxVar = xtx.c;
                uwr uwrVar11 = cbx.a;
                zov0 zov0Var6 = cbx.b(b0kVar5).g;
                w0h1.a(xtxVar, isl.a, anm1.N("video_quality_selection_entry_point_row_left_icon", u291.r(nim0Var, 24.0f)), 0L, 0L, false, b0kVar5, xtx.d | 48, 56);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                h5p1.k(u291.f(nim0Var, 0.4f), (b0k) obj2, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                h5p1.k(u291.f(nim0Var, 0.66f), (b0k) obj2, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                qim0 qim0VarL0 = cwl1.l0(nim0Var, 0L, (hw61) null, 15);
                Uri uri2 = Uri.EMPTY;
                cbx.a.getClass();
                ecx ecxVarD = uwr.d();
                xtx xtxVar2 = xtx.c;
                eso1.e(uri2, isl.a, qim0VarL0, (p3v) null, (zvx) null, ecxVarD, (j6m) null, (tl3) null, (ColorFilter) null, new nux(xtxVar2, xtxVar2), false, false, (b0k) obj2, 1073744944, 0, 3536);
                return rih1Var;
            case 22:
                x340 x340Var27 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar12 = cbx.a;
                cvx cvxVar9 = cbx.b(x340Var27).b;
                nim0 nim0Var3 = nim0.a;
                qim0 qim0VarZ3 = uyn1.z(16.0f, 0.0f, 2, nim0Var3);
                jw31 jw31VarA5 = ew31.a(gex0Var, een.N0, x340Var27, 0);
                x340 x340Var28 = x340Var27;
                int iHashCode7 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM7 = x340Var28.m();
                qim0 qim0VarE7 = zr7.E(x340Var27, qim0VarZ3);
                hzj.A.getClass();
                x340 x340Var29 = x340Var27;
                if (x340Var29.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var29.m0();
                if (x340Var29.S) {
                    x340Var29.l(n4kVar);
                } else {
                    x340Var29.v0();
                }
                nko1.H(jw31VarA5, x340Var27, y580.O0);
                nko1.H(xos0VarM7, x340Var27, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var27, y580.R0);
                nko1.F(x340Var27);
                nko1.H(qim0VarE7, x340Var27, y580.Y);
                eox eoxVar = eox.c;
                long j3 = cbx.a(x340Var27).b.a;
                cvx cvxVar10 = cbx.b(x340Var27).b;
                w0h1.a(eoxVar, isl.a, u291.r(uyn1.B(nim0Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f), j3, 0L, false, x340Var27, eox.d | 48, 48);
                uwo1.e(cwl1.o0(x340Var27, 2131963799), (qim0) null, cbx.d(x340Var27).j, cbx.a(x340Var27).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var27, 0, 0, 2034);
                x340Var29.r(true);
                return rih1Var;
            case 23:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO5 = cwl1.o0(b0kVar6, 2131963795);
                uwr uwrVar13 = cbx.a;
                lee1 lee1Var3 = cbx.d(b0kVar6).j;
                long j4 = cbx.a(b0kVar6).b.b;
                cvx cvxVar11 = cbx.b(b0kVar6).b;
                cvx cvxVar12 = cbx.b(b0kVar6).b;
                uwo1.e(strO5, uyn1.y(nim0Var, 16.0f, 12.0f), lee1Var3, j4, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar6, 0, 0, 2032);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                w0h1.a(etx.c, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, etx.d | 48, 60);
                return rih1Var;
            case 25:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar7, 2131963808), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar7, 0, 0, 2046);
                return rih1Var;
            case 26:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar2 = plx.c;
                uwr uwrVar14 = cbx.a;
                zov0 zov0Var7 = cbx.b(b0kVar8).g;
                w0h1.a(plxVar2, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, b0kVar8, plx.d | 48, 56);
                return rih1Var;
            case 27:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                ilx ilxVar = ilx.c;
                uwr uwrVar15 = cbx.a;
                w0h1.a(ilxVar, isl.a, (qim0) null, cbx.a(b0kVar9).b.f, 0L, false, b0kVar9, ilx.d | 48, 52);
                return rih1Var;
            case 28:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar16 = cbx.a;
                cvx cvxVar13 = cbx.b(b0kVar10).b;
                op71.g(b0kVar10, u291.h(nim0Var, 16.0f));
                return rih1Var;
            default:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                eox eoxVar2 = eox.c;
                uwr uwrVar17 = cbx.a;
                w0h1.a(eoxVar2, isl.a, (qim0) null, cbx.a(b0kVar11).b.b, 0L, false, b0kVar11, eox.d | 48, 52);
                return rih1Var;
        }
    }
}
