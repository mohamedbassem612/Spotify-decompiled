package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qiv0 {
    public static final qiv0 a;
    public static final /* synthetic */ qiv0[] b;

    static {
        qiv0 qiv0Var = new qiv0("Clicked", 0);
        a = qiv0Var;
        b = new qiv0[]{qiv0Var};
    }

    public static qiv0 valueOf(String str) {
        return (qiv0) Enum.valueOf(qiv0.class, str);
    }

    public static qiv0[] values() {
        return (qiv0[]) b.clone();
    }
}
