package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class l261 {
    public static final int a = fyo1.s(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final jm b = new jm("PERMIT", (byte) 5);
    public static final jm c = new jm("TAKEN", (byte) 5);
    public static final jm d = new jm("BROKEN", (byte) 5);
    public static final jm e = new jm("CANCELLED", (byte) 5);
    public static final int f = fyo1.s(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    public static k261 a(int i) {
        return new k261(i, 0);
    }
}
