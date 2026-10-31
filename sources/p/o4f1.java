package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o4f1 {
    public static final o4f1 a;
    public static final o4f1 b;
    public static final /* synthetic */ o4f1[] c;

    static {
        o4f1 o4f1Var = new o4f1("ANCHOR_NOT_ATTACHED", 0);
        a = o4f1Var;
        o4f1 o4f1Var2 = new o4f1("POPUP_NOT_CREATED", 1);
        o4f1 o4f1Var3 = new o4f1("COMPOSABLE_ANCHOR_OR_CONTENT", 2);
        o4f1 o4f1Var4 = new o4f1("ORCHESTRATION", 3);
        b = o4f1Var4;
        c = new o4f1[]{o4f1Var, o4f1Var2, o4f1Var3, o4f1Var4, new o4f1("UNKNOWN", 4)};
    }

    public static o4f1 valueOf(String str) {
        return (o4f1) Enum.valueOf(o4f1.class, str);
    }

    public static o4f1[] values() {
        return (o4f1[]) c.clone();
    }
}
