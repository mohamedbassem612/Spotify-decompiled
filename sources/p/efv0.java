package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class efv0 {
    public static final efv0 a;
    public static final efv0 b;
    public static final efv0 c;
    public static final /* synthetic */ efv0[] d;

    static {
        efv0 efv0Var = new efv0("SPACER", 0);
        a = efv0Var;
        efv0 efv0Var2 = new efv0("SUBTITLE", 1);
        b = efv0Var2;
        efv0 efv0Var3 = new efv0("DETAILS", 2);
        c = efv0Var3;
        d = new efv0[]{efv0Var, efv0Var2, efv0Var3};
    }

    public static efv0 valueOf(String str) {
        return (efv0) Enum.valueOf(efv0.class, str);
    }

    public static efv0[] values() {
        return (efv0[]) d.clone();
    }
}
