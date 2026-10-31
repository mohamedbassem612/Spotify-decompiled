package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b3f1 {
    public static final b3f1 a;
    public static final b3f1 b;
    public static final b3f1 c;
    public static final b3f1 d;
    public static final /* synthetic */ b3f1[] e;

    static {
        b3f1 b3f1Var = new b3f1("STYLE_1", 0);
        a = b3f1Var;
        b3f1 b3f1Var2 = new b3f1("STYLE_2", 1);
        b = b3f1Var2;
        b3f1 b3f1Var3 = new b3f1("STYLE_3", 2);
        c = b3f1Var3;
        b3f1 b3f1Var4 = new b3f1("STYLE_4", 3);
        d = b3f1Var4;
        e = new b3f1[]{b3f1Var, b3f1Var2, b3f1Var3, b3f1Var4};
    }

    public static b3f1 valueOf(String str) {
        return (b3f1) Enum.valueOf(b3f1.class, str);
    }

    public static b3f1[] values() {
        return (b3f1[]) e.clone();
    }
}
