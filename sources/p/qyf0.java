package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qyf0 {
    public static final qyf0 a;
    public static final qyf0 b;
    public static final /* synthetic */ qyf0[] c;
    public static final /* synthetic */ t0z d;

    static {
        qyf0 qyf0Var = new qyf0("VERTICAL", 0);
        a = qyf0Var;
        qyf0 qyf0Var2 = new qyf0("HORIZONTAL", 1);
        qyf0 qyf0Var3 = new qyf0("LARGE", 2);
        b = qyf0Var3;
        qyf0[] qyf0VarArr = {qyf0Var, qyf0Var2, qyf0Var3};
        c = qyf0VarArr;
        d = new t0z(qyf0VarArr);
    }

    public static qyf0 valueOf(String str) {
        return (qyf0) Enum.valueOf(qyf0.class, str);
    }

    public static qyf0[] values() {
        return (qyf0[]) c.clone();
    }
}
