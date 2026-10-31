package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bx11 {
    public static final bx11 a;
    public static final bx11 b;
    public static final /* synthetic */ bx11[] c;

    static {
        bx11 bx11Var = new bx11("ALBUM", 0);
        a = bx11Var;
        bx11 bx11Var2 = new bx11("NOT_ALBUM", 1);
        b = bx11Var2;
        c = new bx11[]{bx11Var, bx11Var2};
    }

    public static bx11 valueOf(String str) {
        return (bx11) Enum.valueOf(bx11.class, str);
    }

    public static bx11[] values() {
        return (bx11[]) c.clone();
    }
}
