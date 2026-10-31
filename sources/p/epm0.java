package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class epm0 {
    public static final epm0 a;
    public static final epm0 b;
    public static final epm0 c;
    public static final epm0 d;
    public static final epm0 e;
    public static final /* synthetic */ epm0[] f;

    static {
        epm0 epm0Var = new epm0("IDLE", 0);
        a = epm0Var;
        epm0 epm0Var2 = new epm0("SYNCING", 1);
        b = epm0Var2;
        epm0 epm0Var3 = new epm0("SYNCED", 2);
        c = epm0Var3;
        epm0 epm0Var4 = new epm0("PRUNING", 3);
        d = epm0Var4;
        epm0 epm0Var5 = new epm0("CANCELLED", 4);
        e = epm0Var5;
        f = new epm0[]{epm0Var, epm0Var2, epm0Var3, epm0Var4, epm0Var5};
    }

    public static epm0 valueOf(String str) {
        return (epm0) Enum.valueOf(epm0.class, str);
    }

    public static epm0[] values() {
        return (epm0[]) f.clone();
    }
}
