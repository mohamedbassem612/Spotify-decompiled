package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fw80 {
    public static final fw80 a;
    public static final fw80 b;
    public static final fw80 c;
    public static final fw80 d;
    public static final fw80 e;
    public static final fw80 f;
    public static final fw80 g;
    public static final /* synthetic */ fw80[] h;

    static {
        fw80 fw80Var = new fw80("ANSWER_BUTTON_ENTRY", 0);
        a = fw80Var;
        fw80 fw80Var2 = new fw80("TIMER_ENTRY", 1);
        b = fw80Var2;
        fw80 fw80Var3 = new fw80("BUTTON_TAP", 2);
        c = fw80Var3;
        fw80 fw80Var4 = new fw80("CORRECT_ANSWER", 3);
        d = fw80Var4;
        fw80 fw80Var5 = new fw80("INCORRECT_ANSWER", 4);
        e = fw80Var5;
        fw80 fw80Var6 = new fw80("NEXT_BUTTON", 5);
        f = fw80Var6;
        fw80 fw80Var7 = new fw80("QUIZ_COMPLETE", 6);
        g = fw80Var7;
        h = new fw80[]{fw80Var, fw80Var2, fw80Var3, fw80Var4, fw80Var5, fw80Var6, fw80Var7};
    }

    public static fw80 valueOf(String str) {
        return (fw80) Enum.valueOf(fw80.class, str);
    }

    public static fw80[] values() {
        return (fw80[]) h.clone();
    }
}
