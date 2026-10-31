package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fpy0 {
    public static final fpy0 a;
    public static final fpy0 b;
    public static final fpy0 c;
    public static final fpy0 d;
    public static final /* synthetic */ fpy0[] e;

    static {
        fpy0 fpy0Var = new fpy0("EMPTY", 0);
        a = fpy0Var;
        fpy0 fpy0Var2 = new fpy0("GENERAL_ERROR", 1);
        b = fpy0Var2;
        fpy0 fpy0Var3 = new fpy0("INVALID_FILE", 2);
        c = fpy0Var3;
        fpy0 fpy0Var4 = new fpy0("NOT_COMPATIBLE_WITH_RUNTIME", 3);
        d = fpy0Var4;
        e = new fpy0[]{fpy0Var, fpy0Var2, fpy0Var3, fpy0Var4};
    }

    public static fpy0 valueOf(String str) {
        return (fpy0) Enum.valueOf(fpy0.class, str);
    }

    public static fpy0[] values() {
        return (fpy0[]) e.clone();
    }
}
