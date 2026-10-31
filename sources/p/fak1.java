package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fak1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fak1(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:285:0x07a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [int] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [java.lang.Float] */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        int i;
        boolean z;
        String str;
        int i2;
        afx afxVar;
        String strK;
        String str2;
        byte b = this.a;
        String string = "";
        Object objW = null;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        boolean z3 = true;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((hak1) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((pm70) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eqr0.b(0, 2, ((Locale) obj3).getLanguage().toUpperCase(Locale.ROOT), x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((pm70) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 4:
                dvk1 dvk1Var = (dvk1) obj;
                gwk1 gwk1Var = (gwk1) obj2;
                Map map = gwk1Var.m;
                boolean z4 = dvk1Var.c;
                Context context = ((tuk1) obj3).g;
                long j = dvk1Var.d;
                if (j > 0) {
                    string = context.getString(2131957793, DateUtils.formatDateTime(context, j, 65560));
                    string.getClass();
                }
                String str3 = string;
                String str4 = gwk1Var.a;
                String str5 = gwk1Var.b;
                int iC1 = gwk1Var.c - o7h.c1(map.values());
                boolean z5 = gwk1Var.r;
                int iC = l1d.C(gwk1Var.d);
                if (iC == 0) {
                    i = 1;
                } else if (iC == 1) {
                    i = 2;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                boolean z6 = gwk1Var.o;
                myk1 myk1Var = (z4 || !gwk1Var.f19p) ? gwk1Var.n ? oyk1.a : nyk1.a : myk1.a;
                String str6 = gwk1Var.h;
                List<xdo0> list = gwk1Var.g;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (xdo0 xdo0Var : list) {
                    String str7 = xdo0Var.a;
                    String str8 = xdo0Var.b;
                    String str9 = xdo0Var.c;
                    boolean z7 = z3;
                    String str10 = xdo0Var.d;
                    Integer num = (Integer) map.get(str7);
                    ?? IntValue = num != null ? num.intValue() : z2;
                    boolean z8 = gwk1Var.q;
                    String str11 = xdo0Var.a;
                    String str12 = str5;
                    if (gwk1Var.s) {
                        Integer num2 = (Integer) map.get(str11);
                        if ((num2 != null ? num2.intValue() : 0) > 0) {
                            z = z7;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    arrayList.add(new eeo0(str7, str8, str9, str10, (int) IntValue, z8, z, gwk1Var.i, gwk1Var.j, gwk1Var.k, gwk1Var.l));
                    z3 = z7;
                    str5 = str12;
                    z2 = false;
                }
                return new qyk1(str4, str5, arrayList, iC1, z5, i, str6, z6, str3, myk1Var, z4);
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(((qwk1) obj3).c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                k42 k42Var = (k42) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ven0 ven0VarH = rwq.h((bpb1) k42Var.o, x340Var6, 0);
                    ven0 ven0VarH2 = rwq.h((bpb1) k42Var.q, x340Var6, 0);
                    ven0 ven0VarH3 = rwq.h((bpb1) k42Var.f25p, x340Var6, 0);
                    qau qauVar = (qau) ven0VarH.getValue();
                    if (qauVar == null) {
                        x340Var6.i0(331378525);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(331378526);
                        nyx.a(2, (wux) null, apo.r(1497569409, new n6l1(k42Var, qauVar, ven0VarH3, ven0VarH2, (byte) 1), x340Var6), x340Var6, 3078, 6);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                j7l1 j7l1Var = (j7l1) obj;
                n0o n0oVar = (n0o) obj3;
                bbl1 bbl1Var = ((l7l1) obj2).a;
                if (bbl1Var == null) {
                    return n0o.f(j7l1Var);
                }
                abl1 abl1Var = bbl1Var.d;
                String str13 = bbl1Var.b;
                zal1 zal1Var = bbl1Var.h;
                String str14 = zal1Var == null ? str13 : "";
                String str15 = bbl1Var.g;
                if (str15.length() <= 0) {
                    str15 = null;
                }
                String str16 = str15 == null ? str13 : str15;
                String str17 = j7l1Var.a;
                String str18 = j7l1Var.b;
                zal1 zal1Var2 = bbl1Var.c;
                String str19 = zal1Var2 != null ? zal1Var2.a : null;
                String str20 = str19 == null ? "" : str19;
                String str21 = j7l1Var.c;
                String str22 = bbl1Var.j;
                if (str22.length() <= 0) {
                    str22 = null;
                }
                if (str22 == null) {
                    str22 = (String) n0oVar.f;
                }
                String str23 = str22;
                String str24 = zal1Var != null ? zal1Var.a : null;
                String str25 = str24 == null ? "" : str24;
                yal1 yal1Var = bbl1Var.i;
                Integer numValueOf = (yal1Var == null || (afxVar = yal1Var.b) == null) ? null : Integer.valueOf(z4p1.G(afxVar.b.b));
                String str26 = abl1Var != null ? abl1Var.a : null;
                String str27 = str26 == null ? "" : str26;
                if (abl1Var == null || (i2 = abl1Var.b) == 0) {
                    str = null;
                } else if (i2 == 1) {
                    str = "URL";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str = "MANIFEST_ID";
                }
                String str28 = str == null ? "" : str;
                long j2 = abl1Var != null ? abl1Var.c : 0L;
                long j3 = abl1Var != null ? abl1Var.d : 0L;
                Double d = bbl1Var.f;
                return new k7l1(str17, str18, str20, str21, str23, str14, str16, str25, numValueOf, str27, str28, j2, j3, d != null ? Float.valueOf((float) d.doubleValue()) : null, true);
            case 8:
                String str29 = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                LinkedHashMap linkedHashMap = ((lvd) obj3).b;
                Object objB = linkedHashMap.get(str29);
                if (objB == null) {
                    objB = gio1.b(Boolean.FALSE);
                    linkedHashMap.put(str29, objB);
                }
                ((wen0) objB).m((Object) null, bool);
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str30 = ((v9l1) obj3).c;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str30, (qim0) null, cbx.d(x340Var8).d, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2034);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                lox0 lox0Var = (lox0) obj3;
                return new jpg0(new ug3((iac0) obj2, (n9c) lox0Var.b, new lal1(lox0Var, (byte) 0), new lal1(lox0Var, (byte) 1)), v5l1.R0);
            case 11:
                ilh1 ilh1Var = ((mal1) obj3).a;
                return new jpg0(new sma1((v7l1) ilh1Var.b, (Activity) ilh1Var.c), v5l1.S0);
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    otw.c((maa) ((bhl1) obj3).b.get(), rih1Var2, (qim0) null, (ipb1) null, x340Var10, 48, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                gll1 gll1Var = (gll1) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ill1 ill1Var = gll1Var.b;
                    Uri.Builder builderBuildUpon = Uri.parse("https://spclient.wg.spotify.com/webview-prod/v1/" + ill1Var.a + "/app/").buildUpon();
                    for (Map.Entry entry : ill1Var.b.entrySet()) {
                        builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    vyo1.t(builderBuildUpon.build().toString(), "/webview-prod/", gll1Var.c, x340Var12, 432);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                x2g0.q((ch7) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                z1a1.e((lq51) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    m4m1 m4m1Var = (m4m1) obj3;
                    ws61 ws61Var = m4m1Var != null ? m4m1Var.a : null;
                    if (ws61Var == null) {
                        x340Var14.i0(-619779206);
                    } else {
                        x340Var14.i0(672743783);
                        objW = hso1.W(ws61Var, x340Var14);
                    }
                    x340Var14.r(false);
                    ?? r13 = objW == null ? "" : objW;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e((String) r13, (qim0) null, cbx.d(x340Var14).h, cbx.a(x340Var14).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2034);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int iOrdinal = ((gzl1) obj3).ordinal();
                    if (iOrdinal == 0) {
                        strK = x0d.k(x340Var16, -1494989607, 2131963914, x340Var16, false);
                    } else if (iOrdinal == 1) {
                        strK = x0d.k(x340Var16, -1494986790, 2131963916, x340Var16, false);
                    } else if (iOrdinal == 2) {
                        strK = x0d.k(x340Var16, -1494983942, 2131963912, x340Var16, false);
                    } else {
                        if (iOrdinal != 3) {
                            throw p3d1.k(x340Var16, -1494990789, false);
                        }
                        strK = x0d.k(x340Var16, -1494981028, 2131963910, x340Var16, false);
                    }
                    uwo1.e(strK, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var16, 0, 0, 1790);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                e6m1 e6m1Var = (e6m1) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    vyo1.t(l1d.m("https://spclient.wg.spotify.com/worlds-ui/v1/", e6m1Var.b.a), "/worlds-ui/", e6m1Var.c, x340Var18, 432);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 19:
                nfa0 nfa0Var = ((w7m1) obj3).c;
                Map map2 = ((qxc0) obj).X;
                List list2 = (List) obj2;
                ArrayList<Map> arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pvc0) it.next()).f);
                }
                if (!arrayList2.isEmpty()) {
                    for (Map map3 : arrayList2) {
                        if (map3 != null && (str2 = (String) map3.get("recsplanation")) != null && (!ihc1.y0(str2))) {
                            z2 = true;
                        }
                    }
                }
                return new x7m1(wb20.a(map2, nfa0Var).b, z2);
            case 20:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(((cem1) obj3).a.n, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2046);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 21:
                ((xgm1) obj3).a(new qgm1(Integer.valueOf(((Number) obj).intValue()), ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 22:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String str31 = ((krm1) obj3).W1;
                    if (str31 == null) {
                        u890.C("title");
                        throw null;
                    }
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str31, (qim0) null, cbx.d(x340Var22).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var22, 0, 0, 1722);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((aum1) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                return new uuj((ymd0) obj2, new f2m1((jvm1) obj3, (cir0) obj, (byte) 18));
            case 25:
                return new uuj((ymd0) obj2, new c4m1((wvm1) obj3, (cir0) obj));
            case 26:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    tbr0 tbr0VarC = ((cir0) x340Var24.k(k2r0.a)).c();
                    boolean zG = x340Var24.g(tbr0VarC);
                    lxm1 lxm1Var = (lxm1) obj3;
                    Object objT = x340Var24.T();
                    if (zG || objT == fkj0.X) {
                        byp bypVar = (byp) lxm1Var.b.a.c;
                        mxm1 mxm1Var = (mxm1) bypVar.b;
                        RxRouter rxRouter = (RxRouter) mxm1Var.c.get();
                        c8o.l(rxRouter);
                        iir iirVar = new iir(new be(new CosmosTransport(new opy0(rxRouter, (byte) 8))));
                        euz euzVar = (euz) ((jly0) bypVar.d).get();
                        luk lukVar = (luk) mxm1Var.b.get();
                        c8o.l(lukVar);
                        l6s l6sVar = new l6s(iirVar, euzVar, new z0t(new fvm1(lukVar)));
                        qvq qvqVar = (qvq) ((jly0) bypVar.f).get();
                        svq svqVar = (svq) ((jly0) bypVar.h).get();
                        luk lukVar2 = (luk) ((mxm1) bypVar.b).b.get();
                        c8o.l(lukVar2);
                        x1t x1tVar = new x1t(l6sVar, qvqVar, svqVar, new z0t(new fvm1(lukVar2)), (nxm1) bypVar.c, tbr0VarC);
                        x340Var24.s0(x1tVar);
                        objT = x1tVar;
                    }
                    otw.c((x1t) objT, dxm1.a, (qim0) null, (ipb1) null, x340Var24, 48, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                irn1.l((nmo0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((Number) obj2).intValue();
                irn1.r((qmo0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                irn1.t((kjo0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fak1(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
