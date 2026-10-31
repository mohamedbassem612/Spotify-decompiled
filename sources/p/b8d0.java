package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b8d0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8d0(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 0;
        byte b4 = 1;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new a8d0(vr20Var, (uqg) obj, b3), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ezcVar.collect(new a8d0(vr20Var, (gcd0) obj, b4), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((ycd0) ezcVar).collect(new hv90(vr20Var, (p811) obj, (byte) 1), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ezcVar.collect(new zdd0(vr20Var, (LinkedHashMap) obj, (byte) 0), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 3), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 4), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((m441) ezcVar).collect(new fed0(vr20Var, (vld0) obj), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((any) ezcVar).collect(new a8d0(vr20Var, (apd0) obj, b2), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((p1e0) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 10), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((p1e0) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 11), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = ((mnc0) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 12), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 13), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = ((xe01) ezcVar).a.collect(new a8d0((Object) vr20Var, obj, (byte) 14), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 16), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 17), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                ((bpb1) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 21), lnmVar);
                return d9nVar;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect17 = ((evz) ezcVar).collect(new ilf0((byte) 6, (c3g0) obj, vr20Var), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect18 = ((jge) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 22), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect19 = ((j5b0) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 23), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect20 = ezcVar.collect(new ilf0((byte) 18, (fad0) obj, vr20Var), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect21 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 26), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 22:
                Object objCollect22 = ezcVar.collect(new ilf0((byte) 20, (jqb0) obj, vr20Var), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 23:
                Object objCollect23 = ezcVar.collect(new a8d0((Object) vr20Var, obj, (byte) 28), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objCollect24 = ezcVar.collect(new ilf0((byte) 27, (xeh0) obj, vr20Var), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 25:
                Object objCollect25 = ezcVar.collect(new kqh0(vr20Var, (oqh0) obj, (byte) 0), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 26:
                Object objCollect26 = ((f8f0) ezcVar).collect(new kqh0(vr20Var, (oqh0) obj, (byte) 1), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 27:
                ((ay8) ezcVar).collect(new a8d0((Object) vr20Var, obj, (byte) 29), lnmVar);
                return d9nVar;
            case 28:
                Object objCollect27 = ezcVar.collect(new ygi0(vr20Var, (ahi0) obj, b3), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
            default:
                Object objCollect28 = ((p1e0) ezcVar).collect(new ygi0(vr20Var, (mey0) obj, b4), lnmVar);
                return objCollect28 == d9nVar ? objCollect28 : rih1Var;
        }
    }
}
