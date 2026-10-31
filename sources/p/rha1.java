package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rha1 {
    public static final rha1 a;
    public static final rha1 b;
    public static final /* synthetic */ rha1[] c;

    static {
        rha1 rha1Var = new rha1("ASCENDING", 0);
        a = rha1Var;
        rha1 rha1Var2 = new rha1("DESCENDING", 1);
        b = rha1Var2;
        c = new rha1[]{rha1Var, rha1Var2};
    }

    public static rha1 valueOf(String str) {
        return (rha1) Enum.valueOf(rha1.class, str);
    }

    public static rha1[] values() {
        return (rha1[]) c.clone();
    }
}
