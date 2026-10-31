package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t3j0 {
    public static final t3j0 a;
    public static final t3j0 b;
    public static final t3j0 c;
    public static final /* synthetic */ t3j0[] d;

    static {
        t3j0 t3j0Var = new t3j0("UNINITIALIZED", 0);
        a = t3j0Var;
        t3j0 t3j0Var2 = new t3j0("STARTED", 1);
        b = t3j0Var2;
        t3j0 t3j0Var3 = new t3j0("PAUSED", 2);
        c = t3j0Var3;
        d = new t3j0[]{t3j0Var, t3j0Var2, t3j0Var3};
    }

    public static t3j0 valueOf(String str) {
        return (t3j0) Enum.valueOf(t3j0.class, str);
    }

    public static t3j0[] values() {
        return (t3j0[]) d.clone();
    }
}
