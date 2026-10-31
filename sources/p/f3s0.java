package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum f3s0 {
    CRASHLYTICS("crashlytics"),
    /* JADX INFO: Fake field, exist only in values array */
    ITERABLE("iterable"),
    BRANCH("branch"),
    ONETRUST("onetrust"),
    GOOGLE("google"),
    GOOGLE_ANALYTICS("googleanalytics");

    public final String a;

    f3s0(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
