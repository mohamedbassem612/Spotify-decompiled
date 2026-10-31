package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class adc0 {
    public static final adc0 a;
    public static final /* synthetic */ adc0[] b;

    static {
        adc0 adc0Var = new adc0("AddSongsClicked", 0);
        a = adc0Var;
        b = new adc0[]{adc0Var};
    }

    public static adc0 valueOf(String str) {
        return (adc0) Enum.valueOf(adc0.class, str);
    }

    public static adc0[] values() {
        return (adc0[]) b.clone();
    }
}
