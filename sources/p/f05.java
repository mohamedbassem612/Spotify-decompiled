package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum f05 implements z0z {
    BASELINE("baseline"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL("control"),
    /* JADX INFO: Fake field, exist only in values array */
    UPSELL_FOCUSED("upsell_focused"),
    /* JADX INFO: Fake field, exist only in values array */
    SOLUTION_FOCUSED("solution_focused"),
    /* JADX INFO: Fake field, exist only in values array */
    LIMITATION_FOCUSED("limitation_focused");

    public final String a;

    f05(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
