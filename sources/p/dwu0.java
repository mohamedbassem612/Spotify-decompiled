package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dwu0 {
    public static final dwu0 a;
    public static final dwu0 b;
    public static final /* synthetic */ dwu0[] c;

    static {
        dwu0 dwu0Var = new dwu0("On", 0);
        a = dwu0Var;
        dwu0 dwu0Var2 = new dwu0("Off", 1);
        b = dwu0Var2;
        c = new dwu0[]{dwu0Var, dwu0Var2};
    }

    public static dwu0 valueOf(String str) {
        return (dwu0) Enum.valueOf(dwu0.class, str);
    }

    public static dwu0[] values() {
        return (dwu0[]) c.clone();
    }
}
