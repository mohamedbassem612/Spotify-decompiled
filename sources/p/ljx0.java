package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ljx0 {
    public static final ljx0 a;
    public static final ljx0 b;
    public static final ljx0 c;
    public static final ljx0 d;
    public static final ljx0 e;
    public static final /* synthetic */ ljx0[] f;

    static {
        ljx0 ljx0Var = new ljx0("NOT_STARTED", 0);
        a = ljx0Var;
        ljx0 ljx0Var2 = new ljx0("SHOWING_SKELETON", 1);
        b = ljx0Var2;
        ljx0 ljx0Var3 = new ljx0("FIRST_CHIP_LABELED", 2);
        c = ljx0Var3;
        ljx0 ljx0Var4 = new ljx0("EXPANDING_CHIPS", 3);
        d = ljx0Var4;
        ljx0 ljx0Var5 = new ljx0("FULLY_LOADED", 4);
        e = ljx0Var5;
        f = new ljx0[]{ljx0Var, ljx0Var2, ljx0Var3, ljx0Var4, ljx0Var5};
    }

    public static ljx0 valueOf(String str) {
        return (ljx0) Enum.valueOf(ljx0.class, str);
    }

    public static ljx0[] values() {
        return (ljx0[]) f.clone();
    }
}
