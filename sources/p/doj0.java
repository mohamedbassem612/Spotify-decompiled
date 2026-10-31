package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class doj0 {
    public static final doj0 a;
    public static final doj0 b;
    public static final /* synthetic */ doj0[] c;

    static {
        doj0 doj0Var = new doj0("OneLineMetadata", 0);
        a = doj0Var;
        doj0 doj0Var2 = new doj0("TwoLineMetadata", 1);
        b = doj0Var2;
        c = new doj0[]{doj0Var, doj0Var2};
    }

    public static doj0 valueOf(String str) {
        return (doj0) Enum.valueOf(doj0.class, str);
    }

    public static doj0[] values() {
        return (doj0[]) c.clone();
    }
}
