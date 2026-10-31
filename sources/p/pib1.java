package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pib1 {
    public static final pib1 a;
    public static final /* synthetic */ pib1[] b;

    static {
        pib1 pib1Var = new pib1("StartJamClicked", 0);
        a = pib1Var;
        b = new pib1[]{pib1Var};
    }

    public static pib1 valueOf(String str) {
        return (pib1) Enum.valueOf(pib1.class, str);
    }

    public static pib1[] values() {
        return (pib1[]) b.clone();
    }
}
