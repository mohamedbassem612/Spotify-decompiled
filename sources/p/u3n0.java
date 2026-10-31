package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum u3n0 implements z0z {
    DISABLED("disabled"),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED("enabled"),
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED_EXCLUSIVE("enabled_exclusive");

    public final String a;

    u3n0(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
