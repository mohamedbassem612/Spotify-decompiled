package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p1e0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ay8 b;

    public /* synthetic */ p1e0(ay8 ay8Var, byte b) {
        this.a = b;
        this.b = ay8Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 23;
        byte b3 = 28;
        byte b4 = 14;
        byte b5 = 24;
        byte b6 = 2;
        byte b7 = 11;
        byte b8 = 27;
        d9n d9nVar = d9n.a;
        ay8 ay8Var = this.b;
        switch (b) {
            case 0:
                ay8Var.collect(new fed0(vr20Var, b2), lnmVar);
                break;
            case 1:
                ay8Var.collect(new fed0(vr20Var, b5), lnmVar);
                break;
            case 2:
                ay8Var.collect(new fed0(vr20Var, b8), lnmVar);
                break;
            case 3:
                ay8Var.collect(new fed0(vr20Var, b3), lnmVar);
                break;
            case 4:
                ay8Var.collect(new i2e0(vr20Var, (byte) 1), lnmVar);
                break;
            case 5:
                ay8Var.collect(new i2e0(vr20Var, b6), lnmVar);
                break;
            case 6:
                ay8Var.collect(new i2e0(vr20Var, (byte) 9), lnmVar);
                break;
            case 7:
                ay8Var.collect(new i2e0(vr20Var, b4), lnmVar);
                break;
            case 8:
                ay8Var.collect(new fmh0(vr20Var, (byte) 11), lnmVar);
                break;
            case 9:
                ay8Var.collect(new fmh0(vr20Var, (byte) 16), lnmVar);
                break;
            case 10:
                ay8Var.collect(new fmh0(vr20Var, (byte) 17), lnmVar);
                break;
            case 11:
                ay8Var.collect(new fmh0(vr20Var, (byte) 18), lnmVar);
                break;
            case 12:
                ay8Var.collect(new fmh0(vr20Var, (byte) 20), lnmVar);
                break;
            case 13:
                ay8Var.collect(new fmh0(vr20Var, (byte) 21), lnmVar);
                break;
            case 14:
                ay8Var.collect(new fmh0(vr20Var, (byte) 23), lnmVar);
                break;
            case 15:
                ay8Var.collect(new fmh0(vr20Var, (byte) 28), lnmVar);
                break;
            case 16:
                ay8Var.collect(new fmh0(vr20Var, (byte) 29), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ay8Var.collect(new xtj0(vr20Var, (byte) 4), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ay8Var.collect(new xtj0(vr20Var, b4), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ay8Var.collect(new xtj0(vr20Var, (byte) 15), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ay8Var.collect(new xtj0(vr20Var, b5), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ay8Var.collect(new dgk0(vr20Var, b6), lnmVar);
                break;
            case 22:
                ay8Var.collect(new dgk0(vr20Var, (byte) 10), lnmVar);
                break;
            case 23:
                ay8Var.collect(new dgk0(vr20Var, b7), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ay8Var.collect(new dgk0(vr20Var, b8), lnmVar);
                break;
            case 25:
                ay8Var.collect(new j4p0(vr20Var, (byte) 21), lnmVar);
                break;
            case 26:
                ay8Var.collect(new j4p0(vr20Var, (byte) 26), lnmVar);
                break;
            case 27:
                ay8Var.collect(new gtp0(vr20Var, (byte) 11), lnmVar);
                break;
            case 28:
                ay8Var.collect(new p0x0(vr20Var, (byte) 18), lnmVar);
                break;
            default:
                ay8Var.collect(new p0x0(vr20Var, (byte) 27), lnmVar);
                break;
        }
        return d9nVar;
    }
}
