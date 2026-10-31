package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a20 {
    public static final a20 a;
    public static final a20 b;
    public static final /* synthetic */ a20[] c;

    static {
        a20 a20Var = new a20("AddButtonClicked", 0);
        a = a20Var;
        a20 a20Var2 = new a20("ContextMenuButtonClicked", 1);
        b = a20Var2;
        c = new a20[]{a20Var, a20Var2};
    }

    public static a20 valueOf(String str) {
        return (a20) Enum.valueOf(a20.class, str);
    }

    public static a20[] values() {
        return (a20[]) c.clone();
    }
}
