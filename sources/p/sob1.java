package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sob1 {
    public static final sob1 a;
    public static final sob1 b;
    public static final sob1 c;
    public static final /* synthetic */ sob1[] d;

    static {
        sob1 sob1Var = new sob1("Initializing", 0);
        a = sob1Var;
        sob1 sob1Var2 = new sob1("Idle", 1);
        b = sob1Var2;
        sob1 sob1Var3 = new sob1("Loading", 2);
        c = sob1Var3;
        d = new sob1[]{sob1Var, sob1Var2, sob1Var3};
    }

    public static sob1 valueOf(String str) {
        return (sob1) Enum.valueOf(sob1.class, str);
    }

    public static sob1[] values() {
        return (sob1[]) d.clone();
    }
}
