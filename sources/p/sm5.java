package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sm5 {
    public static final sm5 a;
    public static final sm5 b;
    public static final /* synthetic */ sm5[] c;

    static {
        sm5 sm5Var = new sm5("MOBILE_INSTALL_EVENT", 0);
        a = sm5Var;
        sm5 sm5Var2 = new sm5("CUSTOM_APP_EVENTS", 1);
        b = sm5Var2;
        c = new sm5[]{sm5Var, sm5Var2};
    }

    public static sm5 valueOf(String str) {
        return (sm5) Enum.valueOf(sm5.class, str);
    }

    public static sm5[] values() {
        return (sm5[]) c.clone();
    }
}
