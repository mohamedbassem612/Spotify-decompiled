package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ize1 {
    public static final ize1 a;
    public static final /* synthetic */ ize1[] b;

    static {
        ize1 ize1Var = new ize1("SwitchToggled", 0);
        a = ize1Var;
        b = new ize1[]{ize1Var};
    }

    public static ize1 valueOf(String str) {
        return (ize1) Enum.valueOf(ize1.class, str);
    }

    public static ize1[] values() {
        return (ize1[]) b.clone();
    }
}
