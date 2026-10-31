package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rej0 {
    public static final rej0 a;
    public static final rej0 b;
    public static final /* synthetic */ rej0[] c;

    static {
        rej0 rej0Var = new rej0("CancelButtonClicked", 0);
        a = rej0Var;
        rej0 rej0Var2 = new rej0("ContinueButtonClicked", 1);
        b = rej0Var2;
        c = new rej0[]{rej0Var, rej0Var2};
    }

    public static rej0 valueOf(String str) {
        return (rej0) Enum.valueOf(rej0.class, str);
    }

    public static rej0[] values() {
        return (rej0[]) c.clone();
    }
}
