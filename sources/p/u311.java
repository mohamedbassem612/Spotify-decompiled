package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u311 {
    public static final u311 a;
    public static final u311 b;
    public static final u311 c;
    public static final /* synthetic */ u311[] d;

    static {
        u311 u311Var = new u311("UNKNOWN", 0);
        a = u311Var;
        u311 u311Var2 = new u311("NOT_RECORDING", 1);
        b = u311Var2;
        u311 u311Var3 = new u311("RECORDING", 2);
        c = u311Var3;
        d = new u311[]{u311Var, u311Var2, u311Var3};
    }

    public static u311 valueOf(String str) {
        return (u311) Enum.valueOf(u311.class, str);
    }

    public static u311[] values() {
        return (u311[]) d.clone();
    }
}
