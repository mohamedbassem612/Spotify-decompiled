package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mdg0 {
    public static final mdg0 a;
    public static final mdg0 b;
    public static final /* synthetic */ mdg0[] c;

    static {
        mdg0 mdg0Var = new mdg0("CHILD", 0);
        a = mdg0Var;
        mdg0 mdg0Var2 = new mdg0("TEEN", 1);
        b = mdg0Var2;
        c = new mdg0[]{mdg0Var, mdg0Var2};
    }

    public static mdg0 valueOf(String str) {
        return (mdg0) Enum.valueOf(mdg0.class, str);
    }

    public static mdg0[] values() {
        return (mdg0[]) c.clone();
    }
}
