package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sv11 {
    public static final sv11 a;
    public static final sv11 b;
    public static final /* synthetic */ sv11[] c;

    static {
        sv11 sv11Var = new sv11("MAIN_CONTENT", 0);
        a = sv11Var;
        sv11 sv11Var2 = new sv11("PARENT_CONTENT", 1);
        b = sv11Var2;
        c = new sv11[]{sv11Var, sv11Var2};
    }

    public static sv11 valueOf(String str) {
        return (sv11) Enum.valueOf(sv11.class, str);
    }

    public static sv11[] values() {
        return (sv11[]) c.clone();
    }
}
