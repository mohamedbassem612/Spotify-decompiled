package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eb71 {
    public static final eb71 a;
    public static final eb71 b;
    public static final /* synthetic */ eb71[] c;

    static {
        eb71 eb71Var = new eb71("VISIBLE", 0);
        a = eb71Var;
        eb71 eb71Var2 = new eb71("HIDDEN", 1);
        b = eb71Var2;
        c = new eb71[]{eb71Var, eb71Var2};
    }

    public static eb71 valueOf(String str) {
        return (eb71) Enum.valueOf(eb71.class, str);
    }

    public static eb71[] values() {
        return (eb71[]) c.clone();
    }
}
