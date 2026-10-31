package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ym71 {
    public static final ym71 a;
    public static final ym71 b;
    public static final ym71 c;
    public static final /* synthetic */ ym71[] d;

    static {
        ym71 ym71Var = new ym71("Given", 0);
        a = ym71Var;
        ym71 ym71Var2 = new ym71("Removing", 1);
        b = ym71Var2;
        ym71 ym71Var3 = new ym71("RemovalFailed", 2);
        c = ym71Var3;
        d = new ym71[]{ym71Var, ym71Var2, ym71Var3};
    }

    public static ym71 valueOf(String str) {
        return (ym71) Enum.valueOf(ym71.class, str);
    }

    public static ym71[] values() {
        return (ym71[]) d.clone();
    }
}
