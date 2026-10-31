package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vx90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx90(qim0 qim0Var, LocalDate localDate) {
        super(2);
        this.a = (byte) 27;
        this.c = qim0Var;
        this.b = localDate;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                hqq0.s((ix90) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    py90 py90Var = (py90) obj3;
                    otw.c((umf0) ((ldo) obj4).d, new s0a0(py90Var.a, py90Var.b.a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                lmt0.l((ew90) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ot11.b((a6a0) obj4, (yqg) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((wj3) obj4).d((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    bzn1.e((qim0) null, (vu30) null, false, apo.r(490690136, new gs90((n2c0) obj3, (byte) 13), x340Var4), new qgr0(((vex) zex.a.e).c), (ngr0) null, ezn1.n((es41) obj4, new tr80(0, 1, 1), x340Var4, 24576), (Function0) null, x340Var4, 2100224, 167);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j2i j2iVar = pui.a;
                    j2i j2iVarR = apo.r(432078987, new d720((iu30) obj3, (byte) 19), x340Var6);
                    long j = u7h.j;
                    uwr uwrVar2 = cbx.a;
                    ti5.d(j2iVar, (qim0) null, j2iVarR, (xu30) null, 0.0f, (erl1) null, kkn.C(j, ((vex) zex.a.e).c, cbx.a(x340Var6).b.a, cbx.a(x340Var6).b.a, cbx.a(x340Var6).b.a, x340Var6, 32), (k2t0) obj4, x340Var6, 390, 58);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    eio1.c((h7e) obj4, (iu30) obj3, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    d1o1.e((k9e) obj4, (v4b0) ((idd1) ((nm1) obj3).h).getValue(), (qim0) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                cab0 cab0Var = (cab0) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    bab0 bab0Var = (bab0) obj4;
                    dab0 dab0Var = new dab0(bab0Var.a, bab0Var.b, bab0Var.c);
                    boolean zI = x340Var12.i(cab0Var);
                    Object objT = x340Var12.T();
                    if (zI || objT == fkj0.X) {
                        objT = new hu90(cab0Var, (byte) 28);
                        x340Var12.s0(objT);
                    }
                    o4o1.c(dab0Var, (qim0) null, (iu30) objT, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                f6o1.d((nbb0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((edb0) obj4).E(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 12:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    bjb0 bjb0Var = (bjb0) obj4;
                    rib0 rib0Var = (rib0) obj3;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var14, 0);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, nim0Var);
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
                    nko1.H(jw31VarA, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    jd6 jd6Var = bjb0Var.e;
                    String str = rib0Var.a;
                    lhg1 lhg1Var = rib0Var.g;
                    String str2 = (String) rib0Var.d.get("item.speed");
                    Double dA0 = str2 != null ? nhc1.a0(str2) : null;
                    otw.c(jd6Var, new r7k0(str, lhg1Var, dA0 != null ? Float.valueOf((float) dA0.doubleValue()) : null, 116), (qim0) null, (ipb1) null, x340Var14, 64, 12);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                too1.g((dwb0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((vnd) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                mqo1.i((tpw0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((nac0) obj4).a((h0r0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                ((oac0) obj4).a((h0r0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                ucc0 ucc0Var = (ucc0) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    hux huxVar = ucc0Var.f;
                    String strO0 = cwl1.o0(x340Var16, ucc0Var.a);
                    String str3 = ucc0Var.b;
                    String str4 = ucc0Var.c;
                    int i = ucc0Var.d;
                    phm0 phm0Var = new phm0(strO0, str3, str4, cwl1.o0(x340Var16, 2131957325), i != 0, huxVar, i == 0 ? 1 : i);
                    qim0 qim0VarN = anm1.N("liked_songs_ui", nim0Var);
                    boolean zG = x340Var16.g(iu30Var);
                    Object objT2 = x340Var16.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new sya0(iu30Var, (byte) 16);
                        x340Var16.s0(objT2);
                    }
                    xto1.l(phm0Var, qim0VarN, (Function0) objT2, x340Var16, 8);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Boolean boolValueOf = Boolean.valueOf(!((lec0) obj4).b.equals(iec0.a));
                    Object objT3 = x340Var18.T();
                    if (objT3 == fkj0.X) {
                        objT3 = xdc0.f;
                        x340Var18.s0(objT3);
                    }
                    hm5.a(boolValueOf, (qim0) null, (iu30) objT3, (tl3) null, "Clear button transition", (iu30) null, apo.r(688792457, new t7i((iu30) obj3, (byte) 6), x340Var18), x340Var18, 1597824, 42);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                myo1.j((o32) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r6d0 r6d0Var = (r6d0) obj4;
                    boolean zG2 = x340Var20.g(iu30Var2);
                    Object objT4 = x340Var20.T();
                    if (zG2 || objT4 == fkj0.X) {
                        objT4 = new sya0(iu30Var2, (byte) 22);
                        x340Var20.s0(objT4);
                    }
                    azo1.f(r6d0Var, (Function0) objT4, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                azo1.f((r6d0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    sn7 sn7Var = (sn7) obj3;
                    otw.c(((p9d0) obj4).b, new bo7(sn7Var.a, sn7Var.c, sn7Var.b), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                ((res) obj4).l((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((sdd0) obj4).a((tdd0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                i0p1.j((wzz0) obj4, (h001) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qim0 qim0VarB = u291.B((qim0) obj3, (gra) null, 3);
                    uwr uwrVar3 = cbx.a;
                    long j2 = cbx.a(x340Var24).a.c;
                    cua cuaVar = cbx.b(x340Var24).f;
                    qim0 qim0VarF = dug.f(qim0VarB, j2, er31.b(4.0f));
                    cvx cvxVar = cbx.b(x340Var24).b;
                    cvx cvxVar2 = cbx.b(x340Var24).b;
                    qim0 qim0VarY = uyn1.y(qim0VarF, 8.0f, 4.0f);
                    LocalDate localDate = (LocalDate) obj4;
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var24, 0);
                    int iHashCode2 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM2 = x340Var24.m();
                    qim0 qim0VarE2 = zr7.E(x340Var24, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var24.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(mbhVarA, x340Var24, y580.O0);
                    nko1.H(xos0VarM2, x340Var24, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var24, y580.R0);
                    nko1.F(x340Var24);
                    nko1.H(qim0VarE2, x340Var24, y580.Y);
                    uwo1.e(localDate.format(DateTimeFormatter.ofPattern("MMM")).toUpperCase(Locale.ROOT), (qim0) null, cbx.d(x340Var24).j, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2034);
                    uwo1.e(localDate.format(DateTimeFormatter.ofPattern("d")), (qim0) null, cbx.d(x340Var24).h, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2034);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                x1p1.a((jmd0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                j2p1.i((zob1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx90(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx90(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
