package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eaj0 {
    public static final eaj0 a;
    public static final /* synthetic */ eaj0[] b;

    static {
        eaj0 eaj0Var = new eaj0("CloseButtonClicked", 0);
        a = eaj0Var;
        b = new eaj0[]{eaj0Var};
    }

    public static eaj0 valueOf(String str) {
        return (eaj0) Enum.valueOf(eaj0.class, str);
    }

    public static eaj0[] values() {
        return (eaj0[]) b.clone();
    }
}
