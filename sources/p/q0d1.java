package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q0d1 {
    public static final q0d1 a;
    public static final q0d1 b;
    public static final q0d1 c;
    public static final /* synthetic */ q0d1[] d;

    static {
        q0d1 q0d1Var = new q0d1("IsExplicit", 0);
        a = q0d1Var;
        q0d1 q0d1Var2 = new q0d1("IsBookLocked", 1);
        b = q0d1Var2;
        q0d1 q0d1Var3 = new q0d1("Granted", 2);
        c = q0d1Var3;
        d = new q0d1[]{q0d1Var, q0d1Var2, q0d1Var3};
    }

    public static q0d1 valueOf(String str) {
        return (q0d1) Enum.valueOf(q0d1.class, str);
    }

    public static q0d1[] values() {
        return (q0d1[]) d.clone();
    }
}
