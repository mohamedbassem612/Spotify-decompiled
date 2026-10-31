package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class shn0 {
    public static final shn0 a;
    public static final shn0 b;
    public static final /* synthetic */ shn0[] c;

    static {
        shn0 shn0Var = new shn0("PENDING_REQUESTS", 0);
        a = shn0Var;
        shn0 shn0Var2 = new shn0("APPROVED_REQUESTS", 1);
        b = shn0Var2;
        c = new shn0[]{shn0Var, shn0Var2};
    }

    public static shn0 valueOf(String str) {
        return (shn0) Enum.valueOf(shn0.class, str);
    }

    public static shn0[] values() {
        return (shn0[]) c.clone();
    }
}
