package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fe21 {
    public static final fe21 a;
    public static final /* synthetic */ fe21[] b;

    static {
        fe21 fe21Var = new fe21("FilterClicked", 0);
        a = fe21Var;
        b = new fe21[]{fe21Var};
    }

    public static fe21 valueOf(String str) {
        return (fe21) Enum.valueOf(fe21.class, str);
    }

    public static fe21[] values() {
        return (fe21[]) b.clone();
    }
}
