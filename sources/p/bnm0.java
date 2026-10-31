package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bnm0 {
    public static final bnm0 a;
    public static final bnm0 b;
    public static final bnm0 c;
    public static final bnm0 d;
    public static final /* synthetic */ bnm0[] e;

    static {
        bnm0 bnm0Var = new bnm0("UNDEFINED", 0);
        a = bnm0Var;
        bnm0 bnm0Var2 = new bnm0("SETUP", 1);
        b = bnm0Var2;
        bnm0 bnm0Var3 = new bnm0("MOVING", 2);
        c = bnm0Var3;
        bnm0 bnm0Var4 = new bnm0("FINISHED", 3);
        d = bnm0Var4;
        e = new bnm0[]{bnm0Var, bnm0Var2, bnm0Var3, bnm0Var4};
    }

    public static bnm0 valueOf(String str) {
        return (bnm0) Enum.valueOf(bnm0.class, str);
    }

    public static bnm0[] values() {
        return (bnm0[]) e.clone();
    }
}
