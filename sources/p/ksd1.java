package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ksd1 {
    public static final ksd1 a;
    public static final ksd1 b;
    public static final /* synthetic */ ksd1[] c;

    static {
        ksd1 ksd1Var = new ksd1("Artist", 0);
        a = ksd1Var;
        ksd1 ksd1Var2 = new ksd1("Song", 1);
        b = ksd1Var2;
        c = new ksd1[]{ksd1Var, ksd1Var2};
    }

    public static ksd1 valueOf(String str) {
        return (ksd1) Enum.valueOf(ksd1.class, str);
    }

    public static ksd1[] values() {
        return (ksd1[]) c.clone();
    }
}
