package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum iu0 {
    TRACK_IS_AD("ad_conflict"),
    TRACK_IS_PODCAST("podcast_track"),
    TRACK_IS_CANVAS("canvas_track"),
    TRACK_IS_MUSIC_VIDEO("music_video_track"),
    CONTEXT_IS_SPONSORED("sponsored_context"),
    AD_ACTIVE("ad_active"),
    CAR_CONNECTED("car_connected");

    public final String a;

    iu0(String str) {
        this.a = str;
    }
}
