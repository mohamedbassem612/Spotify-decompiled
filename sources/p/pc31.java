package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pc31 {
    public static final pc31 a;
    public static final pc31 b;
    public static final /* synthetic */ pc31[] c;

    static {
        pc31 pc31Var = new pc31("POSITIVE_BUTTON_CLICKED", 0);
        a = pc31Var;
        pc31 pc31Var2 = new pc31("NEGATIVE_BUTTON_CLICKED", 1);
        b = pc31Var2;
        c = new pc31[]{pc31Var, pc31Var2};
    }

    public static pc31 valueOf(String str) {
        return (pc31) Enum.valueOf(pc31.class, str);
    }

    public static pc31[] values() {
        return (pc31[]) c.clone();
    }
}
