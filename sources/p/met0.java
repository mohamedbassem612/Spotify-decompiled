package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class met0 {
    public static final met0 a;
    public static final met0 b;
    public static final met0 c;
    public static final met0 d;
    public static final /* synthetic */ met0[] e;

    static {
        met0 met0Var = new met0("OnPauseClicked", 0);
        a = met0Var;
        met0 met0Var2 = new met0("OnResumeClicked", 1);
        b = met0Var2;
        met0 met0Var3 = new met0("OnPlayLinearClicked", 2);
        c = met0Var3;
        met0 met0Var4 = new met0("OnPlayShuffleClicked", 3);
        d = met0Var4;
        e = new met0[]{met0Var, met0Var2, met0Var3, met0Var4};
    }

    public static met0 valueOf(String str) {
        return (met0) Enum.valueOf(met0.class, str);
    }

    public static met0[] values() {
        return (met0[]) e.clone();
    }
}
