package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class odj1 {
    public static final odj1 a;
    public static final odj1 b;
    public static final /* synthetic */ odj1[] c;

    static {
        odj1 odj1Var = new odj1("OPEN_NOW_PLAYING_VIEW", 0);
        a = odj1Var;
        odj1 odj1Var2 = new odj1("SHOW_ERROR", 1);
        b = odj1Var2;
        c = new odj1[]{odj1Var, odj1Var2};
    }

    public static odj1 valueOf(String str) {
        return (odj1) Enum.valueOf(odj1.class, str);
    }

    public static odj1[] values() {
        return (odj1[]) c.clone();
    }
}
