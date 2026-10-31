package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k6e0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    public /* synthetic */ k6e0(mr20 mr20Var, byte b) {
        this.a = b;
        this.b = mr20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 26;
        byte b4 = 1;
        byte b5 = 11;
        byte b6 = 16;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        m9r0 m9r0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((p1e0) m9r0Var).collect(new i2e0(vr20Var, (byte) 10), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((k6e0) m9r0Var).collect(new i2e0(vr20Var, b5), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((wzv0) m9r0Var).collect(new ilf0(vr20Var, (byte) 8), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((ir9) m9r0Var).collect(new ilf0(vr20Var, (byte) 14), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((mt) m9r0Var).collect(new fmh0(vr20Var, (byte) 15), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((s1g) m9r0Var).collect(new xtj0(vr20Var, b3), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((r6k0) m9r0Var).collect(new dgk0(vr20Var, (byte) 6), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((xs4) m9r0Var).collect(new dgk0(vr20Var, b6), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((xs4) m9r0Var).collect(new dgk0(vr20Var, (byte) 22), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((dc7) m9r0Var).collect(new dgk0(vr20Var, b2), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ((r6k0) m9r0Var).collect(new mcn0(vr20Var, b4), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = ((tf2) m9r0Var).collect(new mcn0(vr20Var, b6), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ((zx60) m9r0Var).collect(new mcn0(vr20Var, (byte) 20), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = ((r6k0) m9r0Var).collect(new mcn0(vr20Var, b2), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                ((vpg0) m9r0Var).collect(new j4p0(vr20Var, (byte) 1), lnmVar);
                return d9nVar;
            case 15:
                Object objCollect15 = ((dy20) m9r0Var).collect(new j4p0(vr20Var, (byte) 11), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 16:
                Object objCollect16 = ((uop0) m9r0Var).collect(new j4p0(vr20Var, (byte) 13), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect17 = ((huz) m9r0Var).collect(new gtp0(vr20Var, (byte) 0), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect18 = ((xr0) m9r0Var).collect(new xhr0(vr20Var, (byte) 1), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect19 = ((dy20) m9r0Var).collect(new xhr0(vr20Var, (byte) 11), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect20 = ((n5s0) m9r0Var).collect(new xhr0(vr20Var, (byte) 13), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect21 = ((xr0) m9r0Var).collect(new xhr0(vr20Var, (byte) 16), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 22:
                Object objCollect22 = ((k6e0) m9r0Var).collect(new xhr0(vr20Var, (byte) 18), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 23:
                Object objCollect23 = ((php0) m9r0Var).collect(new xhr0(vr20Var, (byte) 21), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objCollect24 = ((php0) m9r0Var).collect(new xhr0(vr20Var, (byte) 25), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 25:
                Object objCollect25 = ((php0) m9r0Var).collect(new xhr0(vr20Var, (byte) 26), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 26:
                Object objCollect26 = ((cod0) m9r0Var).collect(new r4t0(vr20Var, (byte) 13), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            case 27:
                Object objCollect27 = ((php0) m9r0Var).collect(new dfu0(vr20Var, (byte) 7), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
            case 28:
                Object objCollect28 = m9r0Var.collect(new dfu0(vr20Var, (byte) 17), lnmVar);
                return objCollect28 == d9nVar ? objCollect28 : rih1Var;
            default:
                Object objCollect29 = ((c1v0) m9r0Var).collect(new dfu0(vr20Var, (byte) 27), lnmVar);
                return objCollect29 == d9nVar ? objCollect29 : rih1Var;
        }
    }
}
