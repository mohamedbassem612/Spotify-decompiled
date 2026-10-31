package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yc2 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m441 b;

    public /* synthetic */ yc2(m441 m441Var, byte b) {
        this.a = b;
        this.b = m441Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 12;
        byte b3 = 17;
        byte b4 = 18;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        m441 m441Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = m441Var.collect(new pl1(vr20Var, (byte) 6), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = m441Var.collect(new bt9(vr20Var, (byte) 11), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = m441Var.collect(new bt9(vr20Var, (byte) 29), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = m441Var.collect(new y3e(vr20Var, (byte) 2), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = m441Var.collect(new y3e(vr20Var, (byte) 3), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = m441Var.collect(new ulm(vr20Var, (byte) 19), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = m441Var.collect(new ulm(vr20Var, (byte) 22), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = m441Var.collect(new x5s(vr20Var, (byte) 3), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = m441Var.collect(new k9t(vr20Var, b2), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = m441Var.collect(new o010(vr20Var, (byte) 10), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = m441Var.collect(new cy20(vr20Var, (byte) 5), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = m441Var.collect(new cy20(vr20Var, (byte) 14), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = m441Var.collect(new cy20(vr20Var, (byte) 28), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = m441Var.collect(new cg90(vr20Var, (byte) 13), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = m441Var.collect(new w0b0(vr20Var, b2), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = m441Var.collect(new fed0(vr20Var, b3), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = m441Var.collect(new ilf0(vr20Var, (byte) 9), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect18 = m441Var.collect(new r4t0(vr20Var, (byte) 7), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect19 = m441Var.collect(new ml21(vr20Var, (byte) 15), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect20 = m441Var.collect(new tm61(vr20Var, (byte) 16), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect21 = m441Var.collect(new tm61(vr20Var, b3), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect22 = m441Var.collect(new tm61(vr20Var, b4), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 22:
                Object objCollect23 = m441Var.collect(new ae91(vr20Var, (byte) 18), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 23:
                Object objCollect24 = m441Var.collect(new ae91(vr20Var, (byte) 19), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            default:
                Object objCollect25 = m441Var.collect(new qmd1(vr20Var, (byte) 7), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
        }
    }
}
