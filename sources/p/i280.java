package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i280 {
    public static final i280 a;
    public static final i280 b;
    public static final i280 c;
    public static final /* synthetic */ i280[] d;

    static {
        i280 i280Var = new i280("NO_IMMERSIVE", 0);
        a = i280Var;
        i280 i280Var2 = new i280("SEMI_IMMERSIVE", 1);
        b = i280Var2;
        i280 i280Var3 = new i280("FULL_IMMERSIVE", 2);
        c = i280Var3;
        d = new i280[]{i280Var, i280Var2, i280Var3};
    }

    public static i280 valueOf(String str) {
        return (i280) Enum.valueOf(i280.class, str);
    }

    public static i280[] values() {
        return (i280[]) d.clone();
    }
}
