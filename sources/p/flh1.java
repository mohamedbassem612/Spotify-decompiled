package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class flh1 {
    public static final flh1 a;
    public static final flh1 b;
    public static final /* synthetic */ flh1[] c;

    static {
        flh1 flh1Var = new flh1("OnDiscardChangesButtonClicked", 0);
        a = flh1Var;
        flh1 flh1Var2 = new flh1("OnContinueEditingButtonClicked", 1);
        b = flh1Var2;
        c = new flh1[]{flh1Var, flh1Var2};
    }

    public static flh1 valueOf(String str) {
        return (flh1) Enum.valueOf(flh1.class, str);
    }

    public static flh1[] values() {
        return (flh1[]) c.clone();
    }
}
