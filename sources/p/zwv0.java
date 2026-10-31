package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwv0 {
    public static final zwv0 a;
    public static final zwv0 b;
    public static final /* synthetic */ zwv0[] c;

    static {
        zwv0 zwv0Var = new zwv0("LINEAR", 0);
        a = zwv0Var;
        zwv0 zwv0Var2 = new zwv0("PREMIUM_PLAY_MODES_UPSELL", 1);
        b = zwv0Var2;
        c = new zwv0[]{zwv0Var, zwv0Var2};
    }

    public static zwv0 valueOf(String str) {
        return (zwv0) Enum.valueOf(zwv0.class, str);
    }

    public static zwv0[] values() {
        return (zwv0[]) c.clone();
    }
}
