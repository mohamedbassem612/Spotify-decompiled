package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mlq0 {
    public static final mlq0 a;
    public static final mlq0 b;
    public static final /* synthetic */ mlq0[] c;

    static {
        mlq0 mlq0Var = new mlq0("DOWNLOAD", 0);
        a = mlq0Var;
        mlq0 mlq0Var2 = new mlq0("REMOVAL", 1);
        b = mlq0Var2;
        c = new mlq0[]{mlq0Var, mlq0Var2};
    }

    public static mlq0 valueOf(String str) {
        return (mlq0) Enum.valueOf(mlq0.class, str);
    }

    public static mlq0[] values() {
        return (mlq0[]) c.clone();
    }
}
