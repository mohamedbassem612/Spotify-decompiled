package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h3t0 {
    public static final h3t0 a;
    public static final h3t0 b;
    public static final /* synthetic */ h3t0[] c;

    static {
        h3t0 h3t0Var = new h3t0("TogglePiPSetting", 0);
        a = h3t0Var;
        h3t0 h3t0Var2 = new h3t0("NavigateToOsPipSetting", 1);
        b = h3t0Var2;
        c = new h3t0[]{h3t0Var, h3t0Var2};
    }

    public static h3t0 valueOf(String str) {
        return (h3t0) Enum.valueOf(h3t0.class, str);
    }

    public static h3t0[] values() {
        return (h3t0[]) c.clone();
    }
}
