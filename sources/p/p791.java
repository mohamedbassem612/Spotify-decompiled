package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p791 {
    public static final p791 a;
    public static final p791 b;
    public static final /* synthetic */ p791[] c;

    static {
        p791 p791Var = new p791("LANGUAGE_ONBOARDING", 0);
        a = p791Var;
        p791 p791Var2 = new p791("TO_SKIPPABLE", 1);
        b = p791Var2;
        c = new p791[]{p791Var, p791Var2};
    }

    public static p791 valueOf(String str) {
        return (p791) Enum.valueOf(p791.class, str);
    }

    public static p791[] values() {
        return (p791[]) c.clone();
    }
}
