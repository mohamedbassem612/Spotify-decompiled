package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class up91 {
    public static final up91 a;
    public static final up91 b;
    public static final up91 c;
    public static final /* synthetic */ up91[] d;

    static {
        up91 up91Var = new up91("AVAILABLE", 0);
        a = up91Var;
        up91 up91Var2 = new up91("FORCED", 1);
        b = up91Var2;
        up91 up91Var3 = new up91("UNAVAILABLE", 2);
        c = up91Var3;
        d = new up91[]{up91Var, up91Var2, up91Var3};
    }

    public static up91 valueOf(String str) {
        return (up91) Enum.valueOf(up91.class, str);
    }

    public static up91[] values() {
        return (up91[]) d.clone();
    }
}
