package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ojp0 {
    public static final ojp0 a;
    public static final ojp0 b;
    public static final ojp0 c;
    public static final /* synthetic */ ojp0[] d;

    static {
        ojp0 ojp0Var = new ojp0("NO_OP", 0);
        a = ojp0Var;
        ojp0 ojp0Var2 = new ojp0("ADD", 1);
        b = ojp0Var2;
        ojp0 ojp0Var3 = new ojp0("REMOVE", 2);
        c = ojp0Var3;
        d = new ojp0[]{ojp0Var, ojp0Var2, ojp0Var3};
    }

    public static ojp0 valueOf(String str) {
        return (ojp0) Enum.valueOf(ojp0.class, str);
    }

    public static ojp0[] values() {
        return (ojp0[]) d.clone();
    }
}
