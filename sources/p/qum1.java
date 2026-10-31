package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qum1 {
    public static final qum1 a;
    public static final /* synthetic */ qum1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    qum1 EF0;

    static {
        qum1 qum1Var = new qum1("PODCAST_DOWNLOADS", 0);
        qum1 qum1Var2 = new qum1("PODCAST_EPISODES", 1);
        a = qum1Var2;
        b = new qum1[]{qum1Var, qum1Var2, new qum1("PODCAST_FOLLOWED", 2)};
    }

    public static qum1 valueOf(String str) {
        return (qum1) Enum.valueOf(qum1.class, str);
    }

    public static qum1[] values() {
        return (qum1[]) b.clone();
    }
}
