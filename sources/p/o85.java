package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum o85 implements z0z {
    OPEN_ENTITY_PAGE("open_entity_page"),
    START_PLAYBACK("start_playback"),
    OPEN_ENTITY_PAGE_AND_START_PLAYBACK("open_entity_page_and_start_playback");

    public final String a;

    o85(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
