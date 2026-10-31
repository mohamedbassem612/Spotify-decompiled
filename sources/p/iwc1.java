package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iwc1 {
    public static final iwc1 a;
    public static final iwc1 b;
    public static final iwc1 c;
    public static final /* synthetic */ iwc1[] d;

    static {
        iwc1 iwc1Var = new iwc1("WHERE_TO_PLAY", 0);
        a = iwc1Var;
        iwc1 iwc1Var2 = new iwc1("GOOGLE_INTENT_ENGINE", 1);
        b = iwc1Var2;
        iwc1 iwc1Var3 = new iwc1("BLE_PROXIMITY", 2);
        c = iwc1Var3;
        d = new iwc1[]{iwc1Var, iwc1Var2, iwc1Var3};
    }

    public static iwc1 valueOf(String str) {
        return (iwc1) Enum.valueOf(iwc1.class, str);
    }

    public static iwc1[] values() {
        return (iwc1[]) d.clone();
    }
}
