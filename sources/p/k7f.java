package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k7f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7f(vu30 vu30Var, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 16:
                this.b = vu30Var;
                super(2);
                break;
            default:
                this.b = vu30Var;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 6;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                    us71.j(0, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
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
                    nko1.H(gfh0VarC2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    us71.j(0, vu30Var, x340Var4, true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC3, x340Var6, y580.O0);
                    nko1.H(xos0VarM3, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE3, x340Var6, y580.Y);
                    us71.j(0, vu30Var, x340Var6, true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    vu30Var.invoke(x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mod.b(jw80.c.a(new p3v(Float.NaN)), apo.r(1641219050, new k7f((byte) 3, vu30Var, z), x340Var10), x340Var10, 56);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    vu30Var.invoke(x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qsw.a(apo.r(-314162452, new k7f((byte) 5, vu30Var, z), x340Var14), x340Var14);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k2r0.c(6, apo.r(-1469937365, new k7f(b2, vu30Var, z), x340Var16), x340Var16);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    vu30Var.invoke(x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    vu30Var.invoke(x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                op80 op80Var = q6x.b;
                op80 op80Var2 = (op80) vu30Var.invoke(obj, j6p1.k((op80) obj2, op80Var));
                if (op80Var2 == null) {
                    op80Var2 = op80Var;
                }
                return j6p1.k(op80Var, op80Var2);
            case 11:
                j3r j3rVarA = ((ms31) obj2).a(0);
                vlu vluVar = new vlu(vu30Var, (String) obj, (byte) 0);
                if (j3rVarA instanceof j3r) {
                    return new j3r(vluVar.invoke(j3rVarA.a));
                }
                if (j3rVarA instanceof i3r) {
                    return i3r.a;
                }
                if (j3rVarA instanceof h3r) {
                    return j3rVarA;
                }
                eg.o();
                return null;
            case 12:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    vu30Var.invoke(x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 13:
                return new cdk1(vu30Var.invoke((zob1) obj, (iac0) obj2));
            case 14:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    vu30Var.invoke(x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (!x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x340Var26.b0();
                } else if (vu30Var == null) {
                    x340Var26.i0(2140387620);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(2140387621);
                    gfh0 gfh0VarC4 = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM4 = x340Var26.m();
                    qim0 qim0VarE4 = zr7.E(x340Var26, nim0Var);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC4, x340Var26, y580.O0);
                    nko1.H(xos0VarM4, x340Var26, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var26, y580.R0);
                    nko1.F(x340Var26);
                    nko1.H(qim0VarE4, x340Var26, y580.Y);
                    us71.k(0, vu30Var, x340Var26, true, false);
                }
                return rih1Var;
            case 16:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (!x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x340Var28.b0();
                } else if (vu30Var == null) {
                    x340Var28.i0(1128522406);
                    x340Var28.r(false);
                } else {
                    x340Var28.i0(1128522407);
                    gfh0 gfh0VarC5 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(x340Var28.T);
                    xos0 xos0VarM5 = x340Var28.m();
                    qim0 qim0VarE5 = zr7.E(x340Var28, nim0Var);
                    hzj.A.getClass();
                    if (x340Var28.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var28.m0();
                    if (x340Var28.S) {
                        x340Var28.l(n4kVar);
                    } else {
                        x340Var28.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var28, y580.O0);
                    nko1.H(xos0VarM5, x340Var28, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var28, y580.R0);
                    nko1.F(x340Var28);
                    nko1.H(qim0VarE5, x340Var28, y580.Y);
                    us71.k(0, vu30Var, x340Var28, true, false);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return vu30Var.invoke(Integer.valueOf(((Number) obj).intValue()), (yq60) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    gra graVar = een.h;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    gfh0 gfh0VarC6 = t1c.c(graVar, false);
                    int iHashCode6 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM6 = x340Var30.m();
                    qim0 qim0VarE6 = zr7.E(x340Var30, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var30.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var30.m0();
                    if (x340Var30.S) {
                        x340Var30.l(n4kVar);
                    } else {
                        x340Var30.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var30, y580.O0);
                    nko1.H(xos0VarM6, x340Var30, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode6), x340Var30, y580.R0);
                    nko1.F(x340Var30);
                    nko1.H(qim0VarE6, x340Var30, y580.Y);
                    if (vu30Var == null) {
                        x340Var30.i0(456070894);
                    } else {
                        c13.o(x340Var30, -1370761357, 0, vu30Var, x340Var30);
                    }
                    x340Var30.r(false);
                    x340Var30.r(true);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    vu30Var.invoke(x340Var32, 0);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                nb51.l(vu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    vu30Var.invoke(x340Var34, 0);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    Object objT = x340Var36.T();
                    if (objT == fkj0.X) {
                        objT = wlg0.e1;
                        x340Var36.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                    gfh0 gfh0VarC7 = t1c.c(een.d, false);
                    int iHashCode7 = Long.hashCode(x340Var36.T);
                    xos0 xos0VarM7 = x340Var36.m();
                    qim0 qim0VarE7 = zr7.E(x340Var36, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var36.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var36.m0();
                    if (x340Var36.S) {
                        x340Var36.l(n4kVar);
                    } else {
                        x340Var36.v0();
                    }
                    nko1.H(gfh0VarC7, x340Var36, y580.O0);
                    nko1.H(xos0VarM7, x340Var36, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode7), x340Var36, y580.R0);
                    nko1.F(x340Var36);
                    nko1.H(qim0VarE7, x340Var36, y580.Y);
                    us71.j(0, vu30Var, x340Var36, true);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    s1p1.j(6, x340Var38, vu30Var, nim0Var);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    vu30Var.invoke(x340Var40, 0);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    vu30Var.invoke(x340Var42, 0);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    if (vu30Var == null) {
                        x340Var44.i0(-1300287199);
                    } else {
                        c13.o(x340Var44, 373697248, 0, vu30Var, x340Var44);
                    }
                    x340Var44.r(false);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case 27:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                vu30Var.invoke((p2c0) obj, bool);
                return rih1Var;
            case 28:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    vu30Var.invoke(x340Var46, 0);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            default:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    vu30Var.invoke(x340Var48, 0);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7f(int i, vu30 vu30Var) {
        super(2);
        this.a = (byte) 20;
        this.b = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7f(byte b, vu30 vu30Var, boolean z) {
        super(2);
        this.a = b;
        this.b = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7f(l7m0 l7m0Var, vu30 vu30Var) {
        super(2);
        this.a = (byte) 10;
        this.b = vu30Var;
    }
}
