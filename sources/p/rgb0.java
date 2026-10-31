package p;

import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$LastVisitedStore;
import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$UserVisits;
import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$Visits;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rgb0 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ye90 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgb0(ye90 ye90Var, String str, String str2, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.b = ye90Var;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        rgb0 rgb0Var = new rgb0(this.b, this.c, this.d, this.e, lnmVar);
        rgb0Var.a = obj;
        return rgb0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((LastVisitedProto$LastVisitedStore) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        LastVisitedProto$LastVisitedStore lastVisitedProto$LastVisitedStore = (LastVisitedProto$LastVisitedStore) this.a;
        hm5.M(obj);
        long jB = ((yqg) this.b.b).b();
        Map mapO = lastVisitedProto$LastVisitedStore.o();
        LastVisitedProto$UserVisits lastVisitedProto$UserVisitsN = LastVisitedProto$UserVisits.n();
        String str = this.c;
        LastVisitedProto$UserVisits lastVisitedProto$UserVisits = (LastVisitedProto$UserVisits) mapO.getOrDefault(str, lastVisitedProto$UserVisitsN);
        Map mapP = lastVisitedProto$UserVisits.p();
        String str2 = this.d;
        LastVisitedProto$Visits lastVisitedProto$Visits = (LastVisitedProto$Visits) mapP.get(str2);
        mma0[] mma0VarArr = sgb0.a;
        long j = this.e;
        if (lastVisitedProto$Visits == null || j > lastVisitedProto$Visits.o() || lastVisitedProto$Visits.o() > jB) {
            ngb0 ngb0VarR = LastVisitedProto$Visits.r();
            ngb0VarR.n(j);
            if (lastVisitedProto$Visits != null) {
                if (lastVisitedProto$Visits.o() >= j) {
                    lastVisitedProto$Visits = null;
                }
                if (lastVisitedProto$Visits != null) {
                    ngb0VarR.q(lastVisitedProto$Visits.o());
                }
            }
            lastVisitedProto$Visits = (LastVisitedProto$Visits) ngb0VarR.build();
        }
        jgb0 jgb0Var = (jgb0) lastVisitedProto$LastVisitedStore.toBuilder();
        lgb0 lgb0Var = (lgb0) lastVisitedProto$UserVisits.toBuilder();
        lgb0Var.r(str2, lastVisitedProto$Visits);
        jgb0Var.q(str, (LastVisitedProto$UserVisits) lgb0Var.build());
        long j2 = j - 7776000000L;
        for (Map.Entry entry : sqg0.U(jgb0Var.n()).entrySet()) {
            String str3 = (String) entry.getKey();
            LastVisitedProto$UserVisits lastVisitedProto$UserVisits2 = (LastVisitedProto$UserVisits) entry.getValue();
            Map mapP2 = lastVisitedProto$UserVisits2.p();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : mapP2.entrySet()) {
                if (((LastVisitedProto$Visits) entry2.getValue()).o() >= j2) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                jgb0Var.r(str3);
            } else if (linkedHashMap.size() != lastVisitedProto$UserVisits2.o()) {
                lgb0 lgb0Var2 = (lgb0) lastVisitedProto$UserVisits2.toBuilder();
                lgb0Var2.n();
                lgb0Var2.q(linkedHashMap);
                jgb0Var.q(str3, (LastVisitedProto$UserVisits) lgb0Var2.build());
            }
        }
        return jgb0Var.build();
    }
}
