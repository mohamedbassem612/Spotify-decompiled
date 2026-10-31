package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dzy0 {
    public static final dzy0 a;
    public static final dzy0 b;
    public static final /* synthetic */ dzy0[] c;

    static {
        dzy0 dzy0Var = new dzy0("Utf8", 0);
        a = dzy0Var;
        dzy0 dzy0Var2 = new dzy0("Legacy", 1);
        b = dzy0Var2;
        c = new dzy0[]{dzy0Var, dzy0Var2};
    }

    public static dzy0 valueOf(String str) {
        return (dzy0) Enum.valueOf(dzy0.class, str);
    }

    public static dzy0[] values() {
        return (dzy0[]) c.clone();
    }
}
