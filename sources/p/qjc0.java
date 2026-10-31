package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qjc0 {
    public static final qjc0 a;
    public static final qjc0 b;
    public static final /* synthetic */ qjc0[] c;

    static {
        qjc0 qjc0Var = new qjc0("SOURCE", 0);
        a = qjc0Var;
        qjc0 qjc0Var2 = new qjc0("INTERNAL", 1);
        b = qjc0Var2;
        c = new qjc0[]{qjc0Var, qjc0Var2};
    }

    public static qjc0 valueOf(String str) {
        return (qjc0) Enum.valueOf(qjc0.class, str);
    }

    public static qjc0[] values() {
        return (qjc0[]) c.clone();
    }
}
