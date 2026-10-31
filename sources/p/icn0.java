package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class icn0 implements ydy0 {
    public final /* synthetic */ byte a;
    public static final icn0 b = new icn0(0);
    public static final icn0 c = new icn0(1);
    public static final icn0 d = new icn0(2);
    public static final icn0 e = new icn0(3);
    public static final icn0 f = new icn0(4);
    public static final icn0 g = new icn0(5);
    public static final icn0 h = new icn0(6);
    public static final icn0 i = new icn0(7);
    public static final icn0 t = new icn0(8);
    public static final icn0 X = new icn0(9);
    public static final icn0 Y = new icn0(10);
    public static final icn0 Z = new icn0(11);
    public static final icn0 N0 = new icn0(12);
    public static final icn0 O0 = new icn0(13);
    public static final icn0 P0 = new icn0(14);
    public static final icn0 Q0 = new icn0(15);
    public static final icn0 R0 = new icn0(16);
    public static final icn0 S0 = new icn0(17);
    public static final icn0 T0 = new icn0(18);
    public static final icn0 U0 = new icn0(19);
    public static final icn0 V0 = new icn0(20);
    public static final icn0 W0 = new icn0(21);

    public /* synthetic */ icn0(byte b2) {
        this.a = b2;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                new w65(false);
                return new w65(aey0Var.c("android-video:allow_showing_music_videos_setting", false));
            case 1:
                new ek4(false, false, false, false, false, false, false, false, (tgp0) null, (luk) null);
                return ek4.j(aey0Var);
            case 2:
                new jf4(true, true, true, false, true, true, true, false, false, false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, true, (luk) null);
                return jf4.A(aey0Var);
            case 3:
                new k35();
                return k35.c(aey0Var);
            case 4:
                new k35();
                return k35.c(aey0Var);
            case 5:
                new sp4(false, false, (luk) null);
                return new sp4(aey0Var.c("android-list-ux-platform-consumers-magpie:magpie_enabled", false), aey0Var.c("android-list-ux-platform-consumers-magpie:reasoning_enabled", false), (luk) null);
            case 6:
                new rg4(false, false, false, false, false, false, false, false, (luk) null);
                return rg4.j(aey0Var);
            case 7:
                new fj4();
                return fj4.e(aey0Var);
            case 8:
                new fj4();
                return fj4.e(aey0Var);
            case 9:
                new u35();
                return u35.l(aey0Var);
            case 10:
                new u35();
                return u35.l(aey0Var);
            case 11:
                new u35();
                return u35.l(aey0Var);
            case 12:
                new u35();
                return u35.l(aey0Var);
            case 13:
                new u35();
                return u35.l(aey0Var);
            case 14:
                new u35();
                return u35.l(aey0Var);
            case 15:
                new u35();
                return u35.l(aey0Var);
            case 16:
                new u35();
                return u35.l(aey0Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                new u35();
                return u35.l(aey0Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                new u35();
                return u35.l(aey0Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                new uh4();
                return uh4.i(aey0Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                new uh4();
                return uh4.i(aey0Var);
            default:
                new uh4();
                return uh4.i(aey0Var);
        }
    }
}
