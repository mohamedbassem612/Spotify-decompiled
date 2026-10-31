package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rlj1 {
    public static final rlj1 a;
    public static final rlj1 b;
    public static final rlj1 c;
    public static final rlj1 d;
    public static final /* synthetic */ rlj1[] e;

    static {
        rlj1 rlj1Var = new rlj1("None", 0);
        a = rlj1Var;
        rlj1 rlj1Var2 = new rlj1("AddFilter", 1);
        b = rlj1Var2;
        rlj1 rlj1Var3 = new rlj1("RemoveFilter", 2);
        c = rlj1Var3;
        rlj1 rlj1Var4 = new rlj1("DeactivateAndRemoveFilter", 3);
        d = rlj1Var4;
        e = new rlj1[]{rlj1Var, rlj1Var2, rlj1Var3, rlj1Var4};
    }

    public static rlj1 valueOf(String str) {
        return (rlj1) Enum.valueOf(rlj1.class, str);
    }

    public static rlj1[] values() {
        return (rlj1[]) e.clone();
    }
}
