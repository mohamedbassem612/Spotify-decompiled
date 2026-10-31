package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum xsb1 {
    c(0, "DETAILS_TYPE_UNKNOWN"),
    d(1, "DETAILS_TYPE_LISTENING_MINUTES"),
    e(3, "DETAILS_TYPE_TRACKS"),
    f(2, "DETAILS_TYPE_ARTISTS"),
    g(4, "DETAILS_TYPE_SOCIAL_MINUTES"),
    h(5, "DETAILS_TYPE_SOCIAL_ARTISTS"),
    i(7, "DETAILS_TYPE_SOCIAL_TRACKS"),
    t(1, "DETAILS_TYPE_MINUTES_LISTENED"),
    X(8, "DETAILS_TYPE_ARTISTS_COUNT"),
    Y(6, "DETAILS_TYPE_SOUND_TOWN");

    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    xsb1(int i2, String str) {
        this.a = i;
        this.b = i2;
    }
}
