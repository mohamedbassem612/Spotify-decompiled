package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zwf1 {
    public static final zwf1 a;
    public static final zwf1 b;
    public static final zwf1 c;
    public static final zwf1 d;
    public static final /* synthetic */ zwf1[] e;

    static {
        zwf1 zwf1Var = new zwf1("RowClicked", 0);
        a = zwf1Var;
        zwf1 zwf1Var2 = new zwf1("AddClicked", 1);
        b = zwf1Var2;
        zwf1 zwf1Var3 = new zwf1("PreviewPlayClicked", 2);
        c = zwf1Var3;
        zwf1 zwf1Var4 = new zwf1("PreviewPauseClicked", 3);
        d = zwf1Var4;
        e = new zwf1[]{zwf1Var, zwf1Var2, zwf1Var3, zwf1Var4};
    }

    public static zwf1 valueOf(String str) {
        return (zwf1) Enum.valueOf(zwf1.class, str);
    }

    public static zwf1[] values() {
        return (zwf1[]) e.clone();
    }
}
