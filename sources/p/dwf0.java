package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.home.evopage.element.recents.events.proto.RecentsDataSourceErrorEvent;
import com.spotify.libs.connect.events.proto.ConnectDeviceDiscoverySnapshot;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dwf0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwf0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                dwf0 dwf0Var = new dwf0((qv3) obj4, (lnm) obj3, (byte) 0);
                dwf0Var.b = (Intent) obj;
                dwf0Var.c = (th61) obj2;
                return dwf0Var.invokeSuspend(rih1Var);
            case 1:
                dwf0 dwf0Var2 = new dwf0((xyg0) obj4, (lnm) obj3, (byte) 1);
                dwf0Var2.b = (k1r) obj;
                dwf0Var2.c = (gzg0) obj2;
                return dwf0Var2.invokeSuspend(rih1Var);
            case 2:
                new dwf0((f7i0) this.b, (String) this.c, (jfe) obj4, (lnm) obj3, (byte) 2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                dwf0 dwf0Var3 = new dwf0((wji0) obj4, (lnm) obj3, (byte) 3);
                dwf0Var3.b = (String) obj;
                dwf0Var3.c = (nji0) obj2;
                return dwf0Var3.invokeSuspend(rih1Var);
            case 4:
                dwf0 dwf0Var4 = new dwf0((kqi0) obj4, (lnm) obj3, (byte) 4);
                dwf0Var4.b = (cxc0) obj;
                dwf0Var4.c = (ibk0) obj2;
                return dwf0Var4.invokeSuspend(rih1Var);
            case 5:
                dwf0 dwf0Var5 = new dwf0((fjk0) obj4, (lnm) obj3, (byte) 5);
                dwf0Var5.b = (cxc0) obj;
                dwf0Var5.c = (g3d0) obj2;
                return dwf0Var5.invokeSuspend(rih1Var);
            case 6:
                dwf0 dwf0Var6 = new dwf0((dnk0) obj4, (lnm) obj3, (byte) 6);
                dwf0Var6.b = (String) obj;
                dwf0Var6.c = (String) obj2;
                return dwf0Var6.invokeSuspend(rih1Var);
            case 7:
                dwf0 dwf0Var7 = new dwf0((iu30) obj4, (lnm) obj3, (byte) 7);
                dwf0Var7.b = (MobiusLoop) obj;
                dwf0Var7.c = (Set) obj2;
                dwf0Var7.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                dwf0 dwf0Var8 = new dwf0((nl9) obj4, (lnm) obj3, (byte) 8);
                dwf0Var8.b = (String) obj;
                dwf0Var8.c = (String) obj2;
                return dwf0Var8.invokeSuspend(rih1Var);
            case 9:
                dwf0 dwf0Var9 = new dwf0((ahi0) obj4, (lnm) obj3, (byte) 9);
                dwf0Var9.b = (List) obj;
                dwf0Var9.c = (List) obj2;
                return dwf0Var9.invokeSuspend(rih1Var);
            case 10:
                dwf0 dwf0Var10 = new dwf0((l2v0) obj4, (lnm) obj3, (byte) 10);
                dwf0Var10.b = (g2v0) obj;
                dwf0Var10.c = (ioj0) obj2;
                return dwf0Var10.invokeSuspend(rih1Var);
            case 11:
                dwf0 dwf0Var11 = new dwf0((Function0) obj4, (lnm) obj3, (byte) 11);
                dwf0Var11.b = (uev0) obj;
                dwf0Var11.c = (myv0) obj2;
                return dwf0Var11.invokeSuspend(rih1Var);
            case 12:
                dwf0 dwf0Var12 = new dwf0((rkv0) this.c, (ujv0) obj4, (lnm) obj3, (byte) 12);
                dwf0Var12.b = (Throwable) obj2;
                dwf0Var12.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                dwf0 dwf0Var13 = new dwf0((skv0) this.c, (vjv0) obj4, (lnm) obj3, (byte) 13);
                dwf0Var13.b = (Throwable) obj2;
                dwf0Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                dwf0 dwf0Var14 = new dwf0((m9v0) obj4, (lnm) obj3, (byte) 14);
                dwf0Var14.b = (ioj0) obj;
                dwf0Var14.c = (qlq0) obj2;
                return dwf0Var14.invokeSuspend(rih1Var);
            case 15:
                dwf0 dwf0Var15 = new dwf0((ih60) obj4, (lnm) obj3, (byte) 15);
                dwf0Var15.b = (cxc0) obj;
                dwf0Var15.c = (Boolean) obj2;
                return dwf0Var15.invokeSuspend(rih1Var);
            case 16:
                new dwf0((sen0) this.b, (dxy) this.c, (ga01) obj4, (lnm) obj3, (byte) 16).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                dwf0 dwf0Var16 = new dwf0((rq01) this.c, (oq01) obj4, (lnm) obj3, (byte) 17);
                dwf0Var16.b = (Throwable) obj2;
                dwf0Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                dwf0 dwf0Var17 = new dwf0((xq51) obj4, (lnm) obj3, (byte) 18);
                dwf0Var17.b = (Map) obj;
                dwf0Var17.c = (List) obj2;
                return dwf0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                dwf0 dwf0Var18 = new dwf0((ju51) obj4, (lnm) obj3, (byte) 19);
                dwf0Var18.b = (bbz0) obj;
                dwf0Var18.c = (List) obj2;
                return dwf0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                dwf0 dwf0Var19 = new dwf0((vw51) this.c, (String) obj4, (lnm) obj3, (byte) 20);
                dwf0Var19.b = (Throwable) obj2;
                dwf0Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                dwf0 dwf0Var20 = new dwf0((no5) this.c, (jp61) obj4, (lnm) obj3, (byte) 21);
                dwf0Var20.b = (Throwable) obj2;
                dwf0Var20.invokeSuspend(rih1Var);
                throw null;
            case 22:
                dwf0 dwf0Var21 = new dwf0((m081) obj4, (lnm) obj3, (byte) 22);
                dwf0Var21.b = (iix0) obj;
                dwf0Var21.c = (PlayerState) obj2;
                return dwf0Var21.invokeSuspend(rih1Var);
            case 23:
                dwf0 dwf0Var22 = new dwf0((id81) obj4, (lnm) obj3, (byte) 23);
                dwf0Var22.b = (dd81) obj;
                dwf0Var22.c = (uv00) obj2;
                return dwf0Var22.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                dwf0 dwf0Var23 = new dwf0((String) obj4, (lnm) obj3, (byte) 24);
                dwf0Var23.b = (jo70) obj;
                dwf0Var23.c = (xkk1) obj2;
                return dwf0Var23.invokeSuspend(rih1Var);
            case 25:
                dwf0 dwf0Var24 = new dwf0((pda1) obj4, (lnm) obj3, (byte) 25);
                dwf0Var24.b = (yvg1) obj;
                dwf0Var24.c = (xca1) obj2;
                return dwf0Var24.invokeSuspend(rih1Var);
            case 26:
                dwf0 dwf0Var25 = new dwf0((v0b1) obj4, (lnm) obj3, (byte) 26);
                dwf0Var25.b = (px0) obj;
                dwf0Var25.c = (ContextTrack) obj2;
                return dwf0Var25.invokeSuspend(rih1Var);
            case 27:
                dwf0 dwf0Var26 = new dwf0((ayb1) obj4, (lnm) obj3, (byte) 27);
                dwf0Var26.b = (nwb1) obj;
                dwf0Var26.c = (String) obj2;
                return dwf0Var26.invokeSuspend(rih1Var);
            case 28:
                dwf0 dwf0Var27 = new dwf0((bsc1) obj4, (lnm) obj3, (byte) 28);
                dwf0Var27.b = (List) obj;
                dwf0Var27.c = (vab0) obj2;
                return dwf0Var27.invokeSuspend(rih1Var);
            default:
                dwf0 dwf0Var28 = new dwf0((buc1) obj4, (lnm) obj3, (byte) 29);
                dwf0Var28.b = (qxc0) obj;
                dwf0Var28.c = (Boolean) obj2;
                return dwf0Var28.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    /* JADX WARN: Code duplicated, block: B:104:0x021b  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e4  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        String str;
        olq0 olq0Var;
        goj0 goj0VarA;
        bku bkuVar;
        ve01 ve01VarR;
        mmr0 mmr0Var;
        boolean z2;
        byte b = this.a;
        String str2 = "";
        dlc0 dlc0Var = dlc0.d;
        rih1 rih1Var = rih1.a;
        String queryParameter = null;
        boolean z3 = false;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Intent intent = (Intent) this.b;
                th61 th61Var = (th61) this.c;
                hm5.M(obj);
                String dataString = intent.getDataString();
                if (dataString == null) {
                    dataString = "";
                }
                Uri uri = Uri.parse(dataString);
                uri.getClass();
                String fragment = uri.getFragment();
                queryParameter = fragment != null ? Uri.parse("?".concat(fragment)).getQueryParameter("username") : null;
                str2 = queryParameter != null ? queryParameter : "";
                return str2.equalsIgnoreCase(th61Var.a) ? crn0.a : new hrn0(vvf0.class, new yvf0(str2, dataString), a6w0.a);
            case 1:
                k1r k1rVar = (k1r) this.b;
                gzg0 gzg0Var = (gzg0) this.c;
                hm5.M(obj);
                xyg0 xyg0Var = (xyg0) obj2;
                return new vyg0(xyg0Var.a, xyg0Var.b, k1rVar, gzg0Var);
            case 2:
                hm5.M(obj);
                ((f7i0) this.b).a.remove((String) this.c, (jfe) obj2);
                return rih1Var;
            case 3:
                String str3 = (String) this.b;
                nji0 nji0Var = (nji0) this.c;
                hm5.M(obj);
                return new xji0(((wji0) obj2).a, str3, nji0Var);
            case 4:
                cxc0 cxc0Var = (cxc0) this.b;
                ibk0 ibk0Var = (ibk0) this.c;
                hm5.M(obj);
                kqi0 kqi0Var = (kqi0) obj2;
                boolean zB = z6k0.b(cxc0Var.f.q);
                if (cxc0Var.f.w.c) {
                    wsc0 wsc0Var = cxc0Var.k;
                    int iIntValue = 0;
                    for (dlc0 dlc0Var2 : (dlc0[]) Arrays.copyOf(new dlc0[]{dlc0Var}, 1)) {
                        Integer num = (Integer) wsc0Var.j.get(dlc0Var2);
                        iIntValue += num != null ? num.intValue() : 0;
                    }
                    z = true;
                    if (iIntValue >= 1) {
                        z3 = true;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(r1p1.i(zB, z3, cxc0Var.i ^ z, ibk0Var, ((rxj0) kqi0Var.d).m));
            case 5:
                cxc0 cxc0Var2 = (cxc0) this.b;
                g3d0 g3d0Var = (g3d0) this.c;
                hm5.M(obj);
                if (z6k0.a(cxc0Var2.f.q) && !u890.j(g3d0Var, u2d0.a)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 6:
                String str4 = (String) this.b;
                String str5 = (String) this.c;
                hm5.M(obj);
                return dnk0.a((dnk0) obj2, str4, str5);
            case 7:
                MobiusLoop mobiusLoop = (MobiusLoop) this.b;
                Set set = (Set) this.c;
                hm5.M(obj);
                mobiusLoop.a(((iu30) obj2).invoke(set));
                return rih1Var;
            case 8:
                String str6 = (String) this.b;
                String str7 = (String) this.c;
                hm5.M(obj);
                if (str6 == null) {
                    str6 = (String) ((nl9) obj2).t;
                }
                return new mum0(str7, str6);
            case 9:
                List list = (List) this.b;
                List list2 = (List) this.c;
                hm5.M(obj);
                wtr wtrVar = (wtr) ((ahi0) obj2).T0;
                byp bypVar = wtrVar.b;
                iir iirVar = (iir) bypVar.g;
                c9c0 c9c0Var = (c9c0) bypVar.d;
                fqt fqtVarL = iirVar.l((List) c9c0Var.c.available().getValue(), (pp90) c9c0Var.b.current().getValue(), ((g0l) bypVar.b).i(), ((lbq) bypVar.a).a() ? (List) ((hir) bypVar.c).h.getValue() : z6x.a, (List) d5p1.h(((sfr) bypVar.e).c).a.getValue(), (Map) ((uya) bypVar.f).a().getValue(), 2);
                if (wtrVar.a(fqtVarL)) {
                    Iterator it = fqtVarL.a.iterator();
                    while (it.hasNext()) {
                        wtrVar.a.a((ConnectDeviceDiscoverySnapshot) it.next());
                    }
                    wtrVar.f = fqtVarL;
                    str = fqtVarL.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    fqt fqtVar = wtrVar.f;
                    queryParameter = fqtVar != null ? fqtVar.b : null;
                    if (queryParameter != null) {
                        str2 = queryParameter;
                    }
                } else {
                    str2 = str;
                }
                return new yvg1(list, list2, str2);
            case 10:
                g2v0 g2v0Var = (g2v0) this.b;
                ioj0 ioj0Var = (ioj0) this.c;
                hm5.M(obj);
                Set setB = ioj0Var.a.b();
                int iS = zno1.s(q7h.U(setB, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj3 : setB) {
                    linkedHashMap.put(obj3, l2v0.e((String) obj3, g2v0Var, ioj0Var));
                }
                return new rlq0(linkedHashMap);
            case 11:
                uev0 uev0Var = (uev0) this.b;
                myv0 myv0Var = (myv0) this.c;
                hm5.M(obj);
                if (!(uev0Var instanceof qev0)) {
                    return uev0Var;
                }
                Function0 function0 = (Function0) obj2;
                xj61 xj61Var = new xj61();
                if (myv0Var != null) {
                    xj61Var.add(myv0Var.a);
                }
                if (myv0Var != null && myv0Var.b > ((ZonedDateTime) function0.invoke()).toEpochSecond()) {
                    xj61Var.add(myv0Var.c.a);
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                bev0 bev0Var = ((qev0) uev0Var).a;
                List list3 = bev0Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list3) {
                    if (!xj61VarJ.a.containsKey((String) obj4)) {
                        arrayList.add(obj4);
                    }
                }
                return new qev0(new bev0(o7h.d1(o7h.j0(arrayList), 4), bev0Var.b, bev0Var.c, bev0Var.d, bev0Var.e));
            case 12:
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                Logger.e(th, "%s", new Object[]{rkv0.a((ujv0) obj2)});
                return rih1Var;
            case 13:
                Throwable th2 = (Throwable) this.b;
                hm5.M(obj);
                Logger.e(th2, "%s", new Object[]{skv0.a((vjv0) obj2)});
                return rih1Var;
            case 14:
                ioj0 ioj0Var2 = (ioj0) this.b;
                olq0 olq0Var2 = (qlq0) this.c;
                hm5.M(obj);
                Set setB2 = ioj0Var2.a.b();
                int iS2 = zno1.s(q7h.U(setB2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj5 : setB2) {
                    hoj0 hoj0VarC = ioj0Var2.c(bku.class, (String) obj5);
                    if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (bkuVar = (bku) goj0VarA.a) != null) {
                        ArrayList arrayList2 = bkuVar.b;
                        if (arrayList2.isEmpty()) {
                            olq0Var = olq0.a;
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                olq0Var = olq0.a;
                            }
                            if (((zju) it2.next()).b == 3) {
                                olq0Var = olq0Var2;
                            }
                            break;
                        }
                    } else {
                        olq0Var = olq0.a;
                    }
                    linkedHashMap2.put(obj5, olq0Var);
                    break;
                }
                return new rlq0(linkedHashMap2);
            case 15:
                cxc0 cxc0Var3 = (cxc0) this.b;
                Boolean bool = (Boolean) this.c;
                hm5.M(obj);
                ih60 ih60Var = (ih60) obj2;
                dlg1 dlg1Var = (dlg1) ih60Var.f;
                lch1 lch1VarU = o4o1.u(fyo1.u(cxc0Var3));
                bool.getClass();
                if (dlg1Var.p(lch1VarU, bool.booleanValue()) && ((Boolean) ((iu30) ih60Var.g).invoke(((zb91) ih60Var.e).f(cxc0Var3.f.q))).booleanValue()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 16:
                hm5.M(obj);
                ba baVar = (sen0) this.b;
                if (((Number) baVar.j().getValue()).intValue() == 0) {
                    ((ConcurrentHashMap) ((dxy) this.c).g).remove((ga01) obj2, baVar);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Throwable th3 = (Throwable) this.b;
                hm5.M(obj);
                rq01 rq01Var = (rq01) this.c;
                dw01 dw01Var = rq01Var.a;
                oq01 oq01Var = (oq01) obj2;
                String str8 = oq01Var.d;
                boolean zContainsKey = dw01Var.b.containsKey(str8);
                String strJ = zContainsKey ? i3a.j("Recents: Failed to load fresh Recents shelf data. Error: ", th3) : i3a.j("Recents: Failed to load fresh Recents shelf data, dismissing shelf. Error: ", th3);
                Logger.d(strJ, new Object[0]);
                t2j0 t2j0Var = rq01Var.d;
                kr01 kr01VarN = RecentsDataSourceErrorEvent.n();
                kr01VarN.n(strJ);
                kr01VarN.q(str8);
                t2j0Var.a(kr01VarN.build());
                if (!zContainsKey) {
                    rq01Var.b.invoke(oq01Var.a);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Map map = (Map) this.b;
                List list4 = (List) this.c;
                hm5.M(obj);
                List<tq51> list5 = list4;
                xq51 xq51Var = (xq51) obj2;
                c9n c9nVar = xq51Var.c;
                int iS3 = zno1.s(q7h.U(list5, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                for (tq51 tq51Var : list5) {
                    n5f0 n5f0Var = tq51Var.b;
                    String str9 = tq51Var.a;
                    long j = n5f0Var.a;
                    long j2 = n5f0Var.b;
                    uq51 uq51Var = (uq51) map.get(str9);
                    xq51 xq51Var2 = xq51Var;
                    if (uq51Var != null && tve1.b(uq51Var.a, j) && tve1.b(uq51Var.b, j2)) {
                        mmr0Var = new mmr0(str9, uq51Var);
                        xq51Var = xq51Var2;
                    } else {
                        boolean z4 = tq51Var.c;
                        sua suaVar = ey71.a;
                        if (z4) {
                            xq51Var = xq51Var2;
                            ve01VarR = d5p1.r(xq51Var.a.h(xq51Var.b, p7h.M(new tve1[]{new tve1(j), new tve1(j2)})), c9nVar, suaVar, 1);
                        } else {
                            xq51Var = xq51Var2;
                            ve01VarR = d5p1.r(new huz(p7h.M(new vve1[]{new vve1(j), new vve1(j2)}), (byte) 10), c9nVar, suaVar, 1);
                        }
                        mmr0Var = new mmr0(str9, new uq51(j, j2, ve01VarR));
                    }
                    linkedHashMap3.put(mmr0Var.a, mmr0Var.b);
                }
                return linkedHashMap3;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                bbz0 bbz0Var = (bbz0) this.b;
                List list6 = (List) this.c;
                hm5.M(obj);
                if (!bbz0Var.k.isEmpty()) {
                    List list7 = list6;
                    ju51 ju51Var = (ju51) obj2;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        Iterator it3 = list7.iterator();
                        while (it3.hasNext()) {
                            if (ju51Var.h.b(bbz0Var, (String) it3.next())) {
                                z3 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Throwable th4 = (Throwable) this.b;
                hm5.M(obj);
                if (!(th4 instanceof TimeoutCancellationException)) {
                    throw th4;
                }
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = vw51.g;
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Throwable th5 = (Throwable) this.b;
                hm5.M(obj);
                Context context = ((no5) this.c).a;
                jp61 jp61Var = (jp61) obj2;
                jgb1 jgb1Var = jp61Var.b;
                String resourceName = jgb1Var.d;
                if (resourceName == null) {
                    Integer num2 = jgb1Var.c;
                    resourceName = num2 != null ? context.getResources().getResourceName(num2.intValue()) : null;
                }
                Integer num3 = jgb1Var.f;
                throw new meh(rc11.a.b(jp61Var.c.getClass()).r() + "(title=" + resourceName + ", description=" + (num3 != null ? context.getResources().getResourceName(num3.intValue()) : null) + "])", th5);
            case 22:
                iix0 iix0Var = (iix0) this.b;
                PlayerState playerState = (PlayerState) this.c;
                hm5.M(obj);
                playerState.getClass();
                String str10 = ((m081) obj2).d;
                if (playerState.isPlaying()) {
                    if (!u890.j(playerState.contextUri(), str10)) {
                        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                        if (!u890.j(contextTrack != null ? contextTrack.uri() : null, str10)) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new h081(new j081(z2, !playerState.isPaused()), new b081((iix0Var instanceof gix0) || iix0Var.g()), iix0Var);
            case 23:
                dd81 dd81Var = (dd81) this.b;
                wv00 wv00Var = (uv00) this.c;
                hm5.M(obj);
                String str11 = ((id81) obj2).i;
                tv00 tv00VarA = wv00Var.a(pjw0.class, str11);
                tv00 tv00VarA2 = wv00Var.a(nbw0.class, str11);
                int i = tv00VarA.c.b;
                return new dd81(i == 2 ? (pjw0) tv00VarA.b : dd81Var.a, tv00VarA2.c.b == 2 ? (nbw0) tv00VarA2.b : dd81Var.b, dd81Var.c || !wv00Var.f || i == 2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                jo70 jo70Var = (jo70) this.b;
                xkk1 xkk1Var = (xkk1) this.c;
                hm5.M(obj);
                return new n7a1((String) obj2, jo70Var, xkk1Var);
            case 25:
                yvg1 yvg1Var = (yvg1) this.b;
                xca1 xca1Var = (xca1) this.c;
                hm5.M(obj);
                return ((pda1) obj2).g(xca1Var instanceof wca1 ? ((Boolean) yvg1Var.a).booleanValue() ? 2 : 1 : 3);
            case 26:
                mx0 mx0Var = (px0) this.b;
                ContextTrack contextTrack2 = (ContextTrack) this.c;
                hm5.M(obj);
                if (mx0Var instanceof mx0) {
                    queryParameter = mx0Var.a;
                } else if (!(mx0Var instanceof nx0) && !u890.j(mx0Var, ox0.a)) {
                    eg.o();
                    return null;
                }
                return new mmr0(queryParameter, contextTrack2);
            case 27:
                nwb1 nwb1Var = (nwb1) this.b;
                String str12 = (String) this.c;
                hm5.M(obj);
                if (str12.length() <= 0) {
                    return nwb1Var;
                }
                se11 se11Var = ayb1.l;
                ((ayb1) obj2).getClass();
                List<mwb1> list8 = nwb1Var.a;
                ArrayList arrayList3 = new ArrayList();
                for (mwb1 mwb1Var : list8) {
                    List list9 = mwb1Var.c;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list9) {
                        if (((rvb1) obj6).e.contains(str12)) {
                            arrayList4.add(obj6);
                        }
                    }
                    mwb1 mwb1Var2 = new mwb1(mwb1Var.a, arrayList4, mwb1Var.b);
                    if (arrayList4.isEmpty()) {
                        mwb1Var2 = null;
                    }
                    if (mwb1Var2 != null) {
                        arrayList3.add(mwb1Var2);
                    }
                }
                return nwb1.a(nwb1Var, arrayList3, null, 6);
            case 28:
                List list10 = (List) this.b;
                vab0 vab0Var = (vab0) this.c;
                hm5.M(obj);
                queryParameter = vab0Var != null ? vab0Var.b : null;
                List<vab0> list11 = list10;
                ArrayList arrayList5 = new ArrayList(q7h.U(list11, 10));
                for (vab0 vab0Var2 : list11) {
                    arrayList5.add(new asc1(vab0Var2.d ? 2 : 1, vab0Var2.a, vab0Var2.b, vab0Var2.c));
                }
                return new bsc1(queryParameter, arrayList5);
            default:
                qxc0 qxc0Var = (qxc0) this.b;
                Boolean bool2 = (Boolean) this.c;
                hm5.M(obj);
                dlg1 dlg1Var2 = ((buc1) obj2).d;
                lch1 lch1VarU2 = o4o1.u(qxc0Var);
                bool2.getClass();
                if (!bool2.booleanValue() && lch1VarU2.f && lch1VarU2.a.contains("UPDATE_PROMPT") && lch1VarU2.b && dlg1Var2.q(zbh1.b) && (lch1VarU2.g == 0 || lch1VarU2.h.contains(dlc0Var) || !((zb91) dlg1Var2.a).f(lch1VarU2.i).isEmpty())) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwf0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwf0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
