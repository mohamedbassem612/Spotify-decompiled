package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[n.values().length];
        a = iArr;
        try {
            iArr[n.ENTRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[n.START_DIRECTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[n.END_DIRECTORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
