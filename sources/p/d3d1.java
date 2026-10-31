package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum d3d1 {
    EPISODE_PAGE("episode_page"),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_ADS_NPV("ad_npv"),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_NPB("npb_hat"),
    MUSIC_NPV("music_npv"),
    MUSIC_PLAYLIST("playlist"),
    PODCAST_SCROLL_NPV("podcast_scroll_npv"),
    /* JADX INFO: Fake field, exist only in values array */
    PODCAST_ADS_NPB("podcast_ads_npb"),
    /* JADX INFO: Fake field, exist only in values array */
    PODCAST_ADS_NPV("podcast_ads_npv"),
    /* JADX INFO: Fake field, exist only in values array */
    SEE_ALL("see_all"),
    MUSIC_SEE_ALL("music_see_all"),
    PODCAST_SEE_ALL("podcast_see_all"),
    SHOW_PAGE("show_page"),
    /* JADX INFO: Fake field, exist only in values array */
    ADS_NPV("ad_npv");

    public final String a;

    d3d1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
