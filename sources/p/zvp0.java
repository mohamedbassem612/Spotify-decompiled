package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zvp0 {
    public static final zvp0 a;
    public static final zvp0 b;
    public static final zvp0 c;
    public static final zvp0 d;
    public static final zvp0 e;
    public static final /* synthetic */ zvp0[] f;

    static {
        zvp0 zvp0Var = new zvp0("RowClicked", 0);
        a = zvp0Var;
        zvp0 zvp0Var2 = new zvp0("LongClicked", 1);
        b = zvp0Var2;
        zvp0 zvp0Var3 = new zvp0("ContextMenuClicked", 2);
        c = zvp0Var3;
        zvp0 zvp0Var4 = new zvp0("AddToQueueSwiped", 3);
        d = zvp0Var4;
        zvp0 zvp0Var5 = new zvp0("AddToLibrarySwiped", 4);
        e = zvp0Var5;
        f = new zvp0[]{zvp0Var, zvp0Var2, zvp0Var3, zvp0Var4, zvp0Var5};
    }

    public static zvp0 valueOf(String str) {
        return (zvp0) Enum.valueOf(zvp0.class, str);
    }

    public static zvp0[] values() {
        return (zvp0[]) f.clone();
    }
}
