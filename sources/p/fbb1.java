package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fbb1 {
    public static final fbb1 a;
    public static final fbb1 b;
    public static final /* synthetic */ fbb1[] c;

    static {
        fbb1 fbb1Var = new fbb1("Normal", 0);
        a = fbb1Var;
        fbb1 fbb1Var2 = new fbb1("FullBleed", 1);
        b = fbb1Var2;
        c = new fbb1[]{fbb1Var, fbb1Var2};
    }

    public static fbb1 valueOf(String str) {
        return (fbb1) Enum.valueOf(fbb1.class, str);
    }

    public static fbb1[] values() {
        return (fbb1[]) c.clone();
    }
}
