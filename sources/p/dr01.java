package p;

import android.content.Context;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dr01 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr01(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        sh21 sh21Var = this.b;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ph21 ph21Var = ((qh21) obj2).c;
        Object obj6 = null;
        if (ph21Var instanceof nh21) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-475751824);
            nh21 nh21Var = (nh21) ph21Var;
            for (Object obj7 : nh21Var.a.k()) {
                if (u890.j(((w4i1) obj7).a, nh21Var.c)) {
                    obj6 = obj7;
                    break;
                }
            }
            w4i1 w4i1Var = (w4i1) obj6;
            if (w4i1Var == null) {
                w4i1Var = w4i1.f;
            }
            goe goeVar = nh21Var.a;
            t7q0 t7q0Var = nh21Var.d;
            Parcelable.Creator creator = w4i1.CREATOR;
            sh21Var.e(goeVar, w4i1Var, t7q0Var, iu30Var, x340Var2, (iIntValue << 3) & 7168);
            x340Var2.r(false);
        } else if (ph21Var instanceof oh21) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-985166478);
            sh21Var.f((qim0) null, x340Var3, 0);
            x340Var3.r(false);
        } else {
            if (ph21Var != null) {
                throw p3d1.k(x340Var, -985180250, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(-475356543);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ur21 ur21Var = (ur21) obj2;
        ((Number) obj5).intValue();
        String str = ur21Var.a;
        String str2 = ur21Var.b;
        String str3 = ur21Var.c;
        String str4 = ur21Var.d;
        String str5 = ur21Var.e;
        String str6 = ur21Var.f;
        String str7 = ur21Var.g;
        uck uckVar = new uck(ur21Var.h, 1);
        long jE = z4p1.e(ur21Var.i);
        long jE2 = z4p1.e(ur21Var.j);
        hdk hdkVar = new hdk(str, str2, str3, str4, str5, str6, str7, 2, uckVar, xck.d, new u7h(jE), new u7h(jE2), u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14), (d7d) null, false, false, 3, fnw.a, true, true, false, 1, z6x.a, "reserved.sale", false, (String) null, (String) null, (String) null, true, 1, "", "", 1);
        gw70 gw70Var = this.b.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = pl21.a1;
            x340Var.s0(objT);
        }
        rck.c(hdkVar, gw70Var, (iu30) objT, (qim0) null, true, x340Var, 24960, 8);
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        rih1 rih1Var;
        rix rixVar;
        char c;
        String string;
        Object obj6;
        Object obj7;
        String string2;
        xu30 xu30Var;
        boolean z;
        g931 g931Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 2;
        Throwable th = null;
        byte b3 = 1;
        jf31 jf31Var = this.b;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                ney0 ney0Var = (ney0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                int i = (iIntValue & 48) == 0 ? iIntValue | (x340Var.g(ney0Var) ? 32 : 16) : iIntValue;
                if ((iIntValue & 384) == 0) {
                    i |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
                    rwj rwjVar = (rwj) jf31Var;
                    ((hyy0) rwjVar.e).e(ney0Var, (idd1) rwjVar.g, (agc0) rwjVar.d, (ycm) rwjVar.f, iu30Var, x340Var2, ((i >> 3) & 14) | ((i << 6) & 57344));
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                dt01 dt01Var = (dt01) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                kls0 kls0Var = (kls0) jf31Var;
                int i2 = (iIntValue2 & 48) == 0 ? (x340Var3.g(dt01Var) ? 32 : 16) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    Context context = ((bw8) kls0Var.c).a;
                    c380 c380Var = dt01Var.c;
                    int i3 = 10;
                    ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                    Iterator it = c380Var.iterator();
                    nix nixVar = null;
                    Object obj8 = null;
                    while (it.hasNext()) {
                        ws01 ws01Var = (ws01) it.next();
                        List list = ws01Var.b;
                        m9m m9mVar = ws01Var.a;
                        List list2 = list;
                        int iS = zno1.s(q7h.U(list2, i3));
                        rih1 rih1Var3 = rih1Var2;
                        if (iS < 16) {
                            iS = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            br01 br01Var = (br01) next;
                            Iterator it3 = it;
                            Iterator it4 = it2;
                            String str = br01Var.a;
                            int iOrdinal = br01Var.ordinal();
                            if (iOrdinal != 0) {
                                string2 = "";
                                obj7 = obj8;
                                if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        string2 = context.getString(2131960957);
                                    } else if (iOrdinal != 3 && iOrdinal != 4) {
                                        eg.o();
                                        return null;
                                    }
                                }
                            } else {
                                obj7 = obj8;
                                string2 = context.getString(2131960958);
                            }
                            linkedHashMap.put(next, new oix(str, string2, 12, (String) null));
                            it = it3;
                            it2 = it4;
                            obj8 = obj7;
                            iu30Var2 = iu30Var2;
                        }
                        iu30 iu30Var3 = iu30Var2;
                        Iterator it5 = it;
                        Object obj9 = obj8;
                        String str2 = m9mVar.a;
                        int iOrdinal2 = m9mVar.ordinal();
                        if (iOrdinal2 != 0) {
                            c = 2;
                            if (iOrdinal2 == 1) {
                                string = context.getString(2131960956);
                            } else {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return null;
                                }
                                string = context.getString(2131960954);
                            }
                        } else {
                            c = 2;
                            string = context.getString(2131960955);
                        }
                        String str3 = string;
                        List list3 = ws01Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it6 = list3.iterator();
                        while (it6.hasNext()) {
                            oix oixVar = (oix) linkedHashMap.get((br01) it6.next());
                            if (oixVar != null) {
                                arrayList2.add(oixVar);
                            }
                        }
                        nix nixVar2 = new nix(str2, str3, mqo1.F(arrayList2), (String) null, 8);
                        if (m9mVar == dt01Var.a) {
                            obj6 = linkedHashMap.get(dt01Var.b);
                            nixVar = nixVar2;
                        } else {
                            obj6 = obj9;
                        }
                        arrayList.add(nixVar2);
                        it = it5;
                        obj8 = obj6;
                        iu30Var2 = iu30Var3;
                        rih1Var2 = rih1Var3;
                        i3 = 10;
                    }
                    iu30 iu30Var4 = iu30Var2;
                    rih1Var = rih1Var2;
                    Object obj10 = obj8;
                    c9 c9VarF = mqo1.F(arrayList);
                    if (nixVar != null) {
                        oix oixVar2 = (oix) obj10;
                        rixVar = oixVar2 != null ? new rix(nixVar, mqo1.s(new oix[]{oixVar2})) : new rix(nixVar);
                    } else {
                        rixVar = qix.a;
                    }
                    tix tixVar = new tix(c9VarF, rixVar, false, 60);
                    boolean zI = x340Var4.i(kls0Var) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new j3y0(kls0Var, dt01Var, iu30Var4);
                        x340Var4.s0(objT);
                    }
                    pro1.f(tixVar, (iu30) objT, (qim0) null, (vzq0) null, x340Var4, 0, 28);
                } else {
                    rih1Var = rih1Var2;
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                zv01 zv01Var = (zv01) obj2;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                eth.a(Boolean.valueOf(zv01Var instanceof vv01), (qim0) null, (ni20) null, "recents_card", apo.r(395347649, new hho0((Object) zv01Var, jf31Var, obj3, (byte) 19), b0kVar), b0kVar, 27648, 6);
                return rih1Var2;
            case 3:
                gu01 gu01Var = (gu01) obj2;
                int iIntValue3 = ((Number) obj5).intValue();
                x340 x340Var5 = (b0k) obj4;
                uvb0 uvb0Var = (crl1) x340Var5.k(t4k.u);
                Boolean boolValueOf = Boolean.valueOf(uvb0Var.b());
                boolean zI2 = x340Var5.i(uvb0Var);
                Object objT2 = x340Var5.T();
                if (zI2 || objT2 == fkj0.X) {
                    objT2 = new kdt0(uvb0Var, (lnm) null, (byte) 12);
                    x340Var5.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var5, (vu30) objT2);
                eth.a(gu01Var, (qim0) null, (ni20) null, "recents_carousel", apo.r(-1006048672, new f2z0((cm0) jf31Var, (byte) 22), x340Var5), x340Var5, ((iIntValue3 >> 3) & 14) | 27648, 6);
                return rih1Var2;
            case 4:
                kob1 kob1Var = (kob1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                int i4 = (iIntValue4 & 48) == 0 ? iIntValue4 | (x340Var6.g(kob1Var) ? 32 : 16) : iIntValue4;
                if ((iIntValue4 & 384) == 0) {
                    i4 |= x340Var6.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    et90 et90Var = (et90) jf31Var;
                    ((y1t0) et90Var.c).j(kob1Var, (idd1) et90Var.e, (ycm) et90Var.d, iu30Var5, x340Var7, ((i4 >> 3) & 14) | ((i4 << 3) & 7168));
                } else {
                    x340Var7.b0();
                }
                return rih1Var2;
            case 5:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) ((qlb) jf31Var).c), apo.r(-1447330556, new kpw0((xx01) obj2, (iu30) obj3, (byte) 27), b0kVar2), b0kVar2, 56);
                return rih1Var2;
            case 6:
                gy01 gy01Var = (gy01) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                ky01 ky01Var = (ky01) jf31Var;
                boolean z2 = gy01Var.m;
                qim0 qim0VarH = pqo.h(nim0Var, gy01Var.h || !gy01Var.i || z2);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var8).b;
                cvx cvxVar2 = cbx.b(x340Var8).b;
                uvx uvxVar = new uvx(1, (pgx) null, 3, (vzq0) null, uyn1.j(4.0f, 0.0f, 4.0f, 0.0f, 10), (tvx) null, (hw61) null, 0, (p3v) null, 490);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                int i5 = (iIntValue5 & 896) ^ 384;
                boolean z3 = (i5 > 256 && x340Var8.g(iu30Var6)) || (iIntValue5 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT3 = x340Var9.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new fr01(iu30Var6, (byte) 16);
                    x340Var9.s0(objT3);
                }
                z50 z50Var = z50.c;
                gbx gbxVar = new gbx(z50Var, (Function0) objT3);
                boolean z4 = (i5 > 256 && x340Var9.g(iu30Var6)) || (iIntValue5 & 384) == 256;
                Object objT4 = x340Var9.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new fr01(iu30Var6, (byte) 17);
                    x340Var9.s0(objT4);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT4);
                if (z2) {
                    x340Var9.i0(740215330);
                    x340Var9.r(false);
                    xu30Var = null;
                } else {
                    x340Var9.i0(740252530);
                    xu30 xu30VarR = apo.r(-1151543577, new hho0((Object) ky01Var, (Object) gy01Var, (Object) iu30Var6, (byte) 21), x340Var9);
                    x340Var9.r(false);
                    xu30Var = xu30VarR;
                }
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVar2, (xu30) null, apo.r(-1098935249, new jy01(gy01Var, ky01Var, qim0VarH), x340Var9), (xu30) null, apo.r(-1230738482, new jy01(ky01Var, gy01Var, qim0VarH), x340Var9), xu30Var, (xu30) null, (xu30) null, apo.r(1402793034, new hov0(gy01Var, qim0VarH, (byte) 16), x340Var9), x340Var9, 805306432, 196656, 25916);
                return rih1Var2;
            case 7:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                qlb qlbVar = (qlb) jf31Var;
                mod.b(oi7.a.a((gw70) qlbVar.e), apo.r(1405570707, new kpw0((sy01) obj2, (iu30) obj3, qlbVar), b0kVar3), b0kVar3, 56);
                return rih1Var2;
            case 8:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) ((et90) jf31Var).c), apo.r(1321771950, new k211((g211) obj2, (iu30) obj3, (byte) 1), b0kVar4), b0kVar4, 56);
                return rih1Var2;
            case 9:
                c311 c311Var = (c311) obj2;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= x340Var10.g(c311Var) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue6 & 1, (iIntValue6 & 1041) != 1040)) {
                    wyo1.d(c311Var, (ufd) ((ngs0) jf31Var).d, (qim0) null, x340Var11, (iIntValue6 >> 3) & 14);
                } else {
                    x340Var11.b0();
                }
                return rih1Var2;
            case 10:
                b511 b511Var = (b511) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                boolean z5 = b511Var.b;
                if (ihc1.y0(b511Var.a)) {
                    x340 x340Var13 = x340Var12;
                    x340Var13.i0(-1376085816);
                    x340Var13.r(false);
                } else {
                    x340 x340Var14 = x340Var12;
                    x340Var14.i0(-1376789268);
                    Object objT5 = x340Var14.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT5 == m4cVar2) {
                        objT5 = new zen0(Boolean.valueOf(z5));
                        x340Var14.s0(objT5);
                    }
                    zen0 zen0Var = (zen0) objT5;
                    Boolean boolValueOf2 = Boolean.valueOf(z5);
                    boolean zI3 = x340Var14.i(zen0Var) | ((((iIntValue7 & 112) ^ 48) > 32 && x340Var14.i(b511Var)) || (iIntValue7 & 48) == 32);
                    Object objT6 = x340Var14.T();
                    if (zI3 || objT6 == m4cVar2) {
                        objT6 = new p2z0(zen0Var, b511Var, (lnm) null, (byte) 13);
                        x340Var14.s0(objT6);
                    }
                    qxd0.t(boolValueOf2, x340Var14, (vu30) objT6);
                    if (((Boolean) zen0Var.c.getValue()).booleanValue() || ((Boolean) zen0Var.d.getValue()).booleanValue()) {
                        x340Var14.i0(-1376555931);
                        fq7.d(zen0Var, null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), null, apo.r(1830534796, new hho0(jf31Var, (Object) b511Var, (Object) iu30Var7, (byte) 22), x340Var14), x340Var14, 196608, 18);
                        z = false;
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-1376091768);
                        z = false;
                        x340Var14.r(false);
                    }
                    x340Var14.r(z);
                }
                return rih1Var2;
            case 11:
                r911 r911Var = (r911) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                s911 s911Var = (s911) jf31Var;
                String str4 = r911Var.a;
                if (str4 == null || !(!ihc1.y0(str4))) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(-83558937);
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(-83854925);
                    boolean zI4 = x340Var17.i(s911Var);
                    Object objT7 = x340Var17.T();
                    if (zI4 || objT7 == m4cVar3) {
                        objT7 = new kdt0(s911Var, (lnm) null, (byte) 13);
                        x340Var17.s0(objT7);
                    }
                    qxd0.t(rih1Var2, x340Var17, (vu30) objT7);
                    String str5 = r911Var.a;
                    String str6 = r911Var.b;
                    boolean z6 = r911Var.c;
                    boolean z7 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var17.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                    Object objT8 = x340Var17.T();
                    if (z7 || objT8 == m4cVar3) {
                        objT8 = new fr01(iu30Var8, (byte) 21);
                        x340Var17.s0(objT8);
                    }
                    k1p1.f(str5, str6, z6, new gbx(z50.c, (Function0) objT8), (qim0) null, x340Var17, 0);
                    x340Var17.r(false);
                }
                return rih1Var2;
            case 12:
                ((pt) jf31Var).i((ea11) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var2;
            case 13:
                ra11 ra11Var = (ra11) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                oa11 oa11Var = (oa11) jf31Var;
                bpb1 bpb1Var = oa11Var.h;
                w9u0 w9u0Var = oa11Var.g;
                tra0 tra0Var = oa11Var.d;
                ven0 ven0VarH = rwq.h(bpb1Var, x340Var18, 0);
                boolean zP = too1.p((jre) rwq.h(oa11Var.f.s, x340Var18, 0).getValue());
                Boolean boolValueOf3 = Boolean.valueOf(zP);
                x340 x340Var19 = x340Var18;
                boolean zH = x340Var19.h(zP) | x340Var19.i(oa11Var);
                Object objT9 = x340Var19.T();
                if (zH || objT9 == m4cVar4) {
                    objT9 = new ic01(zP, oa11Var, (lnm) null);
                    x340Var19.s0(objT9);
                }
                qxd0.t(boolValueOf3, x340Var19, (vu30) objT9);
                boolean zI5 = x340Var19.i(oa11Var);
                Object objT10 = x340Var19.T();
                if (zI5 || objT10 == m4cVar4) {
                    objT10 = new ma11(oa11Var, (byte) 2);
                    x340Var19.s0(objT10);
                }
                qxd0.i(rih1Var2, (iu30) objT10, x340Var19);
                boolean z8 = ra11Var instanceof qa11;
                if (z8) {
                    x340Var19.i0(128189607);
                    boolean z9 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var19.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                    Object objT11 = x340Var19.T();
                    if (z9 || objT11 == m4cVar4) {
                        objT11 = new fr01(iu30Var9, (byte) 25);
                        x340Var19.s0(objT11);
                    }
                    n1p1.g(0, (Function0) objT11, x340Var19, (qim0) null);
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(128258799);
                    x340Var19.r(false);
                }
                boolean zG = x340Var19.g(tra0Var) | x340Var19.g(w9u0Var);
                Object objT12 = x340Var19.T();
                if (zG || objT12 == m4cVar4) {
                    objT12 = tra0Var.a(w9u0Var, new ggx0(0, oa11Var, oa11.class, "invalidatePresentation", "invalidatePresentation()V", 0, (byte) 15));
                    x340Var19.s0(objT12);
                }
                wra0 wra0Var = (wra0) objT12;
                boolean z10 = ((i6w0) ven0VarH.getValue()).b && z8 && !zP;
                String str7 = ((i6w0) ven0VarH.getValue()).a;
                otw.c(wra0Var, new ura0(z10, rq2.i, "genpods_prompt_chat", 0, (String) null, str7, str7, 152), (qim0) null, (ipb1) null, x340Var19, 0, 12);
                return rih1Var2;
            case 14:
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((gd11) jf31Var).a), apo.r(1285242558, new tc11((dd11) obj2, (iu30) obj3, (byte) 1), b0kVar5), b0kVar5, 56);
                return rih1Var2;
            case 15:
                lh11 lh11Var = (lh11) obj2;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= x340Var20.g(lh11Var) ? 32 : 16;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 1041) != 1040)) {
                    mh11 mh11Var = (mh11) jf31Var;
                    j2p1.m(lh11Var.a, mh11Var.a, mh11Var.b, mh11Var.c, mh11Var.d, mh11Var.e, mh11Var.f, mh11Var.g, mh11Var.h, mh11Var.i, mh11Var.t, (qim0) null, x340Var21, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var2;
            case 16:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                et90 et90Var2 = (et90) jf31Var;
                mod.b(oi7.a.a((gw70) et90Var2.c), apo.r(-104421474, new ik11((hk11) obj2, et90Var2, (iu30) obj3, (byte) 1), b0kVar6), b0kVar6, 56);
                return rih1Var2;
            case 17:
                b0k b0kVar7 = (b0k) obj4;
                ((Number) obj5).intValue();
                nm1 nm1Var = (nm1) jf31Var;
                mod.b(oi7.a.a((gw70) nm1Var.f), apo.r(-1051067402, new tc11((k0e) obj2, nm1Var, (byte) 2), b0kVar7), b0kVar7, 56);
                return rih1Var2;
            case 18:
                rl11 rl11Var = (rl11) obj2;
                x340 x340Var22 = (b0k) obj4;
                ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                tl11 tl11Var = (tl11) jf31Var;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var22, 0);
                x340 x340Var23 = x340Var22;
                int iHashCode = Long.hashCode(x340Var23.T);
                xos0 xos0VarM = x340Var23.m();
                qim0 qim0VarE = zr7.E(x340Var22, nim0Var);
                hzj.A.getClass();
                x340 x340Var24 = x340Var22;
                if (x340Var24.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var24.m0();
                if (x340Var24.S) {
                    x340Var24.l(hmb0.t1);
                } else {
                    x340Var24.v0();
                }
                nko1.H(mbhVarA, x340Var22, y580.O0);
                nko1.H(xos0VarM, x340Var22, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var22, y580.R0);
                nko1.F(x340Var22);
                nko1.H(qim0VarE, x340Var22, y580.Y);
                x340Var24.i0(-1726563810);
                int i6 = 0;
                for (Object obj11 : rl11Var.a) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        Throwable th2 = th;
                        p7h.T();
                        throw th2;
                    }
                    String str8 = (String) obj11;
                    boolean zG2 = x340Var24.g(str8);
                    Object objT13 = x340Var24.T();
                    if (zG2 || objT13 == m4cVar5) {
                        ojq ojqVar = (ojq) tl11Var.a.a.c;
                        objT13 = new bm11((d0r) ojqVar.Y0.get(), (sfn0) ojqVar.t.get());
                        x340Var24.s0(objT13);
                    }
                    bm11 bm11Var = (bm11) objT13;
                    boolean zE = x340Var24.e(i6);
                    Object objT14 = x340Var24.T();
                    if (zE || objT14 == m4cVar5) {
                        objT14 = new sl11(i6, (byte) 0);
                        x340Var24.s0(objT14);
                    }
                    dgo1.c(str8, (iu30) objT14, apo.r(-1246953614, new tc11(bm11Var, str8, (byte) 3), x340Var22), x340Var22, 384);
                    i6 = i7;
                    th = th;
                }
                x340Var24.r(false);
                x340Var24.r(true);
                return rih1Var2;
            case 19:
                zl11 zl11Var = (zl11) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                int iIntValue11 = ((Number) obj5).intValue();
                String str9 = zl11Var.a;
                bm11 bm11Var2 = (bm11) jf31Var;
                x340 x340Var25 = (b0k) obj4;
                boolean zI6 = x340Var25.i(bm11Var2);
                Object objT15 = x340Var25.T();
                if (zI6 || objT15 == fkj0.X) {
                    objT15 = new am11(bm11Var2, (byte) 2);
                    x340Var25.s0(objT15);
                }
                qxd0.i(str9, (iu30) objT15, x340Var25);
                d3p1.q(zl11Var, iu30Var10, bm11Var2.b, x340Var25, (iIntValue11 >> 3) & 126);
                return rih1Var2;
            case 20:
                b0k b0kVar8 = (b0k) obj4;
                ((Number) obj5).intValue();
                qlb qlbVar2 = (qlb) jf31Var;
                mod.b(oi7.a.a((gw70) qlbVar2.c), apo.r(-65390572, new hl11(qlbVar2, (fob1) obj2, (iu30) obj3, b2), b0kVar8), b0kVar8, 56);
                return rih1Var2;
            case 21:
                l3p1.o((tm11) obj2, (p40) ((ngs0) jf31Var).d, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var2;
            case 22:
                b0k b0kVar9 = (b0k) obj4;
                ((Number) obj5).intValue();
                ys11 ys11Var = (ys11) jf31Var;
                mod.b(oi7.a.a(ys11Var.c), apo.r(591234600, new xs11((unb1) obj2, ys11Var, (iu30) obj3, (byte) 1), b0kVar9), b0kVar9, 56);
                return rih1Var2;
            case 23:
                iw11 iw11Var = (iw11) jf31Var;
                x4p1.g((hw11) obj2, iw11Var.a, iw11Var.b, iw11Var.c, iw11Var.d, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var2;
            case 24:
                x121 x121Var = (x121) obj2;
                b0k b0kVar10 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m0u m0uVar = x121Var.c;
                px31 px31Var = x121Var.d;
                zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar10).g;
                ((a221) jf31Var).i(m0uVar, (iu30) obj3, px31Var, new uvx(0, (pgx) null, 3, zzq0Var, (zzq0) null, (tvx) null, (hw61) null, 0, new p3v(24.0f), 243), null, b0kVar10, ((iIntValue12 >> 3) & 112) | 4096);
                return rih1Var2;
            case 25:
                b0k b0kVar11 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-454682931, new hl11(jf31Var, obj2, obj3, (byte) 8), b0kVar11), b0kVar11, 3078, 6);
                return rih1Var2;
            case 26:
                return a(obj, obj2, obj3, obj4, obj5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case 28:
                b0k b0kVar12 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((qe31) jf31Var).c), apo.r(-1665410535, new pe31((ne31) obj2, (iu30) obj3), b0kVar12), b0kVar12, 56);
                return rih1Var2;
            default:
                ff31 ff31Var = (ff31) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                int iIntValue13 = ((Number) obj5).intValue();
                jf31 jf31Var2 = jf31Var;
                b0k b0kVar13 = (x340) ((b0k) obj4);
                boolean zI7 = b0kVar13.i(jf31Var2);
                Object objT16 = b0kVar13.T();
                if (zI7 || objT16 == fkj0.X) {
                    objT16 = new if31(jf31Var2, (byte) 1);
                    b0kVar13.s0(objT16);
                }
                qxd0.i(rih1Var2, (iu30) objT16, b0kVar13);
                zup zupVar = jf31Var2.a;
                vh1 vh1Var = jf31Var2.e;
                rzq rzqVar = jf31Var2.c;
                switch (zupVar.a) {
                    case 0:
                        htr htrVar = (htr) ((daq) ((nwp) zupVar.b.c).a.b).Lp.get();
                        c8o.l(htrVar);
                        g931Var = new g931(htrVar, vh1Var, rzqVar, b3);
                        break;
                    default:
                        g931Var = new g931((htr) zupVar.b.b.Lp.get(), vh1Var, rzqVar, b3);
                        break;
                }
                g931Var.d(ff31Var, iu30Var11, b0kVar13, (iIntValue13 >> 3) & 126);
                return rih1Var2;
        }
    }
}
