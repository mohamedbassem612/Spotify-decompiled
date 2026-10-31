package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ice0 {
    public static final ice0 a;
    public static final ice0 b;
    public static final ice0 c;
    public static final ice0 d;
    public static final ice0 e;
    public static final ice0 f;
    public static final /* synthetic */ ice0[] g;

    static {
        ice0 ice0Var = new ice0("CACHE_FIRST", 0);
        a = ice0Var;
        ice0 ice0Var2 = new ice0("RESTORE_OR_REVALIDATE", 1);
        b = ice0Var2;
        ice0 ice0Var3 = new ice0("REVALIDATE", 2);
        c = ice0Var3;
        ice0 ice0Var4 = new ice0("CUSTOM_TIMEOUT", 3);
        d = ice0Var4;
        ice0 ice0Var5 = new ice0("OFFLINE_FALLBACK", 4);
        e = ice0Var5;
        ice0 ice0Var6 = new ice0("REFRESH", 5);
        f = ice0Var6;
        g = new ice0[]{ice0Var, ice0Var2, ice0Var3, ice0Var4, ice0Var5, ice0Var6};
    }

    public static ice0 valueOf(String str) {
        return (ice0) Enum.valueOf(ice0.class, str);
    }

    public static ice0[] values() {
        return (ice0[]) g.clone();
    }
}
