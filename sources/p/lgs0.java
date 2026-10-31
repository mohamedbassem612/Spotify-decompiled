package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lgs0 {
    public static final lgs0 a;
    public static final lgs0 b;
    public static final /* synthetic */ lgs0[] c;

    static {
        lgs0 lgs0Var = new lgs0("Accept", 0);
        a = lgs0Var;
        lgs0 lgs0Var2 = new lgs0("Deny", 1);
        b = lgs0Var2;
        c = new lgs0[]{lgs0Var, lgs0Var2};
    }

    public static lgs0 valueOf(String str) {
        return (lgs0) Enum.valueOf(lgs0.class, str);
    }

    public static lgs0[] values() {
        return (lgs0[]) c.clone();
    }
}
