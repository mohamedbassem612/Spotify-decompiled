package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ki3 {
    public static final ki3 a;
    public static final ki3 b;
    public static final ki3 c;
    public static final ki3 d;
    public static final /* synthetic */ ki3[] e;

    static {
        ki3 ki3Var = new ki3("LINK", 0);
        a = ki3Var;
        ki3 ki3Var2 = new ki3("LINKING", 1);
        b = ki3Var2;
        ki3 ki3Var3 = new ki3("SET_AS_DEFAULT", 2);
        c = ki3Var3;
        ki3 ki3Var4 = new ki3("ERROR", 3);
        d = ki3Var4;
        e = new ki3[]{ki3Var, ki3Var2, ki3Var3, ki3Var4};
    }

    public static ki3 valueOf(String str) {
        return (ki3) Enum.valueOf(ki3.class, str);
    }

    public static ki3[] values() {
        return (ki3[]) e.clone();
    }
}
