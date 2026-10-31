package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract /* synthetic */ class ab80 {
    public static int[] _values() {
        return l1d.H(5);
    }

    public static int a(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 4) {
                    return i != 5 ? 0 : 4;
                }
                return 3;
            }
        }
        return i2;
    }

    public static final String b(int i) {
        return g(i);
    }

    public static final String c(int i) {
        return j(i);
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "email";
        }
        if (i == 2) {
            return "phone_number";
        }
        if (i == 3) {
            return "invalid_email";
        }
        if (i == 4) {
            return "invalid_phone_number";
        }
        if (i == 5) {
            return "empty";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "add_artist";
            case 2:
                return "add_podcast";
            case 3:
                return "album";
            case 4:
                return "also_available_offline";
            case 5:
                return "artist";
            case 6:
                return "non_followed_artist";
            case 7:
                return "audiobook";
            case 8:
                return "author";
            case 9:
                return "concert_campaign";
            case 10:
                return "course";
            case 11:
                return "dsa_banner";
            case 12:
                return "event";
            case 13:
                return "events_hub_navigation";
            case 14:
                return "import_music";
            case 15:
                return "liked_songs";
            case 16:
                return "new_episodes";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "playlist";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "playlist_folder";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "podcast";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "prerelease";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "venue";
            case 22:
                return "your_episodes";
            case 23:
                return "unknown";
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean f(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "email";
            case 2:
                return "password";
            case 3:
                return "username";
            case 4:
                return "birth_date";
            case 5:
                return "gender";
            case 6:
                return "display_name";
            case 7:
                return "none";
            case 8:
                return "calling_code";
            case 9:
                return "phone_number";
            case 10:
                return "otp";
            case 11:
                return "naver_button";
            case 12:
                return "google_auth_button";
            case 13:
                return "third_party_data_provision_link";
            case 14:
                return "tailored_ads_link";
            case 15:
                return "personal_information_collection_link";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "airplay_speaker";
            case 2:
                return "audio_dongle";
            case 3:
                return "automobile";
            case 4:
                return "avr";
            case 5:
                return "bluetooth_headphones";
            case 6:
                return "bluetooth_car";
            case 7:
                return "bluetooth_speaker";
            case 8:
                return "bluetooth_unknown";
            case 9:
                return "cast_audio";
            case 10:
                return "cast_video";
            case 11:
                return "chromebook";
            case 12:
                return "computer";
            case 13:
                return "game_console";
            case 14:
                return "home_thing";
            case 15:
                return "smartphone";
            case 16:
                return "smartwatch";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "face_wearable";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "speaker";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "stb";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "tablet";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "tv";
            case 22:
                return "unknown";
            case 23:
                return "unknown_spotify";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "airplay";
            case 2:
                return "android_auto";
            case 3:
                return "bluetooth";
            case 4:
                return "cast";
            case 5:
                return "connect";
            case 6:
                return "self";
            case 7:
                return "wired";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "voice";
        }
        if (i == 2) {
            return "text";
        }
        throw null;
    }

    public static int k(int i, int i2, int i3) {
        return (l1d.C(i) + i2) * i3;
    }

    public static int l(afx afxVar, int i, int i2) {
        return (afxVar.hashCode() + i) * i2;
    }

    public static String m(int i, int i2, String str) {
        return i + str + i2;
    }

    public static String n(String str, String str2, int i, String str3) {
        return str + i + str2 + str3;
    }

    public static qim0 o(nim0 nim0Var, float f, x340 x340Var, nim0 nim0Var2, float f2) {
        op71.g(x340Var, u291.h(nim0Var, f));
        return u291.f(nim0Var2, f2);
    }

    public static void p(nim0 nim0Var, float f, x340 x340Var, boolean z) {
        op71.g(x340Var, u291.v(nim0Var, f));
        x340Var.r(z);
    }

    public static /* synthetic */ boolean q(saa0 saa0Var, Object obj, naa0 naa0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(saa0Var, obj, naa0Var)) {
            if (atomicReferenceFieldUpdater.get(saa0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean r(saa0 saa0Var, i980 i980Var, naa0 naa0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(saa0Var, i980Var, naa0Var)) {
            if (atomicReferenceFieldUpdater.get(saa0Var) != i980Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "COMPUTER";
            case 3:
                return "TABLET";
            case 4:
                return "SMARTPHONE";
            case 5:
                return "SPEAKER";
            case 6:
                return "HEADPHONES";
            case 7:
                return "TV";
            case 8:
                return "AVR";
            case 9:
                return "STB";
            case 10:
                return "AUDIO_DONGLE";
            case 11:
                return "GAME_CONSOLE";
            case 12:
                return "CAST_VIDEO";
            case 13:
                return "CAST_AUDIO";
            case 14:
                return "AUTOMOBILE";
            case 15:
                return "SMARTWATCH";
            case 16:
                return "CHROMEBOOK";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "UNKNOWN_SPOTIFY";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "HOME_THING";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "BLUETOOTH";
        }
        if (i == 2) {
            return "AIRPLAY";
        }
        if (i == 3) {
            return "CAST";
        }
        if (i == 4) {
            return "CONNECT";
        }
        throw null;
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "DEVICE_SPEAKER_ONLY";
        }
        if (i == 2) {
            return "LISTENING_ACTIVITY_ONLY";
        }
        if (i == 3) {
            return "MIXED";
        }
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "HOST";
        }
        if (i == 2) {
            return "PARTICIPANT";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "BAD_CONFIG";
        }
        return "OK";
    }

    public static /* synthetic */ int x(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("DEVICE_SPEAKER_ONLY")) {
            return 1;
        }
        if (str.equals("LISTENING_ACTIVITY_ONLY")) {
            return 2;
        }
        if (str.equals("MIXED")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.jam.features.jaminvitelearnmorepage.api.JamInviteLearnMorePage.PendingRequestsJoinType.".concat(str));
        return 0;
    }
}
