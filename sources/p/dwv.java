package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dwv implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ve01 b;

    public /* synthetic */ dwv(ve01 ve01Var, byte b) {
        this.a = b;
        this.b = ve01Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ve01 ve01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ve01Var.a.collect(new inu(vr20Var, (byte) 29), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ve01Var.a.collect(new fwv(vr20Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ve01Var.a.collect(new fwv(vr20Var, (byte) 2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ve01Var.a.collect(new fwv(vr20Var, (byte) 5), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ve01Var.a.collect(new fwv(vr20Var, (byte) 6), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ve01Var.a.collect(new fwv(vr20Var, (byte) 8), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ve01Var.a.collect(new fwv(vr20Var, (byte) 9), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ve01Var.a.collect(new fwv(vr20Var, (byte) 10), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ve01Var.a.collect(new fwv(vr20Var, (byte) 11), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ve01Var.a.collect(new o010(vr20Var, (byte) 11), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = ve01Var.a.collect(new w0b0(vr20Var, (byte) 26), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = ve01Var.a.collect(new ilf0(vr20Var, (byte) 29), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = ve01Var.a.collect(new fmh0(vr20Var, (byte) 0), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = ve01Var.a.collect(new dfu0(vr20Var, (byte) 10), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 14:
                Object objCollect15 = ve01Var.a.collect(new dfu0(vr20Var, (byte) 11), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case 15:
                Object objCollect16 = ve01Var.a.collect(new p0x0(vr20Var, (byte) 11), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 16:
                Object objCollect17 = ve01Var.a.collect(new p0x0(vr20Var, (byte) 15), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect18 = ve01Var.a.collect(new ml21(vr20Var, (byte) 10), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect19 = ve01Var.a.collect(new hu51(vr20Var, (byte) 26), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect20 = ve01Var.a.collect(new tm61(vr20Var, (byte) 28), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            default:
                Object objCollect21 = ve01Var.a.collect(new bw71(vr20Var, (byte) 5), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
        }
    }
}
