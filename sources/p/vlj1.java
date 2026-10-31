package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vlj1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vlj1(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws AbortFlowException {
        byte b = this.a;
        byte b2 = 26;
        byte b3 = 24;
        byte b4 = 2;
        byte b5 = 25;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new qzh1(b2, (amj1) obj, vr20Var), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ezcVar.collect(new zmj1((byte) 2, (qu2) obj, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((evz) ezcVar).collect(new zmj1((byte) 3, (qu2) obj, vr20Var), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ezcVar.collect(new i6e1(vr20Var, (hij1) obj, (byte) 24), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((xe01) ezcVar).a.collect(new i6e1(vr20Var, (hak1) obj, (byte) 25), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((xe01) ezcVar).a.collect(new i6e1(vr20Var, (pm70) obj, (byte) 26), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((xe01) ezcVar).a.collect(new i6e1(vr20Var, (pm70) obj, (byte) 28), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((wt20) ezcVar).collect(new zmj1((byte) 16, (rb3) obj, vr20Var), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((xkb1) ezcVar).collect(new ru11(vr20Var, (String) obj, b3), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ezcVar.collect(new wtl1(vr20Var, (aek1) obj, (byte) 0), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((evz) ezcVar).collect(new wtl1(vr20Var, (rzl1) obj, b4), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = ezcVar.collect(new wtl1(vr20Var, (bek1) obj, (byte) 4), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ezcVar.collect(new wtl1(vr20Var, (bek1) obj, (byte) 5), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = ((any) ezcVar).collect(new lpl1(vr20Var, (vbe1) obj), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = ((any) ezcVar).collect(new wtl1(vr20Var, (k5m1) obj, (byte) 6), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = ((any) ezcVar).collect(new wtl1(vr20Var, (w5m1) obj, (byte) 7), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = ezcVar.collect(new wtl1(vr20Var, (nfa0) obj, (byte) 8), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect18 = ((any) ezcVar).collect(new wtl1(vr20Var, (frl1) obj, (byte) 9), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect19 = ((kge) ezcVar).collect(new wtl1(vr20Var, (frl1) obj, (byte) 10), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect20 = ((lt20) ezcVar).collect(new mib(vr20Var, (ArrayList) obj, (byte) 22), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect21 = ((xe01) ezcVar).a.collect(new nw9(vr20Var, (Set) obj, b5), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect22 = ezcVar.collect(new wtl1(vr20Var, (lym1) obj, (byte) 11), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            default:
                Object objCollect23 = ezcVar.collect(new wtl1(vr20Var, (jcd0) obj, (byte) 12), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
        }
    }
}
