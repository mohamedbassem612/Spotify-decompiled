package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Set;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sii0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sii0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws AbortFlowException {
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 16;
        byte b4 = 2;
        byte b5 = 15;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((ezc) obj2).collect(new ygi0(vr20Var, (r8s) obj, b4), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((zx60) obj2).collect(new buc0(vr20Var, (String) obj, (byte) 6), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((mr20) obj2).collect(new xtj0(b2, (yy1) obj, vr20Var), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((ezc) obj2).collect(new ygi0(vr20Var, (exj0) obj, (byte) 3), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((ezc) obj2).collect(new ygi0(vr20Var, (jbk0) obj, b2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((k6e0) obj2).collect(new dgk0((byte) 17, (fum0) obj, vr20Var), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((mr20) obj2).collect(new ygi0(vr20Var, (qxm0) obj, (byte) 9), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((k6e0) obj2).collect(new dgk0((byte) 23, (yg7) obj, vr20Var), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((nwd) obj2).collect(new ygi0(vr20Var, (q0o1) obj, (byte) 10), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((zob1) obj2).collect(new ygi0(vr20Var, (ntn0) obj, (byte) 13), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((mr20) obj2).collect(new ygi0(vr20Var, (bnj0) obj, b5), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = ((kge) obj2).collect(new mcn0(vr20Var, (km0) obj), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ((mr20) obj2).collect(new ygi0(vr20Var, (g2z) obj, b3), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = ((mr20) obj2).collect(new ygi0(vr20Var, (o0p0) obj, (byte) 18), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = ((mr20) obj2).collect(new ygi0(vr20Var, (l4p0) obj, (byte) 20), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = ((wt20) obj2).collect(new g6p0(vr20Var, (poj0) obj, (byte) 0), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = ((sii0) obj2).collect(new g6p0(vr20Var, (poj0) obj, (byte) 1), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect18 = ((ir9) obj2).collect(new ygi0(vr20Var, (svh0) obj, (byte) 22), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect19 = ((mr20) obj2).collect(new ygi0(vr20Var, (uqg) obj, (byte) 25), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect20 = ((mnc0) obj2).collect(new nw9(vr20Var, (Set) obj, b3), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect21 = ((ht20) obj2).collect(new jsp0(vr20Var, (nsp0) obj, (byte) 0), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect22 = ((ezc) obj2).collect(new mib(vr20Var, (nsp0) obj, (byte) 15), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 22:
                mr20[] mr20VarArr = (mr20[]) obj2;
                Object objS = fc11.s(new b69(mr20VarArr, (byte) 15), lnmVar, vr20Var, new t4o0((lnm) null, obj, (byte) 7), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case 23:
                Object objCollect23 = ((mr20) obj2).collect(new jsp0(vr20Var, (nsp0) obj, (byte) 1), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objCollect24 = ((mr20) obj2).collect(new ygi0(vr20Var, (itp0) obj, (byte) 26), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 25:
                Object objCollect25 = ((ezc) obj2).collect(new ygi0(vr20Var, (qtp0) obj, (byte) 27), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 26:
                Object objCollect26 = ((mr20) obj2).collect(new ygi0(vr20Var, (wtp0) obj, (byte) 28), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 27:
                Object objCollect27 = ((ezc) obj2).collect(new ygi0(vr20Var, (drj0) obj, (byte) 29), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
            case 28:
                Object objCollect28 = ((ht20) obj2).collect(new s4q0(vr20Var, (u4q0) obj, (byte) 0), lnmVar);
                return objCollect28 == d9nVar ? objCollect28 : rih1Var;
            default:
                Object objCollect29 = ((xs4) obj2).collect(new s4q0(vr20Var, (sjq0) obj, (byte) 2), lnmVar);
                return objCollect29 == d9nVar ? objCollect29 : rih1Var;
        }
    }
}
