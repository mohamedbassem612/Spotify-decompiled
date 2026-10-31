package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pfz0 {
    public static final pfz0 a;
    public static final pfz0 b;
    public static final /* synthetic */ pfz0[] c;

    static {
        pfz0 pfz0Var = new pfz0("DARK", 0);
        a = pfz0Var;
        pfz0 pfz0Var2 = new pfz0("LIGHT", 1);
        b = pfz0Var2;
        c = new pfz0[]{pfz0Var, pfz0Var2};
    }

    public static pfz0 valueOf(String str) {
        return (pfz0) Enum.valueOf(pfz0.class, str);
    }

    public static pfz0[] values() {
        return (pfz0[]) c.clone();
    }
}
