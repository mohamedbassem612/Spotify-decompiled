package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ezf1 {
    public static final ezf1 a;
    public static final ezf1 b;
    public static final ezf1 c;
    public static final ezf1 d;
    public static final /* synthetic */ ezf1[] e;

    static {
        ezf1 ezf1Var = new ezf1("DISABLED", 0);
        a = ezf1Var;
        ezf1 ezf1Var2 = new ezf1("SHOW_UPSELL", 1);
        b = ezf1Var2;
        ezf1 ezf1Var3 = new ezf1("ENABLED", 2);
        c = ezf1Var3;
        ezf1 ezf1Var4 = new ezf1("SECTION_ONLY", 3);
        d = ezf1Var4;
        e = new ezf1[]{ezf1Var, ezf1Var2, ezf1Var3, ezf1Var4};
    }

    public static ezf1 valueOf(String str) {
        return (ezf1) Enum.valueOf(ezf1.class, str);
    }

    public static ezf1[] values() {
        return (ezf1[]) e.clone();
    }
}
