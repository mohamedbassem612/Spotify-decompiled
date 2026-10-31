package p;

import com.spotify.playlistediting.history.apiimpl.proto.HistoryEntry;
import com.spotify.playlistediting.history.apiimpl.proto.ListHistoryEntriesRequest;
import com.spotify.playlistediting.history.apiimpl.proto.ListHistoryEntriesResponse;
import com.spotify.playlistediting.history.apiimpl.proto.RestoreToEntryRequest;
import j$.util.Base64;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class umu0 {
    public final tgy a;

    public umu0(tgy tgyVar) {
        this.a = tgyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        smu0 smu0Var;
        if (onmVar instanceof smu0) {
            smu0Var = (smu0) onmVar;
            int i = smu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                smu0Var.c = i - Integer.MIN_VALUE;
            } else {
                smu0Var = new smu0(this, onmVar);
            }
        } else {
            smu0Var = new smu0(this, onmVar);
        }
        Object objB = smu0Var.a;
        int i2 = smu0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                tuc0 tuc0VarN = ListHistoryEntriesRequest.n();
                tuc0VarN.n(str);
                tuc0VarN.q();
                tgy tgyVar = this.a;
                ListHistoryEntriesRequest listHistoryEntriesRequest = (ListHistoryEntriesRequest) tuc0VarN.build();
                smu0Var.c = 1;
                objB = tgyVar.b(listHistoryEntriesRequest, smu0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            ListHistoryEntriesResponse listHistoryEntriesResponse = (ListHistoryEntriesResponse) objB;
            h290 h290VarN = listHistoryEntriesResponse.n();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj : h290VarN) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                HistoryEntry historyEntry = (HistoryEntry) obj;
                historyEntry.getClass();
                sj60 sj60VarW = k5p1.w(historyEntry, i3 == 0);
                if (sj60VarW != null) {
                    arrayList.add(sj60VarW);
                }
                i3 = i4;
            }
            return new vj60(arrayList, (!listHistoryEntriesResponse.r() || listHistoryEntriesResponse.p().isEmpty()) ? null : Base64.getUrlEncoder().withoutPadding().encodeToString(listHistoryEntriesResponse.p().t()), listHistoryEntriesResponse.o(), listHistoryEntriesResponse.q().o().p() ? new Integer(listHistoryEntriesResponse.q().o().o()) : null);
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        tmu0 tmu0Var;
        if (onmVar instanceof tmu0) {
            tmu0Var = (tmu0) onmVar;
            int i = tmu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmu0Var.c = i - Integer.MIN_VALUE;
            } else {
                tmu0Var = new tmu0(this, onmVar);
            }
        } else {
            tmu0Var = new tmu0(this, onmVar);
        }
        Object obj = tmu0Var.a;
        int i2 = tmu0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                byte[] bArrDecode = Base64.getUrlDecoder().decode(str2);
                hhc hhcVar = phc.b;
                hhc hhcVarE = phc.e(0, bArrDecode, bArrDecode.length);
                c031 c031VarN = RestoreToEntryRequest.n();
                c031VarN.n(str);
                c031VarN.q(hhcVarE);
                RestoreToEntryRequest restoreToEntryRequest = (RestoreToEntryRequest) c031VarN.build();
                tgy tgyVar = this.a;
                restoreToEntryRequest.getClass();
                tmu0Var.c = 1;
                Object objA = tgyVar.a(restoreToEntryRequest, tmu0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Throwable th) {
            return new m231(th);
        }
    }
}
