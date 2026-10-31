package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jva1 {
    public static final jva1 a;
    public static final jva1 b;
    public static final /* synthetic */ jva1[] c;

    static {
        jva1 jva1Var = new jva1("OnPreviewClicked", 0);
        a = jva1Var;
        jva1 jva1Var2 = new jva1("OnPreviewStopped", 1);
        b = jva1Var2;
        c = new jva1[]{jva1Var, jva1Var2};
    }

    public static jva1 valueOf(String str) {
        return (jva1) Enum.valueOf(jva1.class, str);
    }

    public static jva1[] values() {
        return (jva1[]) c.clone();
    }
}
