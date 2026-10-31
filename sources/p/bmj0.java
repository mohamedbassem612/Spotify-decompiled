package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bmj0 implements k260 {
    public static final bmj0 a;
    public static final /* synthetic */ bmj0[] b;

    static {
        bmj0 bmj0Var = new bmj0("MonthlyListeners", 0);
        a = bmj0Var;
        b = new bmj0[]{bmj0Var};
    }

    public static bmj0 valueOf(String str) {
        return (bmj0) Enum.valueOf(bmj0.class, str);
    }

    public static bmj0[] values() {
        return (bmj0[]) b.clone();
    }
}
