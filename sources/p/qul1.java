package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qul1 {
    public static final qul1 a;
    public static final qul1 b;
    public static final /* synthetic */ qul1[] c;

    static {
        qul1 qul1Var = new qul1("PLUGGED", 0);
        a = qul1Var;
        qul1 qul1Var2 = new qul1("UNPLUGGED", 1);
        b = qul1Var2;
        c = new qul1[]{qul1Var, qul1Var2};
    }

    public static qul1 valueOf(String str) {
        return (qul1) Enum.valueOf(qul1.class, str);
    }

    public static qul1[] values() {
        return (qul1[]) c.clone();
    }
}
