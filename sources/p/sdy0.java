package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sdy0 {
    public static final sdy0 a;
    public static final sdy0 b;
    public static final /* synthetic */ sdy0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    sdy0 EF0;

    static {
        sdy0 sdy0Var = new sdy0("PRETTY", 0);
        sdy0 sdy0Var2 = new sdy0("DEBUG", 1);
        a = sdy0Var2;
        sdy0 sdy0Var3 = new sdy0("NONE", 2);
        b = sdy0Var3;
        c = new sdy0[]{sdy0Var, sdy0Var2, sdy0Var3};
    }

    public static sdy0 valueOf(String str) {
        return (sdy0) Enum.valueOf(sdy0.class, str);
    }

    public static sdy0[] values() {
        return (sdy0[]) c.clone();
    }
}
