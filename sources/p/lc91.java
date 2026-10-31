package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lc91 {
    public static final lc91 a;
    public static final lc91 b;
    public static final /* synthetic */ lc91[] c;

    static {
        lc91 lc91Var = new lc91("Inner", 0);
        a = lc91Var;
        lc91 lc91Var2 = new lc91("Items", 1);
        b = lc91Var2;
        c = new lc91[]{lc91Var, lc91Var2};
    }

    public static lc91 valueOf(String str) {
        return (lc91) Enum.valueOf(lc91.class, str);
    }

    public static lc91[] values() {
        return (lc91[]) c.clone();
    }
}
