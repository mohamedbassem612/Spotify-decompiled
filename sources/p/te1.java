package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class te1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ay8 b;

    public /* synthetic */ te1(ay8 ay8Var, byte b) {
        this.a = b;
        this.b = ay8Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 0;
        d9n d9nVar = d9n.a;
        ay8 ay8Var = this.b;
        switch (b) {
            case 0:
                ay8Var.collect(new mf(vr20Var, (byte) 27), lnmVar);
                break;
            case 1:
                ay8Var.collect(new pl1(vr20Var, b2), lnmVar);
                break;
            case 2:
                ay8Var.collect(new pl1(vr20Var, (byte) 20), lnmVar);
                break;
            case 3:
                ay8Var.collect(new w93(vr20Var, (byte) 8), lnmVar);
                break;
            case 4:
                ay8Var.collect(new tv5(vr20Var, (byte) 13), lnmVar);
                break;
            case 5:
                ay8Var.collect(new tv5(vr20Var, (byte) 18), lnmVar);
                break;
            case 6:
                ay8Var.collect(new tv5(vr20Var, (byte) 19), lnmVar);
                break;
            case 7:
                ay8Var.collect(new nz7(vr20Var, (byte) 22), lnmVar);
                break;
            case 8:
                ay8Var.collect(new bt9(vr20Var, (byte) 18), lnmVar);
                break;
            case 9:
                ay8Var.collect(new vnb(vr20Var, (byte) 0), lnmVar);
                break;
            case 10:
                ay8Var.collect(new y3e(vr20Var, (byte) 9), lnmVar);
                break;
            case 11:
                ay8Var.collect(new y3e(vr20Var, (byte) 10), lnmVar);
                break;
            case 12:
                ay8Var.collect(new y3e(vr20Var, (byte) 12), lnmVar);
                break;
            case 13:
                ay8Var.collect(new y3e(vr20Var, (byte) 14), lnmVar);
                break;
            case 14:
                ay8Var.collect(new y3e(vr20Var, (byte) 17), lnmVar);
                break;
            case 15:
                ay8Var.collect(new y3e(vr20Var, (byte) 18), lnmVar);
                break;
            case 16:
                ay8Var.collect(new kmf(vr20Var, (byte) 15), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ay8Var.collect(new kmf(vr20Var, (byte) 21), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ay8Var.collect(new kmf(vr20Var, (byte) 22), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ay8Var.collect(new kmf(vr20Var, (byte) 23), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ay8Var.collect(new kmf(vr20Var, (byte) 24), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ay8Var.collect(new x1h(vr20Var, (byte) 6), lnmVar);
                break;
            case 22:
                ay8Var.collect(new x1h(vr20Var, (byte) 11), lnmVar);
                break;
            case 23:
                ay8Var.collect(new ulm(vr20Var, (byte) 2), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ay8Var.collect(new ulm(vr20Var, (byte) 3), lnmVar);
                break;
            case 25:
                ay8Var.collect(new ulm(vr20Var, (byte) 12), lnmVar);
                break;
            case 26:
                ay8Var.collect(new ulm(vr20Var, (byte) 17), lnmVar);
                break;
            case 27:
                ay8Var.collect(new ulm(vr20Var, (byte) 18), lnmVar);
                break;
            case 28:
                ay8Var.collect(new ulm(vr20Var, (byte) 24), lnmVar);
                break;
            default:
                ay8Var.collect(new x5s(vr20Var, (byte) 29), lnmVar);
                break;
        }
        return d9nVar;
    }
}
