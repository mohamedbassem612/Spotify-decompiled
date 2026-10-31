package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iho {
    public static final iho a;
    public static final /* synthetic */ iho[] b;

    static {
        iho ihoVar = new iho("Clicked", 0);
        a = ihoVar;
        b = new iho[]{ihoVar};
    }

    public static iho valueOf(String str) {
        return (iho) Enum.valueOf(iho.class, str);
    }

    public static iho[] values() {
        return (iho[]) b.clone();
    }
}
