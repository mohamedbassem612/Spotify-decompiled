package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dwt {
    public static final dwt a;
    public static final /* synthetic */ dwt[] b;

    static {
        dwt dwtVar = new dwt("ConnectTimestamps", 0);
        a = dwtVar;
        b = new dwt[]{dwtVar};
    }

    public static dwt valueOf(String str) {
        return (dwt) Enum.valueOf(dwt.class, str);
    }

    public static dwt[] values() {
        return (dwt[]) b.clone();
    }
}
