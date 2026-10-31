package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cr41 {
    public static final cr41 a;
    public static final cr41 b;
    public static final cr41 c;
    public static final /* synthetic */ cr41[] d;

    static {
        cr41 cr41Var = new cr41("BOTH", 0);
        a = cr41Var;
        cr41 cr41Var2 = new cr41("HORIZONTAL", 1);
        b = cr41Var2;
        cr41 cr41Var3 = new cr41("VERTICAL", 2);
        c = cr41Var3;
        d = new cr41[]{cr41Var, cr41Var2, cr41Var3};
    }

    public static cr41 valueOf(String str) {
        return (cr41) Enum.valueOf(cr41.class, str);
    }

    public static cr41[] values() {
        return (cr41[]) d.clone();
    }
}
