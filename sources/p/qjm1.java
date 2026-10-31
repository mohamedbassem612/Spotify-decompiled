package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qjm1 {
    public static final qjm1 a;
    public static final /* synthetic */ qjm1[] b;

    static {
        qjm1 qjm1Var = new qjm1("POST_FAILED", 0);
        a = qjm1Var;
        b = new qjm1[]{qjm1Var};
    }

    public static qjm1 valueOf(String str) {
        return (qjm1) Enum.valueOf(qjm1.class, str);
    }

    public static qjm1[] values() {
        return (qjm1[]) b.clone();
    }
}
