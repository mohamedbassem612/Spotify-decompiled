package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fnh1 {
    public static final fnh1 a;
    public static final /* synthetic */ fnh1[] b;

    static {
        fnh1 fnh1Var = new fnh1("CardClicked", 0);
        a = fnh1Var;
        b = new fnh1[]{fnh1Var};
    }

    public static fnh1 valueOf(String str) {
        return (fnh1) Enum.valueOf(fnh1.class, str);
    }

    public static fnh1[] values() {
        return (fnh1[]) b.clone();
    }
}
