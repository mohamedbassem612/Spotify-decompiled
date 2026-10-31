package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qek0 {
    public static final qek0 a;
    public static final qek0 b;
    public static final /* synthetic */ qek0[] c;

    static {
        qek0 qek0Var = new qek0("OnConfirmed", 0);
        a = qek0Var;
        qek0 qek0Var2 = new qek0("OnDismissed", 1);
        b = qek0Var2;
        c = new qek0[]{qek0Var, qek0Var2};
    }

    public static qek0 valueOf(String str) {
        return (qek0) Enum.valueOf(qek0.class, str);
    }

    public static qek0[] values() {
        return (qek0[]) c.clone();
    }
}
