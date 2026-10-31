package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e881 {
    public static final e881 a;
    public static final /* synthetic */ e881[] b;

    static {
        e881 e881Var = new e881("CtaButtonClicked", 0);
        a = e881Var;
        b = new e881[]{e881Var};
    }

    public static e881 valueOf(String str) {
        return (e881) Enum.valueOf(e881.class, str);
    }

    public static e881[] values() {
        return (e881[]) b.clone();
    }
}
