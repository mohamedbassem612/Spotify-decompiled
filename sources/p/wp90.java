package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wp90 {
    public static final wp90 a;
    public static final wp90 b;
    public static final wp90 c;
    public static final /* synthetic */ wp90[] d;

    static {
        wp90 wp90Var = new wp90("GotItClicked", 0);
        a = wp90Var;
        wp90 wp90Var2 = new wp90("LeaveClicked", 1);
        b = wp90Var2;
        wp90 wp90Var3 = new wp90("SystemDismissed", 2);
        c = wp90Var3;
        d = new wp90[]{wp90Var, wp90Var2, wp90Var3};
    }

    public static wp90 valueOf(String str) {
        return (wp90) Enum.valueOf(wp90.class, str);
    }

    public static wp90[] values() {
        return (wp90[]) d.clone();
    }
}
