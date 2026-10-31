package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eem {
    public static final eem a;
    public static final /* synthetic */ eem[] b;

    static {
        eem eemVar = new eem("OnClicked", 0);
        a = eemVar;
        b = new eem[]{eemVar};
    }

    public static eem valueOf(String str) {
        return (eem) Enum.valueOf(eem.class, str);
    }

    public static eem[] values() {
        return (eem[]) b.clone();
    }
}
