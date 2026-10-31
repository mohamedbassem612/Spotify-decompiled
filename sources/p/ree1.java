package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ree1 {
    public static final ree1 a;
    public static final ree1 b;
    public static final ree1 c;
    public static final /* synthetic */ ree1[] d;

    static {
        ree1 ree1Var = new ree1("None", 0);
        a = ree1Var;
        ree1 ree1Var2 = new ree1("Cursor", 1);
        b = ree1Var2;
        ree1 ree1Var3 = new ree1("Selection", 2);
        c = ree1Var3;
        d = new ree1[]{ree1Var, ree1Var2, ree1Var3};
    }

    public static ree1 valueOf(String str) {
        return (ree1) Enum.valueOf(ree1.class, str);
    }

    public static ree1[] values() {
        return (ree1[]) d.clone();
    }
}
