package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ym30 {
    public static final ym30 a;
    public static final ym30 b;
    public static final /* synthetic */ ym30[] c;

    static {
        ym30 ym30Var = new ym30("ExplorePremiumClicked", 0);
        a = ym30Var;
        ym30 ym30Var2 = new ym30("SystemDismissed", 1);
        b = ym30Var2;
        c = new ym30[]{ym30Var, ym30Var2};
    }

    public static ym30 valueOf(String str) {
        return (ym30) Enum.valueOf(ym30.class, str);
    }

    public static ym30[] values() {
        return (ym30[]) c.clone();
    }
}
