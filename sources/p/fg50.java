package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fg50 {
    public static final fg50 a;
    public static final fg50 b;
    public static final /* synthetic */ fg50[] c;

    static {
        fg50 fg50Var = new fg50("MINIMIZE_EMPTY_SPACE", 0);
        a = fg50Var;
        fg50 fg50Var2 = new fg50("MAXIMIZE_ITEMS_SHOWN", 1);
        b = fg50Var2;
        c = new fg50[]{fg50Var, fg50Var2};
    }

    public static fg50 valueOf(String str) {
        return (fg50) Enum.valueOf(fg50.class, str);
    }

    public static fg50[] values() {
        return (fg50[]) c.clone();
    }
}
