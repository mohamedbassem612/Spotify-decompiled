package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y800 {
    public static final y800 a;
    public static final y800 b;
    public static final /* synthetic */ y800[] c;

    static {
        y800 y800Var = new y800("CardClicked", 0);
        a = y800Var;
        y800 y800Var2 = new y800("SaveClicked", 1);
        b = y800Var2;
        c = new y800[]{y800Var, y800Var2};
    }

    public static y800 valueOf(String str) {
        return (y800) Enum.valueOf(y800.class, str);
    }

    public static y800[] values() {
        return (y800[]) c.clone();
    }
}
