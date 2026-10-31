package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class di9 {
    public static final di9 a;
    public static final di9 b;
    public static final di9 c;
    public static final di9 d;
    public static final /* synthetic */ di9[] e;
    public static final /* synthetic */ t0z f;

    static {
        di9 di9Var = new di9("IMMEDIATE", 0);
        a = di9Var;
        di9 di9Var2 = new di9("CLOSE", 1);
        b = di9Var2;
        di9 di9Var3 = new di9("FAR", 2);
        c = di9Var3;
        di9 di9Var4 = new di9("UNKNOWN", 3);
        d = di9Var4;
        di9[] di9VarArr = {di9Var, di9Var2, di9Var3, di9Var4};
        e = di9VarArr;
        f = new t0z(di9VarArr);
    }

    public static di9 valueOf(String str) {
        return (di9) Enum.valueOf(di9.class, str);
    }

    public static di9[] values() {
        return (di9[]) e.clone();
    }
}
