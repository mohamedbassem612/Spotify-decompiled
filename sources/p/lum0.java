package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lum0 {
    public static final lum0 a;
    public static final /* synthetic */ lum0[] b;

    static {
        lum0 lum0Var = new lum0("ExplorePremiumClicked", 0);
        a = lum0Var;
        b = new lum0[]{lum0Var};
    }

    public static lum0 valueOf(String str) {
        return (lum0) Enum.valueOf(lum0.class, str);
    }

    public static lum0[] values() {
        return (lum0[]) b.clone();
    }
}
