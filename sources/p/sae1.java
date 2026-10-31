package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sae1 {
    public static final sae1 a;
    public static final sae1 b;
    public static final /* synthetic */ sae1[] c;

    static {
        sae1 sae1Var = new sae1("LONG", 0);
        a = sae1Var;
        sae1 sae1Var2 = new sae1("SHORT", 1);
        b = sae1Var2;
        c = new sae1[]{sae1Var, sae1Var2};
    }

    public static sae1 valueOf(String str) {
        return (sae1) Enum.valueOf(sae1.class, str);
    }

    public static sae1[] values() {
        return (sae1[]) c.clone();
    }
}
