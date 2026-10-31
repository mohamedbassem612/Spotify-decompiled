package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class doe0 {
    public static final doe0 a;
    public static final doe0 b;
    public static final /* synthetic */ doe0[] c;

    static {
        doe0 doe0Var = new doe0("SUCCEEDED", 0);
        a = doe0Var;
        doe0 doe0Var2 = new doe0("POST_FAILED", 1);
        b = doe0Var2;
        c = new doe0[]{doe0Var, doe0Var2};
    }

    public static doe0 valueOf(String str) {
        return (doe0) Enum.valueOf(doe0.class, str);
    }

    public static doe0[] values() {
        return (doe0[]) c.clone();
    }
}
