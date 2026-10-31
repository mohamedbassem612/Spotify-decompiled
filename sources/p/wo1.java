package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wo1 {
    public static final wo1 a;
    public static final wo1 b;
    public static final wo1 c;
    public static final /* synthetic */ wo1[] d;

    static {
        wo1 wo1Var = new wo1("Dragged", 0);
        a = wo1Var;
        wo1 wo1Var2 = new wo1("Outside", 1);
        b = wo1Var2;
        wo1 wo1Var3 = new wo1("Back", 2);
        c = wo1Var3;
        d = new wo1[]{wo1Var, wo1Var2, wo1Var3};
    }

    public static wo1 valueOf(String str) {
        return (wo1) Enum.valueOf(wo1.class, str);
    }

    public static wo1[] values() {
        return (wo1[]) d.clone();
    }
}
