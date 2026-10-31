package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum zh4 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    TITLE("title"),
    /* JADX INFO: Fake field, exist only in values array */
    METADATA_AND_TITLE("metadata_and_title"),
    DEFAULT("default");

    public final String a;

    zh4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
