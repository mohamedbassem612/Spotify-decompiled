package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pd31 {
    public static final pd31 a;
    public static final pd31 b;
    public static final pd31 c;
    public static final /* synthetic */ pd31[] d;

    static {
        pd31 pd31Var = new pd31("Sealed", 0);
        a = pd31Var;
        pd31 pd31Var2 = new pd31("Opening", 1);
        b = pd31Var2;
        pd31 pd31Var3 = new pd31("Opened", 2);
        c = pd31Var3;
        d = new pd31[]{pd31Var, pd31Var2, pd31Var3};
    }

    public static pd31 valueOf(String str) {
        return (pd31) Enum.valueOf(pd31.class, str);
    }

    public static pd31[] values() {
        return (pd31[]) d.clone();
    }
}
