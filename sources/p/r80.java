package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r80 {
    public static final /* synthetic */ r80[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    r80 EF5;

    static {
        r80[] r80VarArr = {new r80("URL", 0), new r80("PDP_URL", 1), new r80("INTERNAL_WEBVIEW", 2), new r80("EXTERNAL_URL", 3), new r80("IAP", 4), new r80("DISMISS", 5), new r80("EMAIL_VERIFICATION", 6), new r80("ADD_TO_PLAYLIST", 7), new r80("CREATE_PLAYLIST", 8), new r80("SAVE_AND_NAVIGATE", 9), new r80("SAVE_ENTITY", 10), new r80("START_PLAYBACK", 11), new r80("SELECT_OPTION", 12), new r80("TOGGLE_NOTIFICATION_PREFERENCE", 13), new r80("ENABLE_ALL_NOTIFICATION_PREFERENCE_CATEGORIES", 14), new r80("URL_V2", 15), new r80("SHARE_CONTENT", 16), new r80("OPT_OUT_BRAND_LIFT", 17), new r80("SHARE_ENTITY", 18), new r80("PRESENT_SSO_EMAIL_COLLECTION", 19), new r80("DOWNLOAD_ENTITY", 20), new r80("ADD_TO_QUEUE", 21), new r80("ADD_TO_YOUR_EPISODES", 22), new r80("OPT_IN", 23), new r80("OPT_OUT", 24), new r80("EXTERNAL_URL_V2", 25), new r80("OPEN_SYSTEM_SETTINGS_SPOTIFY_APP_PAGE", 26)};
        a = r80VarArr;
        b = new t0z(r80VarArr);
    }

    public static r80 valueOf(String str) {
        return (r80) Enum.valueOf(r80.class, str);
    }

    public static r80[] values() {
        return (r80[]) a.clone();
    }
}
