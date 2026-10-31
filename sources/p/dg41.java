package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dg41 {
    public static final dg41 a;
    public static final dg41 b;
    public static final /* synthetic */ dg41[] c;

    static {
        dg41 dg41Var = new dg41("FILL", 0);
        a = dg41Var;
        dg41 dg41Var2 = new dg41("FIT", 1);
        b = dg41Var2;
        c = new dg41[]{dg41Var, dg41Var2};
    }

    public static dg41 valueOf(String str) {
        return (dg41) Enum.valueOf(dg41.class, str);
    }

    public static dg41[] values() {
        return (dg41[]) c.clone();
    }
}
