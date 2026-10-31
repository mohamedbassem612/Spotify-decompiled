package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j581 implements ysi1 {
    public static final j581 a;
    public static final j581 b;
    public static final j581 c;
    public static final j581 d;
    public static final j581 e;
    public static final j581 f;
    public static final j581 g;
    public static final j581 h;
    public static final /* synthetic */ j581[] i;

    static {
        j581 j581Var = new j581("SHOW_GATED_VALUE_PROP_UNKNOWN", 0);
        a = j581Var;
        j581 j581Var2 = new j581("SHOW_GATED_VALUE_PROP_UNSPECIFIED", 1);
        b = j581Var2;
        j581 j581Var3 = new j581("SHOW_GATED_VALUE_PROP_AD_FREE", 2);
        c = j581Var3;
        j581 j581Var4 = new j581("SHOW_GATED_VALUE_PROP_EXTENDED", 3);
        d = j581Var4;
        j581 j581Var5 = new j581("SHOW_GATED_VALUE_PROP_EARLY_ACCESS", 4);
        e = j581Var5;
        j581 j581Var6 = new j581("SHOW_GATED_VALUE_PROP_VIDEO", 5);
        f = j581Var6;
        j581 j581Var7 = new j581("SHOW_GATED_VALUE_PROP_FULL_LENGTH_EPISODES", 6);
        g = j581Var7;
        j581 j581Var8 = new j581("SHOW_GATED_VALUE_PROP_BONUS", 7);
        h = j581Var8;
        i = new j581[]{j581Var, j581Var2, j581Var3, j581Var4, j581Var5, j581Var6, j581Var7, j581Var8};
    }

    public static j581 valueOf(String str) {
        return (j581) Enum.valueOf(j581.class, str);
    }

    public static j581[] values() {
        return (j581[]) i.clone();
    }
}
