package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum q80 implements v190 {
    ACTION_TYPE_UNSPECIFIED(0),
    NAVIGATE(1),
    NAVIGATE_WEBVIEW(2),
    UNRECOGNIZED(-1);

    public final int a;

    q80(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
