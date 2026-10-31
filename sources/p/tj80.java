package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tj80 {
    public static final tj80 a;
    public static final tj80 b;
    public static final tj80 c;
    public static final /* synthetic */ tj80[] d;

    static {
        tj80 tj80Var = new tj80("Focused", 0);
        a = tj80Var;
        tj80 tj80Var2 = new tj80("UnfocusedEmpty", 1);
        b = tj80Var2;
        tj80 tj80Var3 = new tj80("UnfocusedNotEmpty", 2);
        c = tj80Var3;
        d = new tj80[]{tj80Var, tj80Var2, tj80Var3};
    }

    public static tj80 valueOf(String str) {
        return (tj80) Enum.valueOf(tj80.class, str);
    }

    public static tj80[] values() {
        return (tj80[]) d.clone();
    }
}
