package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gi10 {
    public static final gi10 a;
    public static final gi10 b;
    public static final /* synthetic */ gi10[] c;

    static {
        gi10 gi10Var = new gi10("CardClicked", 0);
        a = gi10Var;
        gi10 gi10Var2 = new gi10("PrimaryButtonClicked", 1);
        b = gi10Var2;
        c = new gi10[]{gi10Var, gi10Var2};
    }

    public static gi10 valueOf(String str) {
        return (gi10) Enum.valueOf(gi10.class, str);
    }

    public static gi10[] values() {
        return (gi10[]) c.clone();
    }
}
