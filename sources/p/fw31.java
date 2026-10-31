package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fw31 {
    public static final fw31 a;
    public static final fw31 b;
    public static final fw31 c;
    public static final fw31 d;
    public static final /* synthetic */ fw31[] e;

    static {
        fw31 fw31Var = new fw31("Background", 0);
        a = fw31Var;
        fw31 fw31Var2 = new fw31("Main", 1);
        b = fw31Var2;
        fw31 fw31Var3 = new fw31("Body", 2);
        c = fw31Var3;
        fw31 fw31Var4 = new fw31("Footer", 3);
        d = fw31Var4;
        e = new fw31[]{fw31Var, fw31Var2, fw31Var3, fw31Var4};
    }

    public static fw31 valueOf(String str) {
        return (fw31) Enum.valueOf(fw31.class, str);
    }

    public static fw31[] values() {
        return (fw31[]) e.clone();
    }
}
