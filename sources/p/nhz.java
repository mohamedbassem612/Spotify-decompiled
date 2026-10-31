package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum nhz {
    c(3, "INVALID_VERSION"),
    d(3, "INVALID_REQUEST"),
    e(2, "NO_INTERNET_CONNECTION"),
    f(1, "OFFLINE_MODE_ACTIVE"),
    g(1, "CONNECTION_TIMEOUT"),
    h(1, "WEBVIEW_ERROR"),
    i(2, "AUTHENTICATION_SERVICE_UNAVAILABLE"),
    t(3, "INVALID_RESPONSE"),
    X(3, "CLIENT_VERIFICATION_FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(3, "INVALID_CLIENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(3, "INVALID_APP_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(3, "INVALID_REQUEST"),
    Y(2, "AUTHENTICATION_SERVICE_UNKNOWN_ERROR"),
    Z(2, "AUTHENTICATION_DENIED_BY_USER"),
    N0(2, "CANCELLED"),
    O0(2, "USER_AUTHORIZATION_REQUIRED");

    public final String a;
    public final int b;

    nhz(int i2, String str) {
        this.a = str;
        this.b = i2;
    }
}
