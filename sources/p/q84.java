package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum q84 implements z0z {
    WRAPPED_NATIVE("wrapped_native"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAPPED_STAGE("wrapped_stage"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAPPED_PLAYLIST("wrapped_playlist"),
    /* JADX INFO: Fake field, exist only in values array */
    FALLBACK("fallback");

    public final String a;

    q84(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
