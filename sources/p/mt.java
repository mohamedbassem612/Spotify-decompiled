package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mt implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;

    public /* synthetic */ mt(bpb1 bpb1Var, byte b) {
        this.a = b;
        this.b = bpb1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 0;
        d9n d9nVar = d9n.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.collect(new mf(vr20Var, (byte) 4), lnmVar);
                break;
            case 1:
                bpb1Var.collect(new pl1(vr20Var, (byte) 13), lnmVar);
                break;
            case 2:
                bpb1Var.collect(new pl1(vr20Var, (byte) 22), lnmVar);
                break;
            case 3:
                bpb1Var.collect(new w93(vr20Var, b2), lnmVar);
                break;
            case 4:
                bpb1Var.collect(new tv5(vr20Var, (byte) 20), lnmVar);
                break;
            case 5:
                bpb1Var.collect(new tv5(vr20Var, (byte) 21), lnmVar);
                break;
            case 6:
                bpb1Var.collect(new vnb(vr20Var, (byte) 7), lnmVar);
                break;
            case 7:
                bpb1Var.collect(new ulm(vr20Var, (byte) 28), lnmVar);
                break;
            case 8:
                bpb1Var.collect(new rir(vr20Var, (byte) 9), lnmVar);
                break;
            case 9:
                bpb1Var.collect(new x5s(vr20Var, (byte) 0), lnmVar);
                break;
            case 10:
                bpb1Var.collect(new fwv(vr20Var, (byte) 27), lnmVar);
                break;
            case 11:
                bpb1Var.collect(new w0x(vr20Var, (byte) 0), lnmVar);
                break;
            case 12:
                bpb1Var.collect(new o010(vr20Var, (byte) 16), lnmVar);
                break;
            case 13:
                bpb1Var.collect(new o010(vr20Var, (byte) 18), lnmVar);
                break;
            case 14:
                bpb1Var.collect(new cy20(vr20Var, (byte) 7), lnmVar);
                break;
            case 15:
                bpb1Var.collect(new cy20(vr20Var, (byte) 27), lnmVar);
                break;
            case 16:
                bpb1Var.collect(new uk50(vr20Var, (byte) 9), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bpb1Var.collect(new uk50(vr20Var, (byte) 14), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                bpb1Var.collect(new w0b0(vr20Var, (byte) 3), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                bpb1Var.collect(new ilf0(vr20Var, (byte) 2), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                bpb1Var.collect(new fmh0(vr20Var, (byte) 14), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                bpb1Var.collect(new gtp0(vr20Var, (byte) 21), lnmVar);
                break;
            case 22:
                bpb1Var.collect(new r4t0(vr20Var, (byte) 0), lnmVar);
                break;
            case 23:
                bpb1Var.collect(new r4t0(vr20Var, (byte) 19), lnmVar);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                bpb1Var.collect(new g6z0(vr20Var, (byte) 19), lnmVar);
                break;
            case 25:
                bpb1Var.collect(new wl01(vr20Var, b3), lnmVar);
                break;
            case 26:
                bpb1Var.collect(new wl01(vr20Var, (byte) 23), lnmVar);
                break;
            case 27:
                bpb1Var.collect(new ml21(vr20Var, (byte) 0), lnmVar);
                break;
            case 28:
                bpb1Var.collect(new hu51(vr20Var, (byte) 8), lnmVar);
                break;
            default:
                bpb1Var.collect(new qmd1(vr20Var, (byte) 12), lnmVar);
                break;
        }
        return d9nVar;
    }
}
