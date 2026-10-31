package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cy51 {
    public static final cy51 a;
    public static final /* synthetic */ cy51[] b;

    static {
        cy51 cy51Var = new cy51("RowClicked", 0);
        a = cy51Var;
        b = new cy51[]{cy51Var};
    }

    public static cy51 valueOf(String str) {
        return (cy51) Enum.valueOf(cy51.class, str);
    }

    public static cy51[] values() {
        return (cy51[]) b.clone();
    }
}
