package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fde1 {
    public static final fde1 a;
    public static final fde1 b;
    public static final /* synthetic */ fde1[] c;

    static {
        fde1 fde1Var = new fde1("START", 0);
        a = fde1Var;
        fde1 fde1Var2 = new fde1("END", 1);
        b = fde1Var2;
        c = new fde1[]{fde1Var, fde1Var2};
    }

    public static fde1 valueOf(String str) {
        return (fde1) Enum.valueOf(fde1.class, str);
    }

    public static fde1[] values() {
        return (fde1[]) c.clone();
    }
}
