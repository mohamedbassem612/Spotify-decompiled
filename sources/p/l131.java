package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l131 {
    public static final l131 a;
    public static final l131 b;
    public static final l131 c;
    public static final l131 d;
    public static final l131 e;
    public static final /* synthetic */ l131[] f;

    static {
        l131 l131Var = new l131("RESTRICTION_REASON_AGE_ASSURANCE", 0);
        a = l131Var;
        l131 l131Var2 = new l131("RESTRICTION_REASON_EXPLICIT_CONTENT", 1);
        b = l131Var2;
        l131 l131Var3 = new l131("RESTRICTION_REASON_AGE_ASSURANCE_19_PLUS", 2);
        c = l131Var3;
        l131 l131Var4 = new l131("RESTRICTION_REASON_UNAVAILABLE_CONTENT", 3);
        d = l131Var4;
        l131 l131Var5 = new l131("RESTRICTION_REASON_OFFLINE_UNAVAILABLE_CONTENT", 4);
        e = l131Var5;
        f = new l131[]{l131Var, l131Var2, l131Var3, l131Var4, l131Var5};
    }

    public static l131 valueOf(String str) {
        return (l131) Enum.valueOf(l131.class, str);
    }

    public static l131[] values() {
        return (l131[]) f.clone();
    }
}
