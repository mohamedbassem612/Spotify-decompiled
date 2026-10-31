package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wbk1 {
    public static final wbk1 a;
    public static final wbk1 b;
    public static final wbk1 c;
    public static final /* synthetic */ wbk1[] d;

    static {
        wbk1 wbk1Var = new wbk1("CURRENT_USER", 0);
        a = wbk1Var;
        wbk1 wbk1Var2 = new wbk1("OTHER_USER", 1);
        b = wbk1Var2;
        wbk1 wbk1Var3 = new wbk1("PREVIEW_CURRENT_USER", 2);
        c = wbk1Var3;
        d = new wbk1[]{wbk1Var, wbk1Var2, wbk1Var3};
    }

    public static wbk1 valueOf(String str) {
        return (wbk1) Enum.valueOf(wbk1.class, str);
    }

    public static wbk1[] values() {
        return (wbk1[]) d.clone();
    }
}
