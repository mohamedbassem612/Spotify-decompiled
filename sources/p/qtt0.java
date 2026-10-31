package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qtt0 {
    public static final qtt0 a;
    public static final qtt0 b;
    public static final qtt0 c;
    public static final qtt0 d;
    public static final qtt0 e;
    public static final qtt0 f;
    public static final qtt0 g;
    public static final qtt0 h;
    public static final /* synthetic */ qtt0[] i;

    static {
        qtt0 qtt0Var = new qtt0("Unknown", 0);
        a = qtt0Var;
        qtt0 qtt0Var2 = new qtt0("NoRestriction", 1);
        b = qtt0Var2;
        qtt0 qtt0Var3 = new qtt0("PremiumOnly", 2);
        c = qtt0Var3;
        qtt0 qtt0Var4 = new qtt0("ExplicitContent", 3);
        d = qtt0Var4;
        qtt0 qtt0Var5 = new qtt0("AgeRestricted", 4);
        e = qtt0Var5;
        qtt0 qtt0Var6 = new qtt0("NotInCatalogue", 5);
        f = qtt0Var6;
        qtt0 qtt0Var7 = new qtt0("NotAvailableOffline", 6);
        g = qtt0Var7;
        qtt0 qtt0Var8 = new qtt0("BlockedByAccountManager", 7);
        h = qtt0Var8;
        i = new qtt0[]{qtt0Var, qtt0Var2, qtt0Var3, qtt0Var4, qtt0Var5, qtt0Var6, qtt0Var7, qtt0Var8};
    }

    public static qtt0 valueOf(String str) {
        return (qtt0) Enum.valueOf(qtt0.class, str);
    }

    public static qtt0[] values() {
        return (qtt0[]) i.clone();
    }
}
