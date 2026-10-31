package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yh4 implements z0z {
    PROMPTED_BY_YOU("prompted_by_you"),
    /* JADX INFO: Fake field, exist only in values array */
    MADE_FROM_SEARCH("made_from_search"),
    /* JADX INFO: Fake field, exist only in values array */
    GENERATED_PLAYLIST("generated_playlist");

    public final String a;

    yh4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
