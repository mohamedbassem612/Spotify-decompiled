package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class thj1 {
    public static final thj1 a;
    public static final thj1 b;
    public static final thj1 c;
    public static final /* synthetic */ thj1[] d;

    static {
        thj1 thj1Var = new thj1("OnTurnOffMixClicked", 0);
        a = thj1Var;
        thj1 thj1Var2 = new thj1("OnSwitchToVideoClicked", 1);
        b = thj1Var2;
        thj1 thj1Var3 = new thj1("OnSwitchToAudioClicked", 2);
        c = thj1Var3;
        d = new thj1[]{thj1Var, thj1Var2, thj1Var3};
    }

    public static thj1 valueOf(String str) {
        return (thj1) Enum.valueOf(thj1.class, str);
    }

    public static thj1[] values() {
        return (thj1[]) d.clone();
    }
}
