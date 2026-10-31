package p;

import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;
import com.spotify.blend.tastematch.GroupBlendTasteMatchFragment;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t700 implements ni30 {
    public final /* synthetic */ byte a;
    public final ynb0 b;

    public /* synthetic */ t700(ynb0 ynb0Var, byte b) {
        this.a = b;
        this.b = ynb0Var;
    }

    public final zf30 a() {
        switch (this.a) {
            case 0:
                return new s700(new nay(this, (byte) 6));
            case 1:
                return new pf10(new nay(this, (byte) 13));
            case 2:
                return new mh20(new nay(this, (byte) 15));
            case 3:
                return new u250(new nay(this, (byte) 21));
            case 4:
                return new qa50(new nay(this, (byte) 22));
            case 5:
                return new GroupBlendTasteMatchFragment(new nay(this, (byte) 23));
            case 6:
                return new li50(new nay(this, (byte) 24));
            case 7:
                return new ze70(new bf70(this, (byte) 0));
            case 8:
                return new obb0(new bf70(this, (byte) 11));
            case 9:
                return new qcb0(new bf70(this, (byte) 12));
            case 10:
                return new uyb0(new bf70(this, (byte) 13));
            case 11:
                return new wyb0(new bf70(this, (byte) 14));
            case 12:
                return new kvd0(new c8d0(this, (byte) 4));
            case 13:
                return new quf0(new c8d0(this, (byte) 10));
            case 14:
                return new kwf0(new c8d0(this, (byte) 12));
            case 15:
                return new twf0(new c8d0(this, (byte) 13));
            case 16:
                return new nlm0(new m6k0(this, (byte) 6));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new epn0(new m6k0(this, (byte) 13));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new i9o0(new m6k0(this, (byte) 15));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new fpo0(new m6k0(this, (byte) 16));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new NotificationPermissionFragment(new m6k0(this, (byte) 17));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new qvo0(new m6k0(this, (byte) 18));
            case 22:
                return new r3p0(new m6k0(this, (byte) 19));
            case 23:
                return new gxp0(new m6k0(this, (byte) 29));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new qbs0(new pjq0(this, (byte) 6));
            case 25:
                return new wts0(new pjq0(this, (byte) 10));
            case 26:
                return new y0t0(new pjq0(this, (byte) 11));
            case 27:
                return new zyt0(new pjq0(this, (byte) 15));
            case 28:
                return new z2v0(new pjq0(this, (byte) 18));
            default:
                return new g7v0(new pjq0(this, (byte) 20));
        }
    }
}
