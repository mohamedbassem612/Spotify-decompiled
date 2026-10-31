package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pe11 {
    public static final pe11 a;
    public static final pe11 b;
    public static final pe11 c;
    public static final pe11 d;
    public static final pe11 e;
    public static final /* synthetic */ pe11[] f;

    static {
        pe11 pe11Var = new pe11("Unavailable", 0);
        a = pe11Var;
        pe11 pe11Var2 = new pe11("Ready", 1);
        b = pe11Var2;
        pe11 pe11Var3 = new pe11("Success", 2);
        c = pe11Var3;
        pe11 pe11Var4 = new pe11("Loading", 3);
        d = pe11Var4;
        pe11 pe11Var5 = new pe11("Error", 4);
        e = pe11Var5;
        f = new pe11[]{pe11Var, pe11Var2, pe11Var3, pe11Var4, pe11Var5};
    }

    public static pe11 valueOf(String str) {
        return (pe11) Enum.valueOf(pe11.class, str);
    }

    public static pe11[] values() {
        return (pe11[]) f.clone();
    }
}
