package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class z3m0 {
    public static int a(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "error";
        }
        if (i == 2) {
            return "loaded";
        }
        if (i == 3) {
            return "loading";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "asset_load_failure";
            case 2:
                return "content_parse_error";
            case 3:
                return "network_error";
            case 4:
                return "server_error";
            case 5:
                return "story_ineligible";
            case 6:
                return "timeout";
            case 7:
                return "unknown";
            case 8:
                return "wrapped_ineligible";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "older";
        }
        if (i == 2) {
            return "same_age";
        }
        if (i == 3) {
            return "younger";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "identity";
        }
        if (i == 2) {
            return "top_moments";
        }
        if (i == 3) {
            return "year_in_music";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "album_cover";
            case 2:
                return "album_row";
            case 3:
                return "genre";
            case 4:
                return "playlist_cover";
            case 5:
                return "playlist_row";
            case 6:
                return "track_cover";
            case 7:
                return "track_row";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "brand";
            case 2:
                return "honorable_mention";
            case 3:
                return "rank_1";
            case 4:
                return "rank_2";
            case 5:
                return "rank_3";
            case 6:
                return "rank_4";
            case 7:
                return "rank_5";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "non_social";
        }
        if (i == 2) {
            return "social";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "new_story";
        }
        if (i == 2) {
            return "tap_to_play";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "not_saved";
        }
        if (i == 2) {
            return "saved";
        }
        throw null;
    }
}
