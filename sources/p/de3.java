package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class de3 {
    public static final de3 a;
    public static final de3 b;
    public static final de3 c;
    public static final de3 d;
    public static final /* synthetic */ de3[] e;

    static {
        de3 de3Var = new de3("CardClicked", 0);
        a = de3Var;
        de3 de3Var2 = new de3("PresaveButtonClicked", 1);
        b = de3Var2;
        de3 de3Var3 = new de3("PlayButtonClicked", 2);
        c = de3Var3;
        de3 de3Var4 = new de3("ShareButtonClicked", 3);
        d = de3Var4;
        e = new de3[]{de3Var, de3Var2, de3Var3, de3Var4};
    }

    public static de3 valueOf(String str) {
        return (de3) Enum.valueOf(de3.class, str);
    }

    public static de3[] values() {
        return (de3[]) e.clone();
    }
}
