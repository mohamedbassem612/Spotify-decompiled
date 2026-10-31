package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t861 {
    public static final t861 a;
    public static final t861 b;
    public static final t861 c;
    public static final t861 d;
    public static final t861 e;
    public static final /* synthetic */ t861[] f;

    static {
        t861 t861Var = new t861("SDK_INIT_WAIT_LOCK", 0);
        a = t861Var;
        t861 t861Var2 = new t861("GAID_FETCH_WAIT_LOCK", 1);
        b = t861Var2;
        t861 t861Var3 = new t861("INTENT_PENDING_WAIT_LOCK", 2);
        c = t861Var3;
        t861 t861Var4 = new t861("USER_SET_WAIT_LOCK", 3);
        t861 t861Var5 = new t861("INSTALL_REFERRER_FETCH_WAIT_LOCK", 4);
        d = t861Var5;
        t861 t861Var6 = new t861("USER_AGENT_STRING_LOCK", 5);
        e = t861Var6;
        f = new t861[]{t861Var, t861Var2, t861Var3, t861Var4, t861Var5, t861Var6};
    }

    public static t861 valueOf(String str) {
        return (t861) Enum.valueOf(t861.class, str);
    }

    public static t861[] values() {
        return (t861[]) f.clone();
    }
}
