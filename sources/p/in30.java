package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class in30 {
    public static final in30 a;
    public static final in30 b;
    public static final in30 c;
    public static final /* synthetic */ in30[] d;

    static {
        in30 in30Var = new in30("ExplorePremiumClicked", 0);
        a = in30Var;
        in30 in30Var2 = new in30("DismissClicked", 1);
        b = in30Var2;
        in30 in30Var3 = new in30("SystemDismissed", 2);
        c = in30Var3;
        d = new in30[]{in30Var, in30Var2, in30Var3};
    }

    public static in30 valueOf(String str) {
        return (in30) Enum.valueOf(in30.class, str);
    }

    public static in30[] values() {
        return (in30[]) d.clone();
    }
}
