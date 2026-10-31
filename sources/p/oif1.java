package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum oif1 {
    APP("app.continuous"),
    NETWORK("network.http.requests"),
    HITCHES("ui.hitches"),
    /* JADX INFO: Fake field, exist only in values array */
    ELEMENTS_RESET("ui.elements.reset"),
    ELEMENTS_CREATION("ui.elements.creation"),
    ELEMENTS_UPDATE("ui.elements.update");

    public final String a;

    oif1(String str) {
        this.a = str;
    }
}
