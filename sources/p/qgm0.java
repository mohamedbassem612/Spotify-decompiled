package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qgm0 {
    public static final qgm0 a;
    public static final qgm0 b;
    public static final qgm0 c;
    public static final qgm0 d;
    public static final qgm0 e;
    public static final qgm0 f;
    public static final qgm0 g;
    public static final qgm0 h;
    public static final qgm0 i;
    public static final /* synthetic */ qgm0[] t;

    static {
        qgm0 qgm0Var = new qgm0("IDLE", 0);
        a = qgm0Var;
        qgm0 qgm0Var2 = new qgm0("RELOADING", 1);
        b = qgm0Var2;
        qgm0 qgm0Var3 = new qgm0("RELOADING_INVALID_PAYMENT", 2);
        c = qgm0Var3;
        qgm0 qgm0Var4 = new qgm0("EDITING_ADDRESS", 3);
        d = qgm0Var4;
        qgm0 qgm0Var5 = new qgm0("EDITING_PAYMENT", 4);
        e = qgm0Var5;
        qgm0 qgm0Var6 = new qgm0("EJECTED_TO_WEB", 5);
        f = qgm0Var6;
        qgm0 qgm0Var7 = new qgm0("CHECKING_IF_COMPLETE", 6);
        g = qgm0Var7;
        qgm0 qgm0Var8 = new qgm0("SUBMITTING_CHECKOUT", 7);
        h = qgm0Var8;
        qgm0 qgm0Var9 = new qgm0("SUBMITTING_CHECKOUT_WITH_CPD", 8);
        i = qgm0Var9;
        t = new qgm0[]{qgm0Var, qgm0Var2, qgm0Var3, qgm0Var4, qgm0Var5, qgm0Var6, qgm0Var7, qgm0Var8, qgm0Var9};
    }

    public static qgm0 valueOf(String str) {
        return (qgm0) Enum.valueOf(qgm0.class, str);
    }

    public static qgm0[] values() {
        return (qgm0[]) t.clone();
    }
}
