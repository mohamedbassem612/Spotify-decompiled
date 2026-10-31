package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lia1 {
    public static final lia1 a;
    public static final lia1 b;
    public static final lia1 c;
    public static final lia1 d;
    public static final lia1 e;
    public static final /* synthetic */ lia1[] f;

    static {
        lia1 lia1Var = new lia1("NAME", 0);
        b = lia1Var;
        lia1 lia1Var2 = new lia1("ADD_TIME", 1);
        c = lia1Var2;
        lia1 lia1Var3 = new lia1("RECENTLY_UPDATED", 2);
        d = lia1Var3;
        lia1 lia1Var4 = new lia1("RECENTLY_PLAYED_RANK", 3);
        e = lia1Var4;
        f = new lia1[]{lia1Var, lia1Var2, lia1Var3, lia1Var4};
        a = lia1Var3;
    }

    public static lia1 valueOf(String str) {
        return (lia1) Enum.valueOf(lia1.class, str);
    }

    public static lia1[] values() {
        return (lia1[]) f.clone();
    }
}
