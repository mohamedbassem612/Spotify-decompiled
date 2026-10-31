package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ec30 {
    public static final ec30 a;
    public static final ec30 b;
    public static final /* synthetic */ ec30[] c;

    static {
        ec30 ec30Var = new ec30("OnGoToHomeClicked", 0);
        a = ec30Var;
        ec30 ec30Var2 = new ec30("OnUnfollowClicked", 1);
        b = ec30Var2;
        c = new ec30[]{ec30Var, ec30Var2};
    }

    public static ec30 valueOf(String str) {
        return (ec30) Enum.valueOf(ec30.class, str);
    }

    public static ec30[] values() {
        return (ec30[]) c.clone();
    }
}
