package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class at80 {
    public static final at80 a;
    public static final at80 b;
    public static final at80 c;
    public static final /* synthetic */ at80[] d;

    static {
        at80 at80Var = new at80("CONTROL", 0);
        a = at80Var;
        at80 at80Var2 = new at80("EMAIL", 1);
        b = at80Var2;
        at80 at80Var3 = new at80("PHONE_NUMBER", 2);
        c = at80Var3;
        d = new at80[]{at80Var, at80Var2, at80Var3};
    }

    public static at80 valueOf(String str) {
        return (at80) Enum.valueOf(at80.class, str);
    }

    public static at80[] values() {
        return (at80[]) d.clone();
    }
}
