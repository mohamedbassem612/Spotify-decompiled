package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qsn0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsn0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ou80 ou80Var;
        jsl jslVar;
        w7h1 w7h1Var;
        String strO0;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                tqw tqwVar = (tqw) obj3;
                et90 et90Var = (et90) obj4;
                int iOrdinal = ((osn0) obj2).ordinal();
                if (iOrdinal == 0) {
                    ((ior) et90Var.c).a(cvl1.d(tqwVar).a.a, false);
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    ((lzn0) et90Var.d).a(nik1.u4.a, cvl1.d(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                if (d2o0.a[((a2o0) obj2).ordinal()] == 1) {
                    ((f2o0) obj4).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                if (i3o0.a[((f3o0) obj2).ordinal()] == 1) {
                    ((Function0) ((umf0) obj4).e).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                return ((sas) ((sbk) obj4).h).j(((q5o0) obj2).a);
            case 4:
                tqw tqwVar2 = (tqw) obj3;
                hao0 hao0Var = (hao0) obj4;
                if (((dao0) obj2).equals(dao0.a)) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarC = uic.C(hao0Var.a, (String) null);
                    String strH = pcf.h(s4b1VarC);
                    if (strH != null) {
                        a1r0.j(hao0Var.b, pcf.f(s4b1VarC), (tqwVar2 == null || (ou80Var = n3o1.y(tqwVar2).a) == null) ? null : ou80Var.a, mno1.h(new mmr0[]{new mmr0("OnPlatformShareData", new g7q0(strH))}), false, 8);
                        return rih1Var;
                    }
                    hhg1.n("Required value was null.");
                } else {
                    eg.o();
                }
                return null;
            case 5:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                ylx ylxVar = ylx.c;
                if (((i3o1) obj4) instanceof eao0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(940498615);
                    jslVar = new jsl(cwl1.o0(x340Var2, 2131953316));
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(940606123);
                    x340Var3.r(false);
                    jslVar = isl.a;
                }
                jsl jslVar2 = jslVar;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(ylxVar, jslVar2, u291.r(nim0Var, 24.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, ylx.d, 48);
                return rih1Var;
            case 6:
                tqw tqwVar3 = (tqw) obj3;
                ((qao0) obj4).a.invoke((oao0) obj2, tqwVar3 != null ? n3o1.y(tqwVar3) : null);
                return rih1Var;
            case 7:
                tqw tqwVar4 = (tqw) obj3;
                ((tao0) obj4).a.invoke((rao0) obj2, tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                return rih1Var;
            case 8:
                aeo0 aeo0Var = (aeo0) obj2;
                iu30 iu30Var = (iu30) ((ng20) obj4).b;
                String str = ((beo0) obj).a;
                if (aeo0Var.equals(zdo0.a)) {
                    iu30Var.invoke(new wvk1(str));
                    return rih1Var;
                }
                if (aeo0Var.equals(ydo0.a)) {
                    iu30Var.invoke(new vvk1(str));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                wmy wmyVar = (wmy) obj4;
                fn31.T(smo1.e(flo1.l(op71.f(), (q8n) wmyVar.e)), (o8n) null, 0, new kv1(wmyVar, ((Boolean) obj2).booleanValue(), (tv80) obj3, (km61) obj, (lnm) null), 3);
                return Boolean.FALSE;
            case 10:
                ((Number) obj3).intValue();
                uwo1.e(((eno0) obj4).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 11:
                ((Number) obj3).intValue();
                anm1.c(true, (iu30) null, (qim0) null, (max) obj4, (idn0) null, (b0k) obj2, 48, 20);
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                upn1.a((b180) obj4, (qim0) null, (String) null, (b0k) obj2, 0, 6);
                return rih1Var;
            case 13:
                ulp0 ulp0Var = (ulp0) obj3;
                zlp0 zlp0Var = (zlp0) obj4;
                if (ulp0Var instanceof tlp0) {
                    uvk0 uvk0VarE = zlp0Var.e();
                    uvk0VarE.getClass();
                    x6h1 x6h1VarC = uvk0VarE.a.c();
                    x6h1VarC.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "off_platform"));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("start_chat_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (ulp0Var instanceof rlp0) {
                    uvk0 uvk0VarE2 = zlp0Var.e();
                    uvk0VarE2.getClass();
                    x6h1 x6h1VarC3 = uvk0VarE2.a.c();
                    x6h1VarC3.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "off_platform"));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (ulp0Var instanceof nlp0) {
                    uvk0 uvk0VarE3 = zlp0Var.e();
                    uvk0VarE3.getClass();
                    x6h1 x6h1VarC5 = uvk0VarE3.a.c();
                    x6h1VarC5.i.add(new a7h1("accept_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("accept_chat", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else if (ulp0Var instanceof olp0) {
                    uvk0 uvk0VarE4 = zlp0Var.e();
                    uvk0VarE4.getClass();
                    x6h1 x6h1VarC6 = uvk0VarE4.a.c();
                    x6h1VarC6.i.add(new a7h1("accept_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!ulp0Var.equals(qlp0.a)) {
                        if (!(ulp0Var instanceof plp0) && !(ulp0Var instanceof slp0)) {
                            eg.o();
                        }
                        return null;
                    }
                    uvk0 uvk0VarE5 = zlp0Var.e();
                    uvk0VarE5.getClass();
                    x6h1 x6h1VarC7 = uvk0VarE5.a.c();
                    x6h1VarC7.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "off_platform"));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("manage_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA = x6h1VarC8.a();
                    String str2 = nik1.e1.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 14:
                res resVar = (res) obj4;
                if (!((rop0) obj3).equals(rop0.a)) {
                    eg.o();
                    return null;
                }
                iuk0 iuk0Var = (iuk0) ((idd1) resVar.h).getValue();
                iuk0Var.getClass();
                x6h1 x6h1VarC9 = iuk0Var.a.c();
                x6h1VarC9.i.add(new a7h1("empty_view", (String) null, (Integer) null, (String) null, "offline_listening_disabled"));
                x6h1VarC9.j = true;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                y6h1 y6h1VarA2 = x6h1VarC10.a();
                String str3 = (String) ((idd1) resVar.g).getValue();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 15:
                fvp0 fvp0Var = (fvp0) obj;
                evp0 evp0Var = (evp0) obj2;
                tqw tqwVar5 = (tqw) obj3;
                bs0 bs0Var = (bs0) obj4;
                if (evp0Var instanceof cvp0) {
                    ((lo60) bs0Var.b).a(fvp0Var.f, cvl1.d(tqwVar5), (Bundle) null);
                    return rih1Var;
                }
                if (evp0Var instanceof dvp0) {
                    vgm.b((vgm) bs0Var.e, fvp0Var.f, (String) null, cvl1.d(tqwVar5), new tgm((String) null, false, true, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -7, 1), 2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str4 = ((ghm0) obj4).a;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
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
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                op71.g(x340Var4, u291.r(nim0Var, 8.0f));
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var4, 0);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarZ);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                i3a.l(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                qim0 qim0VarR = u291.r(nim0Var, 48.0f);
                uwr uwrVar2 = cbx.a;
                long jC = cbx.a(x340Var4).a.a.c();
                cua cuaVar = cbx.b(x340Var4).f;
                w0h1.a(wsx.c, isl.a, uyn1.x(dug.f(qim0VarR, jC, er31.b(4.0f)), 12.0f), 0L, 0L, false, x340Var4, wsx.d | 48, 56);
                op71.g(x340Var4, u291.r(nim0Var, 12.0f));
                uwo1.e(cwl1.o0(x340Var4, 2131963396), (qim0) null, cbx.d(x340Var4).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2042);
                x340Var6.r(true);
                op71.g(x340Var4, u291.r(nim0Var, 8.0f));
                rqo1.g(0, 0, x340Var4, uyn1.z(0.0f, 8.0f, 1, u291.f(nim0Var, 1.0f)));
                qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 8.0f);
                if (str4 != null) {
                    x340Var6.i0(-1950564461);
                    strO0 = cwl1.n0(2131963395, new Object[]{str4}, x340Var4);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1950374834);
                    strO0 = cwl1.o0(x340Var4, 2131963394);
                    x340Var6.r(false);
                }
                uwo1.e(strO0, qim0VarY, cbx.d(x340Var4).g, cbx.a(x340Var4).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                x340Var6.r(true);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ebq0 ebq0Var = (ebq0) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z = ebq0Var.a;
                    int i = z ? 2131233463 : 2131233455;
                    cbx.a.getClass();
                    qxd0.x(i, 0, x340Var8, hno1.f(nim0Var, uwr.a()), z);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (((obq0) obj2).equals(obq0.a)) {
                    ((pbq0) obj4).a.invoke(rdq0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (((qbq0) obj2).equals(qbq0.a)) {
                    ((rbq0) obj4).a.invoke(sdq0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hdq0 hdq0Var = (hdq0) obj;
                if (((gdq0) obj2).equals(gdq0.a)) {
                    ((idq0) obj4).a.invoke(new udq0(hdq0Var.b.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ieq0 ieq0Var = (ieq0) obj2;
                leq0 leq0Var = (leq0) obj4;
                if (ieq0Var instanceof geq0) {
                    leq0Var.d.invoke(((geq0) ieq0Var).a);
                    return rih1Var;
                }
                if (ieq0Var instanceof heq0) {
                    leq0Var.b.invoke();
                    return rih1Var;
                }
                if (ieq0Var instanceof feq0) {
                    leq0Var.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                if (((nfq0) obj2) == nfq0.a) {
                    ((lzn0) ((smp0) obj4).c).e();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 23:
                zfq0 zfq0Var = (zfq0) obj2;
                iu30 iu30Var2 = ((bgq0) obj4).a;
                if (zfq0Var.equals(xfq0.a)) {
                    iu30Var2.invoke(zdq0.a);
                    return rih1Var;
                }
                if (zfq0Var.equals(yfq0.a)) {
                    iu30Var2.invoke(aeq0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                egq0 egq0Var = (egq0) obj4;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    u7n0.k(egq0Var.a, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 25:
                ((kgq0) obj4).b.invoke(((hgq0) obj2).a);
                return rih1Var;
            case 26:
                pgq0 pgq0Var = (pgq0) obj2;
                ug3 ug3Var = (ug3) obj4;
                if (pgq0Var.equals(ogq0.a)) {
                    ((gis) ug3Var.d).invoke();
                    return rih1Var;
                }
                if (pgq0Var.equals(ngq0.a)) {
                    ((gis) ug3Var.e).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 27:
                nhq0 nhq0Var = (nhq0) obj2;
                tqw tqwVar6 = (tqw) obj3;
                if (tqwVar6 != null) {
                    ((thq0) obj4).b.a(nhq0Var.a, n3o1.y(tqwVar6), (Bundle) null);
                }
                return rih1Var;
            case 28:
                ((Boolean) obj2).getClass();
                ((dp60) ((sjq0) obj4).c).a(true);
                return Boolean.TRUE;
            default:
                bjk1 bjk1Var = (bjk1) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                String str5 = bjk1Var.c;
                Float f = bjk1Var.b;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? x340Var11.g(bjk1Var) : x340Var11.i(bjk1Var) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var12).b.b, 0.0f, 2, qim0VarF);
                    era eraVar = een.Q0;
                    cvx cvxVar = cbx.b(x340Var12).b;
                    osq0 osq0Var = (osq0) obj4;
                    mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var12, 0);
                    int iHashCode3 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM3 = x340Var12.m();
                    qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarZ2);
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
                    nko1.H(mbhVarA2, x340Var12, y580.O0);
                    nko1.H(xos0VarM3, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE3, x340Var12, y580.Y);
                    vrq0.c(bjk1Var.a, ef.a(x340Var12).b(6), (qim0) null, x340Var12, 0);
                    if (f != null) {
                        x340Var12.i0(1975050039);
                        otw.c(osq0Var.f, new oqu(f.floatValue()), (qim0) null, (ipb1) null, x340Var12, 8, 12);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(1975209565);
                        x340Var12.r(false);
                    }
                    if (str5 != null) {
                        x340Var12.i0(1975242828);
                        x340Var12.f0(-490471456, bjk1Var.e);
                        qqn1.a(0, str5, (String) null, x340Var12, (qim0) null);
                        x340Var12.r(false);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(1975320669);
                        x340Var12.r(false);
                    }
                    if (bjk1Var.d != null) {
                        x340Var12.i0(1975373896);
                        uwo1.e(bjk1Var.d, u291.f(nim0Var, 1.0f), cbx.d(x340Var12).g, cbx.a(x340Var12).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2016);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(1975619261);
                        x340Var12.r(false);
                    }
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
        }
    }
}
