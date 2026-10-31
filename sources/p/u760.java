package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u760 {
    public static final u760 a;
    public static final u760 b;
    public static final u760 c;
    public static final u760 d;
    public static final /* synthetic */ u760[] e;

    static {
        u760 u760Var = new u760("LOADED", 0);
        a = u760Var;
        u760 u760Var2 = new u760("FAILED", 1);
        b = u760Var2;
        u760 u760Var3 = new u760("ABSENT", 2);
        c = u760Var3;
        u760 u760Var4 = new u760("BLOCKED", 3);
        d = u760Var4;
        e = new u760[]{u760Var, u760Var2, u760Var3, u760Var4};
    }

    public static u760 valueOf(String str) {
        return (u760) Enum.valueOf(u760.class, str);
    }

    public static u760[] values() {
        return (u760[]) e.clone();
    }
}
