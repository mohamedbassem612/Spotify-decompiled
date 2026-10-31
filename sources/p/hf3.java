package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hf3 {
    public static final hf3 a;
    public static final /* synthetic */ hf3[] b;

    static {
        hf3 hf3Var = new hf3("RowClicked", 0);
        a = hf3Var;
        b = new hf3[]{hf3Var};
    }

    public static hf3 valueOf(String str) {
        return (hf3) Enum.valueOf(hf3.class, str);
    }

    public static hf3[] values() {
        return (hf3[]) b.clone();
    }
}
