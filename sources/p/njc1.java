package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class njc1 {
    public static final njc1 a;
    public static final /* synthetic */ njc1[] b;

    static {
        njc1 njc1Var = new njc1("ButtonClicked", 0);
        a = njc1Var;
        b = new njc1[]{njc1Var};
    }

    public static njc1 valueOf(String str) {
        return (njc1) Enum.valueOf(njc1.class, str);
    }

    public static njc1[] values() {
        return (njc1[]) b.clone();
    }
}
