package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class df50 {
    public static final df50 a;
    public static final df50 b;
    public static final /* synthetic */ df50[] c;

    static {
        df50 df50Var = new df50("TitleHit", 0);
        a = df50Var;
        df50 df50Var2 = new df50("SubtitleHit", 1);
        b = df50Var2;
        c = new df50[]{df50Var, df50Var2};
    }

    public static df50 valueOf(String str) {
        return (df50) Enum.valueOf(df50.class, str);
    }

    public static df50[] values() {
        return (df50[]) c.clone();
    }
}
