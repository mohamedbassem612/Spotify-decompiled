package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yks0 {
    public static final yks0 a;
    public static final yks0 b;
    public static final yks0 c;
    public static final yks0 d;
    public static final yks0 e;
    public static final yks0 f;
    public static final yks0 g;
    public static final /* synthetic */ yks0[] h;

    static {
        yks0 yks0Var = new yks0("Unspecified", 0);
        a = yks0Var;
        yks0 yks0Var2 = new yks0("Initiator", 1);
        b = yks0Var2;
        yks0 yks0Var3 = new yks0("Accepted", 2);
        c = yks0Var3;
        yks0 yks0Var4 = new yks0("Pending", 3);
        d = yks0Var4;
        yks0 yks0Var5 = new yks0("Rejected", 4);
        e = yks0Var5;
        yks0 yks0Var6 = new yks0("Deleted", 5);
        f = yks0Var6;
        yks0 yks0Var7 = new yks0("Left", 6);
        g = yks0Var7;
        h = new yks0[]{yks0Var, yks0Var2, yks0Var3, yks0Var4, yks0Var5, yks0Var6, yks0Var7};
    }

    public static yks0 valueOf(String str) {
        return (yks0) Enum.valueOf(yks0.class, str);
    }

    public static yks0[] values() {
        return (yks0[]) h.clone();
    }
}
