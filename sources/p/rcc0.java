package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rcc0 {
    public static final rcc0 a;
    public static final /* synthetic */ rcc0[] b;

    static {
        rcc0 rcc0Var = new rcc0("OnClick", 0);
        a = rcc0Var;
        b = new rcc0[]{rcc0Var};
    }

    public static rcc0 valueOf(String str) {
        return (rcc0) Enum.valueOf(rcc0.class, str);
    }

    public static rcc0[] values() {
        return (rcc0[]) b.clone();
    }
}
