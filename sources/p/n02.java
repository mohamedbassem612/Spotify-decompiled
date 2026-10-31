package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n02 {
    public static final n02 a;
    public static final n02 b;
    public static final n02 c;
    public static final /* synthetic */ n02[] d;

    static {
        n02 n02Var = new n02("NOT_CONNECTED", 0);
        a = n02Var;
        n02 n02Var2 = new n02("CONNECTED", 1);
        b = n02Var2;
        n02 n02Var3 = new n02("CONNECTED_WITH_ADDON_SESSION", 2);
        c = n02Var3;
        d = new n02[]{n02Var, n02Var2, n02Var3};
    }

    public static n02 valueOf(String str) {
        return (n02) Enum.valueOf(n02.class, str);
    }

    public static n02[] values() {
        return (n02[]) d.clone();
    }
}
