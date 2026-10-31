package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ib71 {
    public static final ib71 a;
    public static final ib71 b;
    public static final /* synthetic */ ib71[] c;

    static {
        ib71 ib71Var = new ib71("Explicit", 0);
        a = ib71Var;
        ib71 ib71Var2 = new ib71("NineteenPlus", 1);
        b = ib71Var2;
        c = new ib71[]{ib71Var, ib71Var2};
    }

    public static ib71 valueOf(String str) {
        return (ib71) Enum.valueOf(ib71.class, str);
    }

    public static ib71[] values() {
        return (ib71[]) c.clone();
    }
}
