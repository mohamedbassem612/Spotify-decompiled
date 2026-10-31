package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tcd1 {
    public static final tcd1 a;
    public static final tcd1 b;
    public static final tcd1 c;
    public static final /* synthetic */ tcd1[] d;

    static {
        tcd1 tcd1Var = new tcd1("Word", 0);
        a = tcd1Var;
        tcd1 tcd1Var2 = new tcd1("Sentenced", 1);
        b = tcd1Var2;
        tcd1 tcd1Var3 = new tcd1("Static", 2);
        c = tcd1Var3;
        d = new tcd1[]{tcd1Var, tcd1Var2, tcd1Var3};
    }

    public static tcd1 valueOf(String str) {
        return (tcd1) Enum.valueOf(tcd1.class, str);
    }

    public static tcd1[] values() {
        return (tcd1[]) d.clone();
    }
}
