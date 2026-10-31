package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywt {
    public static final ywt a;
    public static final ywt b;
    public static final ywt c;
    public static final ywt d;
    public static final /* synthetic */ ywt[] e;

    static {
        ywt ywtVar = new ywt("LOW", 0);
        a = ywtVar;
        ywt ywtVar2 = new ywt("MID", 1);
        b = ywtVar2;
        ywt ywtVar3 = new ywt("HIGH", 2);
        c = ywtVar3;
        ywt ywtVar4 = new ywt("UNKNOWN", 3);
        d = ywtVar4;
        e = new ywt[]{ywtVar, ywtVar2, ywtVar3, ywtVar4};
    }

    public static ywt valueOf(String str) {
        return (ywt) Enum.valueOf(ywt.class, str);
    }

    public static ywt[] values() {
        return (ywt[]) e.clone();
    }
}
