package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ewt0 {
    public static final ewt0 a;
    public static final ewt0 b;
    public static final ewt0 c;
    public static final ewt0 d;
    public static final ewt0 e;
    public static final /* synthetic */ ewt0[] f;

    static {
        ewt0 ewt0Var = new ewt0("Explicit", 0);
        a = ewt0Var;
        ewt0 ewt0Var2 = new ewt0("Age", 1);
        b = ewt0Var2;
        ewt0 ewt0Var3 = new ewt0("UnavailableOffline", 2);
        c = ewt0Var3;
        ewt0 ewt0Var4 = new ewt0("BlockedByAccountManager", 3);
        d = ewt0Var4;
        ewt0 ewt0Var5 = new ewt0("Unknown", 4);
        e = ewt0Var5;
        f = new ewt0[]{ewt0Var, ewt0Var2, ewt0Var3, ewt0Var4, ewt0Var5};
    }

    public static ewt0 valueOf(String str) {
        return (ewt0) Enum.valueOf(ewt0.class, str);
    }

    public static ewt0[] values() {
        return (ewt0[]) f.clone();
    }
}
