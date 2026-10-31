package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sw20 {
    public static final sw20 a;
    public static final sw20 b;
    public static final sw20 c;
    public static final /* synthetic */ sw20[] d;

    static {
        sw20 sw20Var = new sw20("SUCCESS", 0);
        a = sw20Var;
        sw20 sw20Var2 = new sw20("SERVER_ERROR", 1);
        b = sw20Var2;
        sw20 sw20Var3 = new sw20("NO_CONNECTIVITY", 2);
        c = sw20Var3;
        d = new sw20[]{sw20Var, sw20Var2, sw20Var3, new sw20("UNKNOWN_ERROR", 3)};
    }

    public static sw20 valueOf(String str) {
        return (sw20) Enum.valueOf(sw20.class, str);
    }

    public static sw20[] values() {
        return (sw20[]) d.clone();
    }
}
