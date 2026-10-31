package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum qdc1 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("No additional details"),
    OS_VERSION(vgl.a),
    CONNECT_NOT_ENABLED("Stream expansion via Connect is not enabled"),
    SOCIAL_SESSION_ROUTE("The route is part of a social session"),
    IS_A_JAM("The route is part of a Jam session");

    public final String a;

    qdc1(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
