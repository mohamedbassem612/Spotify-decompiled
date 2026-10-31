package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qeu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qeu(String str, int i) {
        super(2);
        this.a = (byte) 14;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:250:0x082b  */
    public final Object invoke(Object obj, Object obj2) {
        smc0 smc0VarK;
        byte b = this.a;
        et40 et40Var = et40.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    yoi1.d(new p05(2131232827), this.b, dm5.e0(et40Var, 12.0f), 0, new u8h(new oxe1(new hn20(abh.a))), x340Var2, 32768, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j2h1.b(ila0.m(dm5.e0(et40Var, 24.0f), new p05(2131230999)), ql3.g, apo.r(1570663418, new qeu(str, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 384, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.i0(-1025454916);
                    String strO0 = str != null ? str : "";
                    if (ihc1.y0(strO0)) {
                        strO0 = cwl1.o0(x340Var6, 2131954910);
                    }
                    x340Var6.r(false);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    uwo1.e(strO0, uyn1.z(0.0f, 4.0f, 1, nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2044);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                String str2 = (String) obj;
                qxc0 qxc0Var = (qxc0) obj2;
                String str3 = qxc0Var.a;
                String str4 = qxc0Var.d;
                pxc0 pxc0Var = qxc0Var.c;
                if (pxc0Var != null) {
                    smc0 smc0VarN = k4p1.n();
                    String str5 = pxc0Var.a;
                    if (str5 != null && str5.length() != 0) {
                        String str6 = pxc0Var.b;
                        smc0VarN.add(new ho70(str6 != null ? str6 : "", str5));
                    }
                    smc0VarK = k4p1.k(smc0VarN);
                    if (smc0VarK == null) {
                        smc0VarK = z6x.a;
                    }
                } else {
                    smc0VarK = z6x.a;
                }
                jo70 jo70Var = new jo70(str3, "Playlist", str4, smc0VarK, (io70) null, 16);
                return (str2.equals("spotify:playlist:37i9dQZEVXhds8kU6ckEgw") && jo70Var.a.length() == 0) ? jo70.a(str, jo70Var) : jo70Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var8, 54);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, nim0Var);
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
                    nko1.H(mbhVarA, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    smx smxVar = smx.c;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var8).g;
                    w0h1.a(smxVar, isl.a, u291.r(nim0Var, 24.0f), x9a0.d.a, 0L, false, x340Var8, smx.d | 48, 48);
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    uwo1.e(this.b, (qim0) null, kk0.p(nim0Var, 4.0f, x340Var8, x340Var8).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var8, 1572864, 0, 1722);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj).intValue();
                return f4i1.e(str, ((ycv) obj2).a());
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var10).g, cbx.a(x340Var10).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2034);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var12, (qim0) null);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    b3o1.f(cbx.d(x340Var14).k, apo.r(1407034072, new qeu(str, (byte) 7), x340Var14), x340Var14, 48);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(this.b, qim0VarF, cbx.d(x340Var16).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2024);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    olx olxVar = olx.c;
                    jsl jslVar = new jsl(str);
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var18).g;
                    w0h1.a(olxVar, jslVar, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var18, olx.d, 56);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var20).k, cbx.a(x340Var20).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2034);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var22).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2042);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var24, 0, 0, 1726);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                rrn1.f(str, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2046);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var28, 0, 0, 2046);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var30, (qim0) null);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var32, 0, 0, 2046);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var34, 0, 0, 2046);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    uwo1.e(this.b, uyn1.z(2.0f, 0.0f, 2, nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var36, 0, 0, 2044);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var38).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var38, 0, 0, 2042);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var40).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var40, 0, 0, 2042);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    String str7 = str == null ? "" : str;
                    uwr uwrVar11 = cbx.a;
                    uwo1.e(str7, (qim0) null, cbx.d(x340Var42).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var42, 0, 0, 2042);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    String str8 = str == null ? "" : str;
                    uwr uwrVar12 = cbx.a;
                    uwo1.e(str8, (qim0) null, cbx.d(x340Var44).h, cbx.a(x340Var44).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var44, 0, 0, 2034);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var46.T);
                    xos0 xos0VarM2 = x340Var46.m();
                    qim0 qim0VarE2 = zr7.E(x340Var46, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var46.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var46.m0();
                    if (x340Var46.S) {
                        x340Var46.l(n4kVar);
                    } else {
                        x340Var46.v0();
                    }
                    nko1.H(gfh0VarC, x340Var46, y580.O0);
                    nko1.H(xos0VarM2, x340Var46, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var46, y580.R0);
                    nko1.F(x340Var46);
                    nko1.H(qim0VarE2, x340Var46, y580.Y);
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var46, 0, 0, 2046);
                    x340Var46.r(true);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode3 = Long.hashCode(x340Var48.T);
                    xos0 xos0VarM3 = x340Var48.m();
                    qim0 qim0VarE3 = zr7.E(x340Var48, qim0VarF3);
                    hzj.A.getClass();
                    if (x340Var48.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var48.m0();
                    if (x340Var48.S) {
                        x340Var48.l(n4kVar);
                    } else {
                        x340Var48.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var48, y580.O0);
                    nko1.H(xos0VarM3, x340Var48, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var48, y580.R0);
                    nko1.F(x340Var48);
                    nko1.H(qim0VarE3, x340Var48, y580.Y);
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var48, 0, 0, 2046);
                    x340Var48.r(true);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var49 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (x340Var50.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var50, 0, 0, 2046);
                } else {
                    x340Var50.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var51 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (x340Var52.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var52, 0, 0, 2046);
                } else {
                    x340Var52.b0();
                }
                return rih1Var;
            default:
                x340 x340Var53 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var54, 0, 0, 2046);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qeu(String str, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }
}
