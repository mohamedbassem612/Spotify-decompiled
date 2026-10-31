package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xhf1 {
    public static final long a = cwl1.S(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    public static final int b(long j, flb0 flb0Var) {
        if ((Long.MIN_VALUE & j) != 0 && flb0Var != flb0.a) {
            j >>= 30;
        }
        return ((int) j) & 32767;
    }

    public static final int c(long j, flb0 flb0Var) {
        if ((Long.MIN_VALUE & j) == 0 || flb0Var == flb0.a) {
            j >>= 30;
        }
        return ((int) j) & 32767;
    }

    public static final int d(long j) {
        return ((int) (j >> 45)) & 32767;
    }

    public static final int e(long j) {
        return ((int) (j >> 15)) & 32767;
    }
}
