package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yf5 {
    public static final yf5 a;
    public static final yf5 b;
    public static final yf5 c;
    public static final yf5 d;
    public static final yf5 e;
    public static final yf5 f;
    public static final yf5 g;
    public static final /* synthetic */ yf5[] h;

    static {
        yf5 yf5Var = new yf5("Paragraph", 0);
        a = yf5Var;
        yf5 yf5Var2 = new yf5("Span", 1);
        b = yf5Var2;
        yf5 yf5Var3 = new yf5("VerbatimTts", 2);
        c = yf5Var3;
        yf5 yf5Var4 = new yf5("Url", 3);
        d = yf5Var4;
        yf5 yf5Var5 = new yf5("Link", 4);
        e = yf5Var5;
        yf5 yf5Var6 = new yf5("Clickable", 5);
        f = yf5Var6;
        yf5 yf5Var7 = new yf5("String", 6);
        g = yf5Var7;
        h = new yf5[]{yf5Var, yf5Var2, yf5Var3, yf5Var4, yf5Var5, yf5Var6, yf5Var7};
    }

    public static yf5 valueOf(String str) {
        return (yf5) Enum.valueOf(yf5.class, str);
    }

    public static yf5[] values() {
        return (yf5[]) h.clone();
    }
}
