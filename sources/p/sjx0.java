package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sjx0 {
    public static final sjx0 a;
    public static final sjx0 b;
    public static final sjx0 c;
    public static final /* synthetic */ sjx0[] d;

    static {
        sjx0 sjx0Var = new sjx0("PASS_THROUGH", 0);
        a = sjx0Var;
        sjx0 sjx0Var2 = new sjx0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = sjx0Var2;
        sjx0 sjx0Var3 = new sjx0("DISCARDING", 2);
        c = sjx0Var3;
        d = new sjx0[]{sjx0Var, sjx0Var2, sjx0Var3};
    }

    public static sjx0 valueOf(String str) {
        return (sjx0) Enum.valueOf(sjx0.class, str);
    }

    public static sjx0[] values() {
        return (sjx0[]) d.clone();
    }
}
