package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class naj0 {
    public static final naj0 a;
    public static final naj0 b;
    public static final /* synthetic */ naj0[] c;

    static {
        naj0 naj0Var = new naj0("CancelButtonClicked", 0);
        a = naj0Var;
        naj0 naj0Var2 = new naj0("DisableMixButtonClicked", 1);
        b = naj0Var2;
        c = new naj0[]{naj0Var, naj0Var2};
    }

    public static naj0 valueOf(String str) {
        return (naj0) Enum.valueOf(naj0.class, str);
    }

    public static naj0[] values() {
        return (naj0[]) c.clone();
    }
}
