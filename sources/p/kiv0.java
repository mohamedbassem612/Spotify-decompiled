package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kiv0 {
    public static final kiv0 a;
    public static final /* synthetic */ kiv0[] b;

    static {
        kiv0 kiv0Var = new kiv0("PREROLL_DISABLED", 0);
        a = kiv0Var;
        b = new kiv0[]{kiv0Var};
    }

    public static kiv0 valueOf(String str) {
        return (kiv0) Enum.valueOf(kiv0.class, str);
    }

    public static kiv0[] values() {
        return (kiv0[]) b.clone();
    }
}
