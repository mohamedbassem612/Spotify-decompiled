package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6i0 {
    public static final o6i0 a;
    public static final o6i0 b;
    public static final /* synthetic */ o6i0[] c;

    static {
        o6i0 o6i0Var = new o6i0("VIDEO", 0);
        a = o6i0Var;
        o6i0 o6i0Var2 = new o6i0("AUDIO", 1);
        b = o6i0Var2;
        c = new o6i0[]{o6i0Var, o6i0Var2};
    }

    public static o6i0 valueOf(String str) {
        return (o6i0) Enum.valueOf(o6i0.class, str);
    }

    public static o6i0[] values() {
        return (o6i0[]) c.clone();
    }
}
