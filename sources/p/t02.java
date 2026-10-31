package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t02 {
    public static final t02 a;
    public static final t02 b;
    public static final /* synthetic */ t02[] c;

    static {
        t02 t02Var = new t02("UNKNOWN", 0);
        a = t02Var;
        t02 t02Var2 = new t02("MAY_CHANGE_ADDON_SESSION_STATE", 1);
        b = t02Var2;
        c = new t02[]{t02Var, t02Var2};
    }

    public static t02 valueOf(String str) {
        return (t02) Enum.valueOf(t02.class, str);
    }

    public static t02[] values() {
        return (t02[]) c.clone();
    }
}
