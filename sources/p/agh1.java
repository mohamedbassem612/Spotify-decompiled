package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class agh1 {
    public static final agh1 a;
    public static final agh1 b;
    public static final /* synthetic */ agh1[] c;

    static {
        agh1 agh1Var = new agh1("OnGoToHomeClicked", 0);
        a = agh1Var;
        agh1 agh1Var2 = new agh1("OnUnfollowClicked", 1);
        b = agh1Var2;
        c = new agh1[]{agh1Var, agh1Var2};
    }

    public static agh1 valueOf(String str) {
        return (agh1) Enum.valueOf(agh1.class, str);
    }

    public static agh1[] values() {
        return (agh1[]) c.clone();
    }
}
