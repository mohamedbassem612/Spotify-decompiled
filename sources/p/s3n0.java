package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum s3n0 implements z0z {
    DISABLED("disabled"),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_NO_NORMALIZATION("enabled_no_normalization"),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_WITH_NORMALIZATION("enabled_with_normalization");

    public final String a;

    s3n0(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
