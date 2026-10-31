package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract /* synthetic */ class zzy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[qzy0.values().length];
        try {
            iArr[qzy0.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qzy0.VERY_HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qzy0.LOSSLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
