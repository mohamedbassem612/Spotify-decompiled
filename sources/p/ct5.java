package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ct5 extends cv5 {
    public static final bt5 Companion = new bt5();
    public final String b;

    public ct5(int i, String str) {
        if ((i & 1) == 0) {
            this.b = "default";
        } else {
            this.b = str;
        }
    }
}
