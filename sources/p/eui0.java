package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eui0 {
    public static final eui0 a;
    public static final /* synthetic */ eui0[] b;

    static {
        eui0 eui0Var = new eui0("CardClicked", 0);
        a = eui0Var;
        b = new eui0[]{eui0Var};
    }

    public static eui0 valueOf(String str) {
        return (eui0) Enum.valueOf(eui0.class, str);
    }

    public static eui0[] values() {
        return (eui0[]) b.clone();
    }
}
