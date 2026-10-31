package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vo6 {
    public static final vo6 a;
    public static final vo6 b;
    public static final /* synthetic */ vo6[] c;

    static {
        vo6 vo6Var = new vo6("CardClicked", 0);
        a = vo6Var;
        vo6 vo6Var2 = new vo6("FollowButtonClicked", 1);
        b = vo6Var2;
        c = new vo6[]{vo6Var, vo6Var2};
    }

    public static vo6 valueOf(String str) {
        return (vo6) Enum.valueOf(vo6.class, str);
    }

    public static vo6[] values() {
        return (vo6[]) c.clone();
    }
}
