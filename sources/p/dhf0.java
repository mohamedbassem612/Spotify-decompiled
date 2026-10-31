package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum dhf0 {
    FULLSCREEN("fullscreen"),
    NPV("npv"),
    CARD("card"),
    SELECTION("selection"),
    UNSPECIFIED("unspecified"),
    SHARE_CARD("sharecard"),
    IN_APP_SHARE_CARD("in-app-share-card"),
    XR_PROJECTED("xr-projected"),
    MEDIA_TRIMMER("media-trimmer");

    public final String a;

    dhf0(String str) {
        this.a = str;
    }

    public final String getId() {
        return this.a;
    }
}
