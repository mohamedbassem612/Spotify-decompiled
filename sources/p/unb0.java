package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class unb0 {
    public static final unb0 a;
    public static final unb0 b;
    public static final /* synthetic */ unb0[] c;

    static {
        unb0 unb0Var = new unb0("Compact", 0);
        a = unb0Var;
        unb0 unb0Var2 = new unb0("Expanded", 1);
        b = unb0Var2;
        c = new unb0[]{unb0Var, unb0Var2};
    }

    public static unb0 valueOf(String str) {
        return (unb0) Enum.valueOf(unb0.class, str);
    }

    public static unb0[] values() {
        return (unb0[]) c.clone();
    }
}
