package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sjk1 {
    public static final sjk1 a;
    public static final /* synthetic */ sjk1[] b;

    static {
        sjk1 sjk1Var = new sjk1("Visible", 0);
        a = sjk1Var;
        b = new sjk1[]{sjk1Var, new sjk1("Invisible", 1), new sjk1("Gone", 2)};
    }

    public static sjk1 valueOf(String str) {
        return (sjk1) Enum.valueOf(sjk1.class, str);
    }

    public static sjk1[] values() {
        return (sjk1[]) b.clone();
    }
}
