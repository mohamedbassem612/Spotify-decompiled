package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class si61 {
    public static final ri61 Companion = new ri61();
    public static final znb0[] e = {null, null, dm5.S(2, w661.h)};
    public final ga61 a;
    public final String b;
    public final List c;
    public final int d;

    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    public si61(int i, ga61 ga61Var, String str, List list) {
        String str2;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = ga61Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
            str = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        int i2 = 0;
        if (str != null) {
            for (int i3 : l1d.H(21)) {
                switch (i3) {
                    case 1:
                        str2 = "UNKNOWN_UPDATE_TYPE";
                        break;
                    case 2:
                        str2 = "NEW_SESSION";
                        break;
                    case 3:
                        str2 = "USER_JOINED";
                        break;
                    case 4:
                        str2 = "USER_LEFT";
                        break;
                    case 5:
                        str2 = "SESSION_DELETED";
                        break;
                    case 6:
                        str2 = "YOU_LEFT";
                        break;
                    case 7:
                        str2 = "YOU_WERE_KICKED";
                        break;
                    case 8:
                        str2 = "YOU_JOINED";
                        break;
                    case 9:
                        str2 = "PARTICIPANT_PROMOTED_TO_HOST";
                        break;
                    case 10:
                        str2 = "DISCOVERABILITY_CHANGED";
                        break;
                    case 11:
                        str2 = "USER_KICKED";
                        break;
                    case 12:
                        str2 = "VOLUME_CONTROL_PERMISSIONS_CHANGED";
                        break;
                    case 13:
                        str2 = "QUEUE_ONLY_MODE_CONTROL_CHANGED";
                        break;
                    case 14:
                        str2 = "WIFI_BROADCAST_CHANGED";
                        break;
                    case 15:
                        str2 = "ACTIVE_DEVICE_CHANGED";
                        break;
                    case 16:
                        str2 = "QUICK_BLEND_CHANGED";
                        break;
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        str2 = "SESSION_MEMBER_UPDATED";
                        break;
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        str2 = "SESSION_ACTIVATED";
                        break;
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        str2 = "SESSION_MEMBER_PAUSE_CHANGED";
                        break;
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        str2 = "JAM_CAPPING_STATE_CHANGED";
                        break;
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        str2 = "YOU_WERE_REMOVED_UNSUPPORTED_CONTENT";
                        break;
                    default:
                        throw null;
                }
                if (str2.equalsIgnoreCase(str)) {
                    i2 = i3;
                    if (i2 == 0) {
                        i2 = 1;
                    }
                }
            }
            if (i2 == 0) {
                i2 = 1;
            }
        }
        this.d = i2;
    }

    public final int a() {
        return this.d;
    }

    public final ga61 b() {
        return this.a;
    }

    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si61)) {
            return false;
        }
        si61 si61Var = (si61) obj;
        return u890.j(this.a, si61Var.a) && u890.j(this.b, si61Var.b) && u890.j(this.c, si61Var.c);
    }

    public final int hashCode() {
        ga61 ga61Var = this.a;
        int iHashCode = (ga61Var == null ? 0 : ga61Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
