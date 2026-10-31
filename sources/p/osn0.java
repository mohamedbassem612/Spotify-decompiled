package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class osn0 {
    public static final osn0 a;
    public static final osn0 b;
    public static final /* synthetic */ osn0[] c;

    static {
        osn0 osn0Var = new osn0("MANAGE_AUTOMATIC_INVITES_TAPPED", 0);
        a = osn0Var;
        osn0 osn0Var2 = new osn0("VIEW_ACTIVITY_TAPPED", 1);
        b = osn0Var2;
        c = new osn0[]{osn0Var, osn0Var2};
    }

    public static osn0 valueOf(String str) {
        return (osn0) Enum.valueOf(osn0.class, str);
    }

    public static osn0[] values() {
        return (osn0[]) c.clone();
    }
}
