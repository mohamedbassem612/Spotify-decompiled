package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n3j1 implements k260 {
    public static final n3j1 a;
    public static final /* synthetic */ n3j1[] b;

    static {
        n3j1 n3j1Var = new n3j1("VerifiedBadge", 0);
        a = n3j1Var;
        b = new n3j1[]{n3j1Var};
    }

    public static n3j1 valueOf(String str) {
        return (n3j1) Enum.valueOf(n3j1.class, str);
    }

    public static n3j1[] values() {
        return (n3j1[]) b.clone();
    }
}
