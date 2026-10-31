package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ja7 {
    public static final ja7 a;
    public static final ja7 b;
    public static final ja7 c;
    public static final ja7 d;
    public static final /* synthetic */ ja7[] e;

    static {
        ja7 ja7Var = new ja7("NO_CARDS_MIXED", 0);
        a = ja7Var;
        ja7 ja7Var2 = new ja7("NO_CARDS_AUDIOBOOKS_ONLY", 1);
        b = ja7Var2;
        ja7 ja7Var3 = new ja7("PERSONALIZED_RECOMMENDATIONS_DISABLED", 2);
        c = ja7Var3;
        ja7 ja7Var4 = new ja7("NO_CONNECTION", 3);
        d = ja7Var4;
        e = new ja7[]{ja7Var, ja7Var2, ja7Var3, ja7Var4};
    }

    public static ja7 valueOf(String str) {
        return (ja7) Enum.valueOf(ja7.class, str);
    }

    public static ja7[] values() {
        return (ja7[]) e.clone();
    }
}
