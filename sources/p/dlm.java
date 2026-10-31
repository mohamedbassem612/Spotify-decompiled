package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum dlm implements t2k1 {
    c("now-playing-bar", false),
    d("now-playing-sidebar", false),
    e("fullscreen", true),
    f("now-playing-view", true),
    g("now-playing-view-vertical-portrait", true),
    h("picture-in-picture", false),
    i("sticky-header", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF97("media-trimmer", false);

    public final String a;
    public final boolean b;

    dlm(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final String getIdentifier() {
        return this.a;
    }
}
