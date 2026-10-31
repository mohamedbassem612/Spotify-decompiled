package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ut51 {
    public static final ut51 a;
    public static final ut51 b;
    public static final /* synthetic */ ut51[] c;

    static {
        ut51 ut51Var = new ut51("ExitSelectionMode", 0);
        a = ut51Var;
        ut51 ut51Var2 = new ut51("EnterSelectionMode", 1);
        b = ut51Var2;
        c = new ut51[]{ut51Var, ut51Var2};
    }

    public static ut51 valueOf(String str) {
        return (ut51) Enum.valueOf(ut51.class, str);
    }

    public static ut51[] values() {
        return (ut51[]) c.clone();
    }
}
