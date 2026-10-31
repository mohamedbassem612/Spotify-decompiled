package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kbk0 {
    public static final kbk0 a;
    public static final kbk0 b;
    public static final kbk0 c;
    public static final kbk0 d;
    public static final /* synthetic */ kbk0[] e;

    static {
        kbk0 kbk0Var = new kbk0("OnPauseClicked", 0);
        a = kbk0Var;
        kbk0 kbk0Var2 = new kbk0("OnResumeClicked", 1);
        b = kbk0Var2;
        kbk0 kbk0Var3 = new kbk0("OnPlayLinearClicked", 2);
        c = kbk0Var3;
        kbk0 kbk0Var4 = new kbk0("OnPlayShuffleClicked", 3);
        d = kbk0Var4;
        e = new kbk0[]{kbk0Var, kbk0Var2, kbk0Var3, kbk0Var4};
    }

    public static kbk0 valueOf(String str) {
        return (kbk0) Enum.valueOf(kbk0.class, str);
    }

    public static kbk0[] values() {
        return (kbk0[]) e.clone();
    }
}
