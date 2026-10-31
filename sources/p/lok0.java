package p;

import android.graphics.Color;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.SleepTimer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lok0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lok0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                lok0 lok0Var = new lok0((int) b2, (lnm) obj3, (byte) 0);
                lok0Var.b = (iok0) obj;
                lok0Var.c = (jok0) obj2;
                return lok0Var.invokeSuspend(rih1Var);
            case 1:
                lok0 lok0Var2 = new lok0((int) b2, (lnm) obj3, (byte) 1);
                lok0Var2.b = (List) obj;
                lok0Var2.c = (glm0) obj2;
                return lok0Var2.invokeSuspend(rih1Var);
            case 2:
                lok0 lok0Var3 = new lok0((int) b2, (lnm) obj3, (byte) 2);
                lok0Var3.b = (ssn0) obj;
                lok0Var3.c = (ssn0) obj2;
                return lok0Var3.invokeSuspend(rih1Var);
            case 3:
                lok0 lok0Var4 = new lok0(b2, (lnm) obj3, b2);
                lok0Var4.b = (nbm) obj;
                lok0Var4.c = (gkj1) obj2;
                return lok0Var4.invokeSuspend(rih1Var);
            case 4:
                lok0 lok0Var5 = new lok0((int) b2, (lnm) obj3, (byte) 4);
                lok0Var5.b = (qan0) obj;
                lok0Var5.c = (y2u0) obj2;
                return lok0Var5.invokeSuspend(rih1Var);
            case 5:
                lok0 lok0Var6 = new lok0((int) b2, (lnm) obj3, (byte) 5);
                lok0Var6.b = (vlo0) obj;
                lok0Var6.c = (boo0) obj2;
                return lok0Var6.invokeSuspend(rih1Var);
            case 6:
                lok0 lok0Var7 = new lok0((int) b2, (lnm) obj3, (byte) 6);
                lok0Var7.b = (os60) obj;
                lok0Var7.c = (ContextTrack) obj2;
                return lok0Var7.invokeSuspend(rih1Var);
            case 7:
                lok0 lok0Var8 = new lok0(this.c, (lnm) obj3, (byte) 7);
                lok0Var8.b = (tv80) obj2;
                lok0Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                lok0 lok0Var9 = new lok0((int) b2, (lnm) obj3, (byte) 8);
                lok0Var9.b = (vir0) obj;
                lok0Var9.c = (w8c0) obj2;
                return lok0Var9.invokeSuspend(rih1Var);
            case 9:
                lok0 lok0Var10 = new lok0((int) b2, (lnm) obj3, (byte) 9);
                lok0Var10.b = (ajc1) obj;
                lok0Var10.c = (o5e0) obj2;
                return lok0Var10.invokeSuspend(rih1Var);
            case 10:
                lok0 lok0Var11 = new lok0((int) b2, (lnm) obj3, (byte) 10);
                lok0Var11.b = (x8b0) obj;
                lok0Var11.c = (rnc0) obj2;
                return lok0Var11.invokeSuspend(rih1Var);
            case 11:
                lok0 lok0Var12 = new lok0((int) b2, (lnm) obj3, (byte) 11);
                lok0Var12.b = (SleepTimer) obj;
                lok0Var12.c = (Boolean) obj2;
                return lok0Var12.invokeSuspend(rih1Var);
            case 12:
                lok0 lok0Var13 = new lok0(this.c, (lnm) obj3, (byte) 12);
                lok0Var13.b = (Throwable) obj2;
                lok0Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                lok0 lok0Var14 = new lok0((int) b2, (lnm) obj3, (byte) 13);
                lok0Var14.b = (sv21) obj;
                lok0Var14.c = (k1r) obj2;
                return lok0Var14.invokeSuspend(rih1Var);
            case 14:
                lok0 lok0Var15 = new lok0(this.c, (lnm) obj3, (byte) 14);
                lok0Var15.b = (Throwable) obj2;
                lok0Var15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                lok0 lok0Var16 = new lok0(this.c, (lnm) obj3, (byte) 15);
                lok0Var16.b = (Throwable) obj2;
                lok0Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                lok0 lok0Var17 = new lok0((int) b2, (lnm) obj3, (byte) 16);
                lok0Var17.b = (yvg1) obj;
                lok0Var17.c = (Boolean) obj2;
                return lok0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                lok0 lok0Var18 = new lok0(this.c, (lnm) obj3, (byte) 17);
                lok0Var18.b = (PlayerState) obj;
                return lok0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                lok0 lok0Var19 = new lok0((int) b2, (lnm) obj3, (byte) 18);
                lok0Var19.b = (fw8) obj;
                lok0Var19.c = (o091) obj2;
                return lok0Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                lok0 lok0Var20 = new lok0((int) b2, (lnm) obj3, (byte) 19);
                lok0Var20.b = (pox0) obj;
                lok0Var20.c = (PlayerState) obj2;
                return lok0Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                lok0 lok0Var21 = new lok0((int) b2, (lnm) obj3, (byte) 20);
                lok0Var21.b = (cxc0) obj;
                lok0Var21.c = (g3d0) obj2;
                return lok0Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                lok0 lok0Var22 = new lok0((int) b2, (lnm) obj3, (byte) 21);
                lok0Var22.b = (fo01) obj;
                lok0Var22.c = (mmw0) obj2;
                return lok0Var22.invokeSuspend(rih1Var);
            case 22:
                lok0 lok0Var23 = new lok0((int) b2, (lnm) obj3, (byte) 22);
                lok0Var23.b = (List) obj;
                lok0Var23.c = (Boolean) obj2;
                return lok0Var23.invokeSuspend(rih1Var);
            case 23:
                lok0 lok0Var24 = new lok0(this.c, (lnm) obj3, (byte) 23);
                lok0Var24.b = (tqw) obj2;
                lok0Var24.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                lok0 lok0Var25 = new lok0((int) b2, (lnm) obj3, (byte) 24);
                lok0Var25.b = (b911) obj;
                lok0Var25.c = (pp90) obj2;
                return lok0Var25.invokeSuspend(rih1Var);
            case 25:
                lok0 lok0Var26 = new lok0(this.c, (lnm) obj3, (byte) 25);
                lok0Var26.b = (tv80) obj2;
                lok0Var26.invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                lok0 lok0Var27 = new lok0((int) b2, (lnm) obj3, (byte) 26);
                lok0Var27.b = (i091) obj;
                lok0Var27.c = (ku31) obj2;
                return lok0Var27.invokeSuspend(rih1Var);
            case 27:
                lok0 lok0Var28 = new lok0((int) b2, (lnm) obj3, (byte) 27);
                lok0Var28.b = (ou41) obj;
                lok0Var28.c = (rm51) obj2;
                return lok0Var28.invokeSuspend(rih1Var);
            case 28:
                lok0 lok0Var29 = new lok0(this.c, (lnm) obj3, (byte) 28);
                lok0Var29.b = (so51) obj;
                lok0Var29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                lok0 lok0Var30 = new lok0((int) b2, (lnm) obj3, (byte) 29);
                lok0Var30.b = (Set) obj;
                lok0Var30.c = (Set) obj2;
                return lok0Var30.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        cio arrayList;
        cio cioVarSingletonList;
        cio cioVarSingletonList2;
        List listSingletonList;
        int iOrdinal;
        int iJ;
        int color;
        boolean z;
        byte b = this.a;
        cio cioVar = z6x.a;
        int i = 0;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        rih1 rih1Var = rih1.a;
        cio cioVarUri = null;
        switch (b) {
            case 0:
                iok0 iok0Var = (iok0) this.b;
                jok0 jok0Var = (jok0) this.c;
                hm5.M(obj);
                return new kok0(iok0Var, jok0Var);
            case 1:
                List list = (List) this.b;
                elm0 elm0Var = (glm0) this.c;
                hm5.M(obj);
                elm0 elm0Var2 = elm0Var instanceof elm0 ? elm0Var : null;
                if (elm0Var2 != null) {
                    ArrayList<zkm0> arrayList2 = elm0Var2.a;
                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                    for (zkm0 zkm0Var : arrayList2) {
                        kjd1 kjd1Var = new kjd1(zkm0Var.a, zkm0Var.b);
                        arrayList.add(new h8k1(kjd1Var, kjd1Var));
                    }
                } else {
                    arrayList = cioVar;
                }
                h8k1 h8k1Var = (h8k1) o7h.s0(list);
                tjd1 tjd1Var = h8k1Var != null ? (tjd1) h8k1Var.a : null;
                ljd1 ljd1Var = tjd1Var instanceof ljd1 ? (ljd1) tjd1Var : null;
                String str = ljd1Var != null ? ljd1Var.c : null;
                List list2 = list;
                if (list2.isEmpty() || str == null) {
                    cioVarSingletonList = cioVar;
                } else {
                    mjd1 mjd1Var = new mjd1(str);
                    cioVarSingletonList = Collections.singletonList(new h8k1(mjd1Var, mjd1Var));
                }
                if (list2.isEmpty() || ((Collection) arrayList).isEmpty()) {
                    cioVarSingletonList2 = cioVar;
                } else {
                    jjd1 jjd1Var = jjd1.a;
                    cioVarSingletonList2 = Collections.singletonList(new h8k1(jjd1Var, jjd1Var));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (Iterable) arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    h8k1 h8k1Var2 = (h8k1) obj2;
                    if (i > 0) {
                        gjd1 gjd1Var = gjd1.a;
                        listSingletonList = p7h.M(new h8k1[]{new h8k1(gjd1Var, gjd1Var), h8k1Var2});
                    } else {
                        listSingletonList = Collections.singletonList(h8k1Var2);
                    }
                    r7h.W(listSingletonList, arrayList3);
                    i = i2;
                }
                ArrayList arrayListN0 = o7h.N0(arrayList3, o7h.N0((Iterable) cioVarSingletonList2, o7h.N0(list, (Collection) cioVarSingletonList)));
                if (!arrayListN0.isEmpty()) {
                    return arrayListN0;
                }
                if (elm0Var instanceof flm0) {
                    return cioVar;
                }
                if (elm0Var instanceof dlm0) {
                    ijd1 ijd1Var = ijd1.a;
                    return Collections.singletonList(new h8k1(ijd1Var, ijd1Var));
                }
                hjd1 hjd1Var = hjd1.a;
                return Collections.singletonList(new h8k1(hjd1Var, hjd1Var));
            case 2:
                ssn0 ssn0Var = (ssn0) this.b;
                ssn0 ssn0Var2 = (ssn0) this.c;
                hm5.M(obj);
                return ssn0Var2.a != null ? ssn0Var2 : new ssn0(ssn0Var.a, ssn0Var2.b, ssn0Var2.c);
            case 3:
                lbm lbmVar = (nbm) this.b;
                gkj1 gkj1Var = (gkj1) this.c;
                hm5.M(obj);
                if (!(lbmVar instanceof lbm) || !lbmVar.a || (iOrdinal = gkj1Var.ordinal()) == 0) {
                    return f8n0.a;
                }
                if (iOrdinal == 1) {
                    return e8n0.a;
                }
                if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                    return g8n0.a;
                }
                if (iOrdinal == 5) {
                    return h8n0.a;
                }
                eg.o();
                return null;
            case 4:
                qan0 qan0Var = (qan0) this.b;
                y2u0 y2u0Var = (y2u0) this.c;
                hm5.M(obj);
                return new qan0(qan0Var.a, qan0Var.b, qan0Var.c, y2u0Var);
            case 5:
                vlo0 vlo0Var = (vlo0) this.b;
                boo0 boo0Var = (boo0) this.c;
                hm5.M(obj);
                return new w910(vlo0Var, boo0Var);
            case 6:
                os60 os60Var = (os60) this.b;
                ContextTrack contextTrack = (ContextTrack) this.c;
                hm5.M(obj);
                contextTrack.getClass();
                String strY = l4o1.y(contextTrack);
                if (strY != null) {
                    int i3 = a2p0.h;
                    try {
                        color = Color.parseColor(strY);
                    } catch (Exception unused) {
                        color = a2p0.h;
                    }
                    iJ = vno1.j(0.3f, color);
                    break;
                } else {
                    iJ = a2p0.h;
                }
                cioVarUri = os60Var != null ? os60Var.a : null;
                return cioVarUri != null ? new x1p0(cioVarUri, iJ) : w1p0.a;
            case 7:
                tv80 tv80Var = (tv80) this.b;
                hm5.M(obj);
                ((xv61) ((ytp0) this.c).c).a(rc11.a.b(bup0.class), rih1Var).a(Boolean.TRUE, Boolean.FALSE, tv80Var);
                return rih1Var;
            case 8:
                vir0 vir0Var = (vir0) this.b;
                w8c0 w8c0Var = (w8c0) this.c;
                hm5.M(obj);
                if (w8c0Var.a(w8c0.e) && j0o1.o(vir0Var, w7u0.b)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 9:
                ajc1 ajc1Var = (ajc1) this.b;
                o5e0 o5e0Var = (o5e0) this.c;
                hm5.M(obj);
                return new mmr0(ajc1Var, o5e0Var);
            case 10:
                x8b0 x8b0Var = (x8b0) this.b;
                rnc0 rnc0Var = (rnc0) this.c;
                hm5.M(obj);
                return x8b0Var.c == 0 ? new f5e0(rnc0Var) : h5e0.a;
            case 11:
                SleepTimer sleepTimer = (SleepTimer) this.b;
                Boolean bool = (Boolean) this.c;
                hm5.M(obj);
                if (bool.booleanValue()) {
                    return sleepTimer;
                }
                return null;
            case 12:
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                if (!(th instanceof CancellationException) || (th instanceof TimeoutCancellationException)) {
                    ((su01) this.c).f("network_fetch_playlists");
                }
                return rih1Var;
            case 13:
                sv21 sv21Var = (sv21) this.b;
                i1r i1rVar = (k1r) this.c;
                hm5.M(obj);
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                owc0 owc0Var = (owc0) (i1rVar2 != null ? i1rVar2.a : null);
                cioVarUri = owc0Var != null ? owc0Var.b : null;
                if (cioVarUri != null) {
                    cioVar = cioVarUri;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : (Iterable) cioVar) {
                    if (((fji0) obj3).f.b()) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((fji0) it.next()).a.b);
                }
                return new sv21(sv21Var.a, sv21Var.b, sv21Var.c, sv21Var.d, o7h.p1(arrayList5));
            case 14:
                Throwable th2 = (Throwable) this.b;
                hm5.M(obj);
                dqu0 dqu0Var = (dqu0) this.c;
                if (!dqu0Var.d()) {
                    dqu0Var.h(th2);
                }
                return rih1Var;
            case 15:
                Throwable th3 = (Throwable) this.b;
                hm5.M(obj);
                n57.t("Failed to get preinstalled app status", th3);
                return rih1Var;
            case 16:
                yvg1 yvg1Var = (yvg1) this.b;
                Boolean bool2 = (Boolean) this.c;
                hm5.M(obj);
                return new mmr0(yvg1Var, bool2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                PlayerState playerState = (PlayerState) this.b;
                hm5.M(obj);
                long jB = ((yqg) ((xmu0) this.c).c).b();
                ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                return new tgw0(((Number) playerState.position(jB).e(new Long(0L))).longValue(), contextTrack2 != null ? contextTrack2.uri() : null, playerState.isPlaying() && !playerState.isPaused(), playerState.isPaused());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                fw8 fw8Var = (fw8) this.b;
                o091 o091Var = (o091) this.c;
                hm5.M(obj);
                if (!(o091Var instanceof j091) && !(o091Var instanceof n091)) {
                    return ((o091Var instanceof k091) && (z = fw8Var.a)) ? new fw8(z, true) : fw8Var;
                }
                fw8Var.getClass();
                return new fw8(true, false);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                pox0 pox0Var = (pox0) this.b;
                PlayerState playerState2 = (PlayerState) this.c;
                hm5.M(obj);
                oox0 oox0Var = pox0Var.a;
                String strContextUri = playerState2.contextUri();
                ContextTrack contextTrack3 = (ContextTrack) playerState2.track().h();
                cioVarUri = contextTrack3 != null ? contextTrack3.uri() : null;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z3 = true;
                }
                return new ga10(oox0Var, new ykm(strContextUri, cioVarUri, z3));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                cxc0 cxc0Var = (cxc0) this.b;
                g3d0 g3d0Var = (g3d0) this.c;
                hm5.M(obj);
                String str2 = (String) cxc0Var.f.q.get("refresh_cadence");
                if (u890.j(str2, "DAILY")) {
                    cioVarUri = aio.a;
                } else if (u890.j(str2, "WEEKLY")) {
                    cioVarUri = bio.a;
                }
                return new u3y0(g3d0Var, cioVarUri);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                fo01 fo01Var = (fo01) this.b;
                mmw0 mmw0Var = (mmw0) this.c;
                hm5.M(obj);
                return new u7y0(fo01Var, mmw0Var, 0L);
            case 22:
                List list3 = (List) this.b;
                Boolean bool3 = (Boolean) this.c;
                hm5.M(obj);
                bool3.getClass();
                return new wty0(list3, bool3.booleanValue());
            case 23:
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                et90 et90Var = (et90) this.c;
                ((lzn0) et90Var.e).a("spotify:premium-destination", cvl1.d(tqwVar), (Bundle) null);
                ((los) et90Var.d).a(ixb.c);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b911 b911Var = (b911) this.b;
                pp90 pp90Var = (pp90) this.c;
                hm5.M(obj);
                return new b911(b911Var.b, pp90Var);
            case 25:
                tv80 tv80Var2 = (tv80) this.b;
                hm5.M(obj);
                ((xv61) ((kdy0) this.c).b).a(rc11.a.b(uy11.class), rih1Var).a((Object) null, new Integer(5), tv80Var2);
                return rih1Var;
            case 26:
                i091 i091Var = (i091) this.b;
                ku31 ku31Var = (ku31) this.c;
                hm5.M(obj);
                return new iu31(ku31Var, i091Var);
            case 27:
                ou41 ou41Var = (ou41) this.b;
                rm51 rm51Var = (rm51) this.c;
                hm5.M(obj);
                return new ou41(ou41Var.a, rm51Var);
            case 28:
                so51 so51Var = (so51) this.b;
                hm5.M(obj);
                kvs0 kvs0Var = ((j0a) this.c).c;
                String str3 = so51Var.a;
                if (str3 == null) {
                    str3 = "";
                }
                kvs0Var.b(jvs0.b, str3);
                return rih1Var;
            default:
                Set set = (Set) this.b;
                Set set2 = (Set) this.c;
                hm5.M(obj);
                Set set3 = set2;
                boolean z5 = !set3.isEmpty();
                boolean z6 = !set.isEmpty();
                if (!set3.isEmpty() && u890.j(set, set2)) {
                    z2 = true;
                }
                return new mt51(z5, z2, z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lok0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
