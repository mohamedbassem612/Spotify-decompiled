package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class swt0 {
    public static final swt0 a;
    public static final swt0 b;
    public static final /* synthetic */ swt0[] c;

    static {
        swt0 swt0Var = new swt0("Unspecified", 0);
        a = swt0Var;
        swt0 swt0Var2 = new swt0("ChapterSkip", 1);
        b = swt0Var2;
        c = new swt0[]{swt0Var, swt0Var2};
    }

    public static swt0 valueOf(String str) {
        return (swt0) Enum.valueOf(swt0.class, str);
    }

    public static swt0[] values() {
        return (swt0[]) c.clone();
    }
}
