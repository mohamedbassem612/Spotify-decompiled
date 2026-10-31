package p;

import com.google.protobuf.Any;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Timestamp;
import com.spotify.watchfeed.api.v1.ConsumedFeedItem;
import com.spotify.watchfeed.api.v1.ConsumedGroup;
import com.spotify.watchfeed.api.v1.WatchFeedRequest;
import com.spotify.watchfeed.api.v1.a;
import com.spotify.watchfeed.api.v1.d;
import com.spotify.watchfeed.api.v1.e;
import com.spotify.watchfeed.api.v1.proto.WatchFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mjs {
    public final fbu a;
    public final n0t b;

    public mjs(fbu fbuVar, n0t n0tVar) {
        this.a = fbuVar;
        this.b = n0tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(abu abuVar, ArrayList arrayList, String str, onm onmVar) {
        ljs ljsVar;
        d dVarV;
        wt91 wt91Var;
        int i;
        wt91 dlr0Var;
        if (onmVar instanceof ljs) {
            ljsVar = (ljs) onmVar;
            int i2 = ljsVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ljsVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ljsVar = new ljs(this, onmVar);
            }
        } else {
            ljsVar = new ljs(this, onmVar);
        }
        Object obj = ljsVar.b;
        int i3 = ljsVar.d;
        wt91 wt91Var2 = null;
        s9l1 s9l1Var = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = ljsVar.a;
                hm5.M(obj);
                wt91Var = null;
            } else {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return (s9l1) obj;
        }
        hm5.M(obj);
        if (abuVar instanceof uau) {
            uau uauVar = (uau) abuVar;
            dVarV = oap1.v("album-clips", uauVar.a, uauVar.b);
        } else if (abuVar instanceof vau) {
            vau vauVar = (vau) abuVar;
            dVarV = oap1.v("artist-clips", vauVar.a, vauVar.b);
        } else if (abuVar instanceof wau) {
            dVarV = oap1.v("clip-recs", (String) null, ((wau) abuVar).a);
        } else if (abuVar instanceof yau) {
            yau yauVar = (yau) abuVar;
            dVarV = oap1.v("countdown-clips", yauVar.a, yauVar.b);
        } else if (abuVar instanceof zau) {
            zau zauVar = (zau) abuVar;
            String str2 = zauVar.a;
            dVarV = u890.j(str2, "related-clips") ? oap1.v(str2, (String) null, zauVar.b) : null;
        } else {
            if (!(abuVar instanceof xau)) {
                eg.o();
                return null;
            }
            xau xauVar = (xau) abuVar;
            dVarV = oap1.v(xauVar.a, xauVar.b, xauVar.c);
        }
        if (dVarV == null) {
            hhg1.n("Not supported type");
            return null;
        }
        int i4 = 10;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ujl ujlVar = (ujl) it.next();
            rjl rjlVarO = ConsumedGroup.o();
            rjlVarO.q(ujlVar.a);
            List<tjl> list = ujlVar.b;
            ArrayList arrayList3 = new ArrayList(q7h.U(list, i4));
            for (tjl tjlVar : list) {
                a aVarN = ConsumedFeedItem.n();
                aVarN.s(tjlVar.a);
                Long l = tjlVar.b;
                if (l != null) {
                    aVarN.n(Int64Value.p(l.longValue()));
                }
                Long l2 = tjlVar.c;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    sve1 sve1VarR = Timestamp.r();
                    sve1VarR.q(jLongValue / 1000);
                    sve1VarR.n((int) (1000000 * (jLongValue % 1000)));
                    aVarN.q((Timestamp) sve1VarR.build());
                }
                String str3 = tjlVar.d;
                if (str3 != null) {
                    aVarN.r(str3);
                }
                arrayList3.add((ConsumedFeedItem) aVarN.build());
                wt91Var2 = wt91Var2;
            }
            rjlVarO.n(arrayList3);
            arrayList2.add((ConsumedGroup) rjlVarO.build());
            i4 = 10;
        }
        wt91Var = wt91Var2;
        dVarV.n(arrayList2);
        if (str != null) {
            e eVarN = WatchFeedRequest.Pagination.n();
            byte[] bArrA = n9a.a(n9a.e, str, 0, 6);
            eVarN.n(phc.e(0, bArrA, bArrA.length));
            dVarV.t(eVarN);
        }
        WatchFeedRequest watchFeedRequest = (WatchFeedRequest) dVarV.build();
        ljsVar.a = 0;
        ljsVar.d = 1;
        Object objA = this.a.a(watchFeedRequest, ljsVar);
        if (objA != s9l1Var) {
            obj = objA;
            i = 0;
        }
        return s9l1Var;
        WatchFeedResponse watchFeedResponse = (WatchFeedResponse) obj;
        ljsVar.a = i;
        ljsVar.d = 2;
        n0t n0tVar = this.b;
        Map map = (Map) n0tVar.a.get();
        l6l1 l6l1Var = n0tVar.b;
        z0i z0iVarB = l6l1Var.b(watchFeedResponse.o());
        wt91 wt91VarB = l6l1Var.b(watchFeedResponse.v());
        wt91 wt91Var3 = wt91VarB instanceof wt91 ? wt91VarB : wt91Var;
        Any anyQ = watchFeedResponse.q();
        Object obj2 = map.get(anyQ.p());
        wt91 wt91Var4 = obj2 instanceof ibq0 ? (ibq0) obj2 : wt91Var;
        wt91 wt91Var5 = wt91Var4 != null ? (cbq0) wt91Var4.a(anyQ) : wt91Var;
        ArrayList arrayListA = l6l1Var.a((h290) watchFeedResponse.getItemsList());
        if (watchFeedResponse.w()) {
            WatchFeedResponse.Pagination paginationR = watchFeedResponse.r();
            dlr0Var = new dlr0(paginationR.r() ? n9a.c(n9a.e, paginationR.p().t()) : wt91Var, paginationR.q() ? n9a.c(n9a.e, paginationR.o().t()) : wt91Var);
        } else {
            dlr0Var = wt91Var;
        }
        h290 h290VarN = watchFeedResponse.s().n();
        s9l1 s9l1Var2 = new s9l1(z0iVarB, arrayListA, dlr0Var, watchFeedResponse.n(), h290VarN != null ? !h290VarN.isEmpty() ? new r3t0(h290VarN) : wt91Var : wt91Var, wt91Var5, wt91Var3, watchFeedResponse.p(), watchFeedResponse.u(), watchFeedResponse.t());
        if (s9l1Var2 != s9l1Var) {
            obj = s9l1Var2;
            return (s9l1) obj;
        }
        return s9l1Var;
    }
}
