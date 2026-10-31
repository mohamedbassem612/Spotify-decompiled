package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cw70 {
    public static final cw70 a;
    public static final cw70 b;
    public static final /* synthetic */ cw70[] c;

    static {
        cw70 cw70Var = new cw70("LOADED", 0);
        a = cw70Var;
        cw70 cw70Var2 = new cw70("FAILED", 1);
        b = cw70Var2;
        c = new cw70[]{cw70Var, cw70Var2};
    }

    public static cw70 valueOf(String str) {
        return (cw70) Enum.valueOf(cw70.class, str);
    }

    public static cw70[] values() {
        return (cw70[]) c.clone();
    }
}
