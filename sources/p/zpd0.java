package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zpd0 {
    public static final zpd0 a;
    public static final zpd0 b;
    public static final /* synthetic */ zpd0[] c;

    static {
        zpd0 zpd0Var = new zpd0("OkButtonClicked", 0);
        a = zpd0Var;
        zpd0 zpd0Var2 = new zpd0("DismissButtonClicked", 1);
        b = zpd0Var2;
        c = new zpd0[]{zpd0Var, zpd0Var2};
    }

    public static zpd0 valueOf(String str) {
        return (zpd0) Enum.valueOf(zpd0.class, str);
    }

    public static zpd0[] values() {
        return (zpd0[]) c.clone();
    }
}
