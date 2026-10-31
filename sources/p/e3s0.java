package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum e3s0 {
    d("google_maps", "com.google.android.apps.maps", "https://www.google.com/maps"),
    e("waze", "com.waze", "https://waze.com/ul"),
    f("samsung", "com.osp.app.signin", ""),
    g("alexa", "com.amazon.dee.app", ""),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("google_assistant", "", ""),
    h("", "", "");

    public final String a;
    public final String b;
    public final String c;

    e3s0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }
}
