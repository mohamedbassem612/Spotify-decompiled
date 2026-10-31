package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lvh1 {
    public static final lvh1 a;
    public static final lvh1 b;
    public static final /* synthetic */ lvh1[] c;

    static {
        lvh1 lvh1Var = new lvh1("ENABLED", 0);
        a = lvh1Var;
        lvh1 lvh1Var2 = new lvh1("DISABLED", 1);
        b = lvh1Var2;
        c = new lvh1[]{lvh1Var, lvh1Var2};
    }

    public static lvh1 valueOf(String str) {
        return (lvh1) Enum.valueOf(lvh1.class, str);
    }

    public static lvh1[] values() {
        return (lvh1[]) c.clone();
    }
}
