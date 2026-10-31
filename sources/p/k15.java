package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum k15 implements z0z {
    DISABLED("disabled"),
    /* JADX INFO: Fake field, exist only in values array */
    ALL("all"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTAGRAM_STORIES("instagram_stories"),
    /* JADX INFO: Fake field, exist only in values array */
    SNAPCHAT("snapchat"),
    /* JADX INFO: Fake field, exist only in values array */
    WHATSAPP_STATUS("whatsapp_status"),
    /* JADX INFO: Fake field, exist only in values array */
    TIKTOK_FEED("tiktok_feed"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_STORIES_FACEBOOK_FEED("facebook_stories-facebook_feed");

    public final String a;

    k15(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
