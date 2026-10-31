package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dlk1 {
    public static final dlk1 a;
    public static final dlk1 b;
    public static final dlk1 c;
    public static final /* synthetic */ dlk1[] d;

    static {
        dlk1 dlk1Var = new dlk1("Loading", 0);
        a = dlk1Var;
        dlk1 dlk1Var2 = new dlk1("Content", 1);
        b = dlk1Var2;
        dlk1 dlk1Var3 = new dlk1("Error", 2);
        c = dlk1Var3;
        d = new dlk1[]{dlk1Var, dlk1Var2, dlk1Var3};
    }

    public static dlk1 valueOf(String str) {
        return (dlk1) Enum.valueOf(dlk1.class, str);
    }

    public static dlk1[] values() {
        return (dlk1[]) d.clone();
    }
}
