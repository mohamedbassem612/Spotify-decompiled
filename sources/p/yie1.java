package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yie1 {
    public static final yie1 a;
    public static final yie1 b;
    public static final yie1 c;
    public static final yie1 d;
    public static final /* synthetic */ yie1[] e;

    static {
        yie1 yie1Var = new yie1("CloseTapped", 0);
        a = yie1Var;
        yie1 yie1Var2 = new yie1("SwipeDismissed", 1);
        b = yie1Var2;
        yie1 yie1Var3 = new yie1("BackPressed", 2);
        c = yie1Var3;
        yie1 yie1Var4 = new yie1("ShareTapped", 3);
        d = yie1Var4;
        e = new yie1[]{yie1Var, yie1Var2, yie1Var3, yie1Var4};
    }

    public static yie1 valueOf(String str) {
        return (yie1) Enum.valueOf(yie1.class, str);
    }

    public static yie1[] values() {
        return (yie1[]) e.clone();
    }
}
