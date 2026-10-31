package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wtf1 {
    public static final wtf1 a;
    public static final wtf1 b;
    public static final /* synthetic */ wtf1[] c;

    static {
        wtf1 wtf1Var = new wtf1("READY", 0);
        a = wtf1Var;
        wtf1 wtf1Var2 = new wtf1("FAILED", 1);
        b = wtf1Var2;
        c = new wtf1[]{wtf1Var, wtf1Var2};
    }

    public static wtf1 valueOf(String str) {
        return (wtf1) Enum.valueOf(wtf1.class, str);
    }

    public static wtf1[] values() {
        return (wtf1[]) c.clone();
    }
}
