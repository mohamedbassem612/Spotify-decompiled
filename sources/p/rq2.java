package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum rq2 {
    HOME_DJ(0, "home"),
    NPV_DJ(1, "npv_dj_neffle"),
    NPV_MARTINI_CHAT(2, "npv_scroll"),
    NPV_SEE_MORE(3, "npv_scroll"),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_CONVERSATION(4, "home"),
    SEARCH_CROSSWORD(5, "search"),
    ADVANCED_CURATION(6, "playlist"),
    GENPODS_PROMPT_CHAT(7, "genpods"),
    IMAGE_SEARCH(8, "image_search");

    public final String a;
    public final String b;

    rq2(int i, String str) {
        this.a = str;
        this.b = str;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
