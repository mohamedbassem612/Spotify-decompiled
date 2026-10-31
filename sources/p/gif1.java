package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gif1 {
    public static final gif1 a;
    public static final /* synthetic */ gif1[] b;

    static {
        gif1 gif1Var = new gif1("CardClicked", 0);
        a = gif1Var;
        b = new gif1[]{gif1Var, new gif1("CtaButtonClicked", 1)};
    }

    public static gif1 valueOf(String str) {
        return (gif1) Enum.valueOf(gif1.class, str);
    }

    public static gif1[] values() {
        return (gif1[]) b.clone();
    }
}
