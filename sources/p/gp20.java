package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gp20 {
    public static final gp20 a;
    public static final gp20 b;
    public static final /* synthetic */ gp20[] c;

    static {
        gp20 gp20Var = new gp20("EMP", 0);
        a = gp20Var;
        gp20 gp20Var2 = new gp20("GM", 1);
        b = gp20Var2;
        c = new gp20[]{gp20Var, gp20Var2};
    }

    public static gp20 valueOf(String str) {
        return (gp20) Enum.valueOf(gp20.class, str);
    }

    public static gp20[] values() {
        return (gp20[]) c.clone();
    }
}
