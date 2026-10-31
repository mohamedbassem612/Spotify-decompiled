package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mdg1 {
    public static final mdg1 a;
    public static final mdg1 b;
    public static final /* synthetic */ mdg1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    mdg1 EF0;

    static {
        mdg1 mdg1Var = new mdg1("UNSPECIFIED", 0);
        mdg1 mdg1Var2 = new mdg1("EXPANDED", 1);
        a = mdg1Var2;
        mdg1 mdg1Var3 = new mdg1("DYNAMIC", 2);
        b = mdg1Var3;
        c = new mdg1[]{mdg1Var, mdg1Var2, mdg1Var3};
    }

    public static mdg1 valueOf(String str) {
        return (mdg1) Enum.valueOf(mdg1.class, str);
    }

    public static mdg1[] values() {
        return (mdg1[]) c.clone();
    }
}
