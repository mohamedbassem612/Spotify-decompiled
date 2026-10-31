package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xl1 {
    public static final xl1 a;
    public static final xl1 b;
    public static final /* synthetic */ xl1[] c;

    static {
        xl1 xl1Var = new xl1("OnFollowClicked", 0);
        a = xl1Var;
        xl1 xl1Var2 = new xl1("OnUnfollowClicked", 1);
        b = xl1Var2;
        c = new xl1[]{xl1Var, xl1Var2};
    }

    public static xl1 valueOf(String str) {
        return (xl1) Enum.valueOf(xl1.class, str);
    }

    public static xl1[] values() {
        return (xl1[]) c.clone();
    }
}
