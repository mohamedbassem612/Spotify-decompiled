package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661(with = rf70.class)
public final class qf70 {
    public static final pf70 Companion;
    public static final qf70 a;
    public static final qf70 b;
    public static final /* synthetic */ qf70[] c;
    public static final /* synthetic */ t0z d;

    static {
        qf70 qf70Var = new qf70("TEXT", 0);
        a = qf70Var;
        qf70 qf70Var2 = new qf70("UNKNOWN", 1);
        b = qf70Var2;
        qf70[] qf70VarArr = {qf70Var, qf70Var2};
        c = qf70VarArr;
        d = new t0z(qf70VarArr);
        Companion = new pf70();
    }

    public static qf70 valueOf(String str) {
        return (qf70) Enum.valueOf(qf70.class, str);
    }

    public static qf70[] values() {
        return (qf70[]) c.clone();
    }
}
